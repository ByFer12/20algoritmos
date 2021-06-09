import java.util.Scanner;

public class catorce {
    public static void main(String[] args) {
        double num, num1;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num=ent.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num1=ent.nextDouble();
        if(num%num1==0){
            System.out.println("Son divisibles");

        }else{
            System.out.println("No son divisibles");
        }
    }
    
}
