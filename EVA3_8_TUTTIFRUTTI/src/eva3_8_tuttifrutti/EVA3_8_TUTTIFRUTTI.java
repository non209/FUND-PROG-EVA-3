package eva3_8_tuttifrutti;

import java.util.Scanner;

public class EVA3_8_TUTTIFRUTTI {

    final static String USUARIO = "TUTI";
    final static String PASSWORD = "FRUTA";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usu, pwd;

        do {
            usu = capturaDatos("Usuario: ");
            pwd = capturaDatos("Contraseña: ");

        } while (!validarUsuario(usu, pwd));
        System.out.println("BIENVENIDO AL SISTEMA :) ");
    }

    public static boolean validarUsuario(String usuario, String pwd) {
        if (usuario.equals(USUARIO) && pwd.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }

    public static String capturaDatos(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        return sc.nextLine();
    }
}
