/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_paso_parametros_referencias;

/**
 *
 * @author invitado
 */
public class EVA3_PASO_PARAMETROS_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        System.out.println("La direccion del arreglo es " + arreglo);
        llenarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");

        }
    }

    public static void llenarArreglo(int[] valores) {
        System.out.println("La direccion de valores es " + valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100);

        }

    }
}
