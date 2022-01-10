public abstract class Furniture {
    private String material, design, color;
    private double height, length, width, price;
    public abstract double calcTotal(double taxRate, double discountPct);

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", design='" + design + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                ", price=" + price +
                '}';
    }

    public Furniture() {
        this.material = "unknown";
        this.design = "unknown";
        this.color = "unknown";
        this. height = 5;
        this.length = 5;
        this.width = 5;
        this.price = 5.50;
        this.calcTotal(.10,.10);
    }

    public Furniture(String material, String design, String color, double height, double length, double width, double price,
                     double calcTotal) {
        this.material = material;
        this.design = design;
        this.color = color;
        this.height = height;
        this.length = length;
        this.width = width;
        this.price = price;
        this.calcTotal(calcTotal, calcTotal);
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
