import java.util.Scanner;
public class diesciocho {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num, suma;

        System.out.print("\n Ingrese el un Numero de 4 Digitos: ");
        num = scan.nextInt();

        if (num > 999 & num < 10000) {
            suma = (num%10000-num%1000)/1000+(num%1000-num%100)/100+(num%100-num%10)/10+num%10;
            System.out.print("\n La Suma de los Digitos es: "+suma+"\n");
            
        } else {
            System.out.print("\n El Numero no es de 4 Digitos\n");
        }
    }
    
}
