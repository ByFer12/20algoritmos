import java.util.Scanner;

public class diez {
    public static void main(String[] args) {
        double altura,base,area,perim;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese la base ");
        base=ent.nextInt();
        System.out.println("Ingrese la altura");
        altura=ent.nextInt();
        perim=2*(base+altura);
        area=base*altura;
        System.out.println(" El perimetro es de: "+perim);
        System.out.println(" El area es de: "+area);

    }
    
    
}
