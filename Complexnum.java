import java.util.Scanner;

public class Complex1 {
    int real, img;

    public Complex1() {
    }

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of the number");
        real = sc.nextInt();
        System.out.println("Enter the imaginary part of the number");
        img = sc.nextInt();
    }

    public void add(Complex1 other) {
        real += other.real;
        img += other.img;
    }

    public void subtract(Complex1 other) {
        real -= other.real;
        img -= other.img;
    }

    public void multiply(Complex1 other) {
        int tempReal = real * other.real - img * other.img;
        int tempImg = real * other.img + img * other.real;
        real = tempReal;
        img = tempImg;
    }

    public String toString() {
        return real + (img >= 0 ? "+" : "") + img + "i";
    }

    public static void main(String[] args) {
        int m, n;
        Complex1 obj1 = new Complex1();
        Complex1 obj2 = new Complex1();
        obj1.getdata();
        obj2.getdata();

        do {
            System.out.println("Enter the operation to be performed: 1. Addition 2. Subtraction 3. Multiplication");
            Scanner sc = new Scanner(System.in);
            m = sc.nextInt();

            switch (m) {
                case 1:
                    obj1.add(obj2);
                    System.out.println("Addition is: " + obj1);
                    break;
                case 2:
                    obj1.subtract(obj2);
                    System.out.println("Subtraction is: " + obj1);
                    break;
                case 3:
                    obj1.multiply(obj2);
                    System.out.println("Multiplication is: " + obj1);
                    break;
            }

            System.out.println("Do you want to continue? 1. Yes 2. No");
            n = sc.nextInt();
        } while (n == 1);
    }
}
