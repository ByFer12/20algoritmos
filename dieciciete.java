import java.util.Scanner;

public class dieciciete {
    public static void main(String[] args) {
        double lado1,lado2,lado3;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el primer lado: ");
        lado1=ent.nextDouble();
        System.out.println("Ingrese el segundo lado: ");
        lado2=ent.nextDouble();
        System.out.println("Ingrese el tercer lado: ");
        lado3=ent.nextDouble();
        if(lado1==lado2 && lado2==lado3){
        System.out.println("Es un triangulo equilatero");
        }else if(lado1==lado2 || lado2==lado3 || lado1==lado3){
        System.out.println("El triangulo es isoseles");
        }else{
        System.out.println("El triangulo es escaleno");
    }
    
    }
    
}
