import java.util.Scanner;

public class nueve {
    public static void main(String[] args) {
        String palab1,palab2;
        String aux1,aux2;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        palab1=ent.nextLine();
        System.out.println("Ingrese otra palabra: ");
        palab2=ent.nextLine();
        aux1=palab1;
        aux2=palab2;
        palab1=aux2;
        palab2=aux1;
        System.out.println("Primera palabra: "+palab1);
        System.out.println("Segunda palabra: "+palab2);
    }
    
}
