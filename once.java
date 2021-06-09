import java.util.Scanner;

public class once {
    public static void main(String[] args) {
        
    double numero, centrimetros,metros,pulgadas,pies,yardas;
    Scanner ent = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    numero= ent.nextDouble();
    centrimetros=numero*100;
    metros=numero;
    pulgadas=numero*39.3701;
    pies=numero*3.28084;
    yardas= numero*1.09361;
    System.out.println("Los centimetros son: "+centrimetros);
    System.out.println("Los metros son: "+metros);
    System.out.println("Las pulgadas son: "+pulgadas);
    System.out.println("Los pies son: "+pies);
    System.out.println("Las yasdas son: "+yardas);
    
    }
    
    
}
