package eva3_2_valor_maximo;

public class EVA3_2_VALOR_MAXIMO {

    public static void main(String[] args) {
        System.out.println(buscarMaximo(100, 200));

        int resu = buscarMaximo(100, 200);
        System.out.println(resu);

        buscarMaximo(100, 200);
    }

    public static int buscarMaximo(int val1, int val2) {
        if (val1 > val2) {
            return val1;
        } else {
            return val2;
        }
    }
}
