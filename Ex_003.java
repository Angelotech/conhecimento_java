//*faça um programa que mostre dois numeros inteiros e mais  */

import java.util.Scanner;

public class Ex_003 {

    public static void main(String args[]){
        int  ineiro;
        int inneiro;
        double  real;
        Scanner input = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        inneiro = input.nextInt();
        System.out.println("pfv digite o segundo numero inteiro");
        ineiro = input.nextInt();
        System.out.println("digite agora o numero real");
        real = input.nextDouble();
        System.out.print("o resultado do a: " + ( (inneiro * 2) * (ineiro/2)));
        System.out.print(" o rsultado da b: " + ( (inneiro * 3) + real));
        System.out.print(" o resultado do c: "+ ( Math.pow(real,3)));
        input.close();

        

    }

}