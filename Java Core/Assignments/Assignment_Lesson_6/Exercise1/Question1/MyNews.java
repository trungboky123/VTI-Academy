package Assignments.Assignment_Lesson_6.Exercise1.Question1;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        News [] news = new News[100];
        int count = 0;
        int choice;
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("Enter your choice(1 - 4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (count >= news.length){
                        System.out.println("Maximum of news reached!");
                        break;
                    }
                    News newss = new News();
                    System.out.println("Enter title: ");
                    newss.setTitle(scanner.nextLine());
                    System.out.println("Enter publish date: ");
                    newss.setPublishDate(scanner.nextLine());
                    System.out.println("Enter author: ");
                    newss.setAuthor(scanner.nextLine());
                    System.out.println("Enter content: ");
                    newss.setContent(scanner.nextLine());

                    int [] rates = new int[3];
                    for(int i = 0; i < 3; i++){
                        System.out.printf("Enter rate %d: ", (i + 1));
                        rates[i] = scanner.nextInt();
                    }
                    scanner.nextLine();
                    newss.setRate(rates);
                    news[count] = newss;
                    count++;
                    break;
                case 2:
                    for(int i = 0; i < count; i++){
                        System.out.printf("New %d: ", (i + 1));
                        System.out.println();
                        news[i].display();
                    }
                    break;
                case 3:
                    for(int i = 0; i < count; i++){
                        news[i].calculate();
                        news[i].display();
                    }
                    break;
                case 4:
                    System.out.println("Exitting program...");
                    System.out.println("Success!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }
}
