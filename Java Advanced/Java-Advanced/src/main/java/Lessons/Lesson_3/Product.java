package Lessons.Lesson_3;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_name", nullable = false, length = 30)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "standard_cost", nullable = false)
    private double standardCost;

    @Column(name = "list_price", nullable = false)
    private double listPrice;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(double standardCost) {
        this.standardCost = standardCost;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
