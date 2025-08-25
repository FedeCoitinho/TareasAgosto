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

// Nivel Avanzado: Validación de Ingreso de Datos con Reintento
// Consigna: Debe programar un sistema de ingreso de datos para un censo. El
// usuario debe ingresar un número de identificación válido (mayor que 0). Si el
// número ingresado no es válido (menor o igual a 0), el sistema debe mostrar un
// error y pedirle que lo intente nuevamente. Atención: tiene 3 intentos
// unicamente.
// Muestre un mensaje de éxito una vez que el número sea válido o de usuario
// bloqueado si supero los intentos