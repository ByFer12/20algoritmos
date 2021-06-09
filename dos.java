import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        String pais, capi;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el pais: ");
        pais=ent.nextLine();
        System.out.println("Ingrese el capital: ");
        capi=ent.nextLine();
        System.out.println(capi+" Es capital de "+pais);
    }
    
}
