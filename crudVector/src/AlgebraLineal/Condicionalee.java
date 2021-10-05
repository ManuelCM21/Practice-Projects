
package AlgebraLineal;

import java.util.Scanner;

public class Condicionalee {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double a = tc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double b = tc.nextDouble();
        if (a < b) {
            System.out.println(a+" es menor que "+b);
        } else if (a == b) {
            System.out.println(a+" es igual que "+b);
        } else {
            System.out.println(a+" es mayor que "+b);
        }
    }
}
