import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x1, x2, d;
        int a, b, c;

        System.out.println("equação: ax² + bx + c = 0");
        System.out.println("sabendo disso, insira os valores de:");
        System.out.print("a: ");
        a = in.nextInt();

        System.out.print("b: ");
        b = in.nextInt();

        System.out.print("c: ");
        c = in.nextInt();

        d = Math.pow(b, 2) - 4 * a * c;

        if(d >= 0) {

            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);

            System.out.println("as raizes são: " + x1 + " e " + x2);

        } else {
            System.out.println("não é possível calcular as raízes.");
        }
    }
}