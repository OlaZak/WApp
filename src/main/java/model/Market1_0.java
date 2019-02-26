package model;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Market1_0 {
    private int id;
    private String nameMarket;
    public Map<String, ArrayList<Product1_0>> services;

    public Market1_0() { }

    public Market1_0(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    public Market1_0(int id, String nameMarket) {
        this.id = id;
        this.nameMarket = nameMarket;
    }

    @Override
    public String toString() {
        return "Market1_0{" +
                "id=" + id +
                ", nameMarket='" + nameMarket + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Market1_0 market = (Market1_0) o;
        return getId() == market.getId() &&
                Objects.equals(getNameMarket(), market.getNameMarket()) &&
                Objects.equals(services, market.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNameMarket(), services);
    }
}
