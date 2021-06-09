import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        int numero,cuadrado,cubo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero= ler.nextInt();
        cuadrado=numero*numero;
        cubo=numero*numero*numero;
        System.out.println("El cuadrado de ese numero es: "+cuadrado);
        System.out.println("El cubo de ese numero es: "+cubo);

    }
    
}
