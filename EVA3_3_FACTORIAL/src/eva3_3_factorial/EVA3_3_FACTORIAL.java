package eva3_3_factorial;

import java.util.Scanner;

public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b, p;
        System.out.println("Introduce la base: ");
        b = sc.nextInt();

        System.out.println("Introduce la potencia: ");
        p = sc.nextInt();
        int base = b;
        int potencia = p;
        System.out.println("El resultado de " + base + " elevado a la " + potencia + " es " + calcularPotencia(base, potencia));
    }

    public static int calcularPotencia(int base, int potencia) {
        int guardar = 1;
        for (int i = 1; i <= potencia; i++) {
            guardar = base * guardar;

        }
        return guardar;
    }

}
