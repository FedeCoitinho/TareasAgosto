import java.util.Scanner;
public class metodos {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.print("Ingrese el código del expediente: ");
        String codExpediente = imput.nextLine();

        codExpediente = codExpediente.trim().toUpperCase();
        
        if (codExpediente.length() == 8) {
            System.out.println("El código de expediente es válido: " + codExpediente);
        } else {
            System.out.println("El código de expediente es inválido. Debe tener exactamente 8 caracteres.");
        }

        imput.close();

    }
}
