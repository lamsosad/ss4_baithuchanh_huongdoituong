import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai(m): ");
        double width = input.nextDouble();
        System.out.println("Nhap chieu rong(m): ");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hinh chu nhat la: "+rectangle.display());
        System.out.println("Chu vi hinh chu nhat la: "+rectangle.getPerimeter()+" (m)");
        System.out.println("Dien tich hinh chu nhat la: "+rectangle.getAcreage()+" (m^2)");
    }
}