import java.util.Scanner;

public class primero {
    public static void main(String[] args) {
        double numero1, numero2, suma;
        Scanner ent = new Scanner(System.in);
        System.out.println("ingrese un numero");
        numero1=ent.nextDouble();
        System.out.println("Ingrese otro numero");
        numero2=ent.nextDouble();
        suma=numero1+numero2;
        System.out.println("El resultado de la suma es: "+suma);
        
    }
}
