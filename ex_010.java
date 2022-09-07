//6. Faça um Programa que leia três números e mostre o maior deles
//.Faça um Programa que leia três números e mostre o maior e o menor deles
import java.util.Scanner;
public class ex_010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int menor;
        int maior;

        System.out.println("digite 3 numeros para saber o maior");
        System.out.println("digite o primeiro");
        num1 = input.nextInt();
        System.out.println("digite o segundo");
        num2 = input.nextInt();
        System.out.println("digite o terceiro");
        num3 = input.nextInt();

        maior = Math.max(num1, Math.max(num2, num3));
        menor = Math.min(num1, Math.min(num2, num3));
        System.out.println("o maior valor foi: " + maior + " é o menor foi: " + menor);
        input.close();
    }
    
}
