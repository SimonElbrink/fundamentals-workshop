package se.lexicon.simon.workshop.week6.pen.model;


import se.lexicon.simon.workshop.week6.pen.dao.PenSequencer;

import java.util.Objects;

public class Pen {

    private final int id;
    private String brand;
    private String color;

    public Pen(int id, String brand, String color) {
        this.id = id;
        setBrand(brand);
        setColor(color);
    }

    public Pen(String brand, String color) {
        this(PenSequencer.getNextPenId(), brand, color);
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return getId() == pen.getId() &&
                Objects.equals(getBrand(), pen.getBrand()) &&
                Objects.equals(getColor(), pen.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBrand(), getColor());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pen{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
