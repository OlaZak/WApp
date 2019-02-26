package model;

import java.util.Objects;

public class Product1_0 {

    public Product1_0(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;
    private int marketId;

    public Product1_0() { }

    public Product1_0(int id, String name, int marketId) {
        this.id = id;
        this.name = name;
        this.marketId = marketId;
    }

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

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product1_0 product = (Product1_0) o;
        return getId() == product.getId() &&
                getMarketId() == product.getMarketId() &&
                Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMarketId());
    }

    @Override
    public String toString() {
        return "Product1_0{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marketId=" + marketId +
                '}';
    }
}
