import java.util.Scanner;

public class diescinueve {
    public static void main(String[] args) {
        Double numero;
        numero=Math.random()*1000;
        if(numero%5==0 && numero<=25 ){
            System.out.println("El numero es: "+numero);
            System.out.println("CORRECTO!");


        }else{
            System.out.println("El numero no es multiplo de 5");
        }           
            

     
        
    }

    
}
