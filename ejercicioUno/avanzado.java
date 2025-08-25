import java.util.Scanner;
public class avanzado {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de control de acceso.");
            Scanner imput = new Scanner(System.in);


            // variables
            String usuario = "admin";   
            String contra = "A1b2C3d4";

            // ingreso de datos
            System.out.print("Ingrese nombre usuario: ");
            String usuIng = imput.nextLine();
            System.out.print("Ingrese contraseña: ");
            String contraIng = imput.nextLine().trim();

            // validacion de acceso

            if (usuIng.equals(usuario) && contraIng.equals(contra)) {
                System.out.println("Acceso concedido.");
                
                // nivel de prioridad
            System.out.print("Ingrese código de prioridad (A, B, C): ");
            char codigoPrioridad = imput.nextLine().toUpperCase().charAt(0);
            
            switch (codigoPrioridad) {
            case 'A':
                System.out.println("Nivel de prioridad: Crítico.");
                break;
            case 'B':
                System.out.println("Nivel de prioridad: Alto.");
                break;
            case 'C':
                System.out.println("Nivel de prioridad: Normal.");
                break;
            default:
                System.out.println("Nivel de prioridad: Bajo.");
                break;

            }
            } else if (usuIng.equals(usuario)) {
                System.out.println("Error de contraseña.");
            } else if (contraIng.equals(contra)) {
                System.out.println("Error de usuario.");
            } else {
                System.out.println("Acceso denegado.");
            }

            

        imput.close();
    }
}


