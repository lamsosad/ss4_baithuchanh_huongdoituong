public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getAcreage() {
        return this.height * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Hinh chu nhat co: { " + " Chieu dai " + width + " (m)" + " , Chieu rong " + height + " (m)" + "}";
    }
}
