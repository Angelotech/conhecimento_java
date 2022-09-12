import java.util.Scanner;
public class Ex_012 {
    public static void main(String[] args) {
        /* Faça um programa que peça 10 números inteiros, calcule e mostre a 
quantidade de números pares e a quantidade de números impares*/
    int num = 0;
    int par = 0;
    int impar = 0 ;

    Scanner input = new Scanner(System.in);

    System.out.println("pfv digite 10 numeros para saber a quantidade de impar e pares !");

    for(int c = 1; c< 11; c++){
        System.out.println("digite o numero "+ c);
        num = input.nextInt();
        if (num %2 == 0) {
            par ++;
             
        } else {
            impar ++;  
        }
    }   System.out.println("os valores pares são " + par + " os valores impares são " + impar);
        input.close();  

    
    }
}
