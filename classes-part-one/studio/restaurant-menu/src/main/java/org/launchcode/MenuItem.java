package org.launchcode;
import java.util.Date;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category;
    private Date date;

    public MenuItem(double price, String name, String description, String category, Date date) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
