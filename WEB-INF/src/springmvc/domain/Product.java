package springmvc.domain;

import java.io.Serializable;

/**
 *
 * @author ae1
 */
public class Product implements Serializable {

    private String description;
    private Double price;
    private int id;

    public String getDescription() {
        return description;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Description: ").append(description).append(";");
        buffer.append("Price: ").append(price);
        return buffer.toString();
    }
}
