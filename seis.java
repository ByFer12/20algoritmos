import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        int numero, sig;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        numero=ent.nextInt();
        numero=(int)(Math.random()*200);
        sig=(int)(numero+(numero*0.3));
        System.out.println("El numero aleatorio es: "+numero);
        System.out.println("Aumentado en 30% es "+sig);


    }
    
}
