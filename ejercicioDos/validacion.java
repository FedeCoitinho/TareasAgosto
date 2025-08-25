import java.util.Scanner;
public class validacion {
    public static void main(String[] args) {
    
        Scanner imput = new Scanner(System.in);
        int numeroIdentificacion;
        int intentos = 0;
    

        while (intentos < 3) {
            System.out.println("Bienvenido al sistema de censo.");
            System.out.println("Por favor ingrese su nombre:");
            String nombre = imput.nextLine();
            System.out.println("Hola, " + nombre + " por favor ingrese su número de identificación:");
            numeroIdentificacion = imput.nextInt();

            if (numeroIdentificacion > 0) {
                System.out.println("Número de identificación válido.");
                break;
            } else {
                intentos++;
                System.out.println("Error: Número de identificación inválido. Intento " + intentos + " de 3.");
            }
        }


        //bloqueo
        if (intentos == 3) {
            System.out.println("Usuario bloqueado por superar los intentos.");
        }

    imput.close();
    
    }

}
