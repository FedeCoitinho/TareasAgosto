import java.util.Random;
public class monitoreo {
    public static void main(String[] args) {
    
        //Valor de temperatura
    Random random = new Random();
    int temperatura;    

    for (int hora = 1; hora <= 100; hora++) {
        temperatura = random.nextInt(100);
        System.out.println("Hora " + hora + ": Temperatura = " + temperatura + "°C");
        
        if (temperatura > 95) {
            System.out.println("¡Alerta! La temperatura ha superado los 95°C. Deteniendo operación.");
            break;
        } else if (temperatura > 85) {
            System.out.println("Advertencia: La temperatura ha superado los 85°C. Operación crítica.");
        }   
    
        
    }

}
}


