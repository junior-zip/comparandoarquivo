package entities;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Product {

    private String username;
    private Date moment;

    public Product() {
    }

    public Product(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return username.equals(product.username) && moment.equals(product.moment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, moment);
    }
}

