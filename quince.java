import java.util.Scanner;

public class quince {
    public static void main(String[] args) {
        double num;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num=ent.nextDouble();
        if(num>0){
            System.out.println("Es positivo");

        }else if(num<0){
            System.out.println("Es negativo");
        }else{
                System.out.println("Es nulo");
        }
    }
    
}
