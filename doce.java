import java.util.Scanner;

public class doce {
    public static void main(String[] args) {
        double temp,far;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en celcuis");
        temp=ent.nextDouble();
        far=(9/5)*(temp)+32;
        System.out.println("La temperatura en fahrenheit es: "+far);
    }
}
