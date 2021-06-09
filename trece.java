import java.util.Scanner;

public class trece {
    public static void main(String[] args) {
        double radio,altura,volumen;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        radio= ent.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura= ent.nextDouble();
        if(radio>0 && altura>0){
            volumen=(int)((Math.PI)*radio*radio*altura);
            System.out.println("El volumen es: "+volumen);


        }else{

            System.out.println("Los valores ingresados no son correspondidos, no se puede calcular nada");
        }
    }
    
}
