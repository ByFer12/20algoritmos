import java.util.Scanner;

public class primero {
    public static void main(String[] args) {
        double num1,num2,suma;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1=ent.nextDouble();
        System.out.println("Ingrese otro numero");
        num2=ent.nextDouble();
        suma=num1+num2;
        System.out.println("El resultado de la suma es: "+suma);
    }
}
