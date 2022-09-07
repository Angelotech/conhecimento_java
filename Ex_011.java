//faça um programa que pergunte o preço de três produtos e informe 
//qual produto você deve comprar, sabendo que a decisão é sempre 
//pelo mais barato.
import java.util.Scanner;
public class Ex_011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double menor;

        System.out.println("digite 3 numeros para saber o maior");
        System.out.println("digite o primeiro preço");
        num1 = input.nextDouble();
        System.out.println("digite o segundo preço");
        num2 = input.nextDouble();
        System.out.println("digite o terceiro preço");
        num3 = input.nextDouble();
        menor = Math.min(num1, Math.min(num2, num3));
        System.out.println("compre o de : " + menor + " R$");
        input.close();
      


        
    }
        
    
}
