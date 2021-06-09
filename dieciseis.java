import java.util.Scanner;

public class dieciseis {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1=ent.nextDouble();
        System.out.println("Ingrese otro numero: ");
        num2=ent.nextDouble();
        System.out.println("Ingrese otro numero: ");
        num3=ent.nextDouble();
        if(num1>num2&&num1>num3){
            System.out.println("El numoero "+num1+" Es mayor");

        }else if(num2>num1 && num2>num3){
            System.out.println("El numero "+num2+" Es mayor");
            
        }else{
            System.out.println("El numero "+num3+" Es mayor");
        }
    }
    
}
