import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        int numero;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero= ent.nextInt();
        numero++;
        System.out.println("El siguiente numero es: "+numero);

    }
    
}
