import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.print("a = ");
        triangle.a = new Scanner(System.in).nextInt();
        System.out.print("b = ");
        triangle.b = new Scanner(System.in).nextInt();
        System.out.print("c = ");
        triangle.c = new Scanner(System.in).nextInt();
        triangle.area();

    }
}