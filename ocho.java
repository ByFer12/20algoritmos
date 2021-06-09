import java.util.Scanner;


public class ocho {
    public static void main(String[] args) {
        double num1,num2,num3,prom;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese Un numero: ");
        num1=ent.nextInt();
        System.out.println("Ingrese otro NUmero: ");
        num2=ent.nextInt();
        System.out.println("Igrese otro numero: ");
        num3=ent.nextInt();
        prom=(num1+num2+num3)/3;
        System.out.println("El promedio de los dos es: "+prom);
    }
     
}
