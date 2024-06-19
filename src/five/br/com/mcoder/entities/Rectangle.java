package five.br.com.mcoder.entities;

import five.br.com.mcoder.entities.enums.Color;

public class Rectangle extends Shape{

    private Double widht;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Color color, Double widht, Double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return widht * height;
    }
}
