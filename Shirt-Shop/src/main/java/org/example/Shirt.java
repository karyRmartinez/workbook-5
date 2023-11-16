package org.example;

public class Shirt {
    private Color color;
    private Size size;

    private String description;

    public Shirt(Color color, Size size) {
        this.color = color;

        this.size = size;
    }
    // Getters
    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }
    public void shirtInfo() {
        System.out.println("Shirt Information:");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
    }
}
