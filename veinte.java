import java.util.Scanner;

public class veinte {
    public static void main(String[] args) {
        int num,residuo,invertir=0;
        int aux;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num=ent.nextInt();
        aux=num;
        while(num!=0){
            residuo=num%10;
            invertir= invertir*10+residuo;
            num=num/10;

        }
        if(aux==invertir){
            System.out.println("El número es capicúa");

        }else{
            System.out.println("El numero no es capicúa");
        }
        
    }
    
}
