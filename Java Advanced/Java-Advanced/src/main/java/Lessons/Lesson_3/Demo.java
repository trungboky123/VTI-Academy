package Lessons.Lesson_3;

import org.hibernate.Session;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the category name whose products you want to search for: ");
        String categoryName = scanner.nextLine();
        String[] parts = categoryName.trim().split("");
        parts[0] = parts[0].toUpperCase();
        String upperCateName = String.join("", parts);
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Product p WHERE p.category.name = :name";
            List<Product> products = session.createQuery(hql, Product.class).setParameter("name", upperCateName).list();
            if (!products.isEmpty()) {
                for (Product p : products) {
                    System.out.println(p.getName());
                }
            }
            else {
                System.out.println("No product with category " + upperCateName + " found!");
            }
        }
    }
}
