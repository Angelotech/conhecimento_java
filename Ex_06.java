import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 0;
        int soma = 0;

        System.out.println("pfv digite 5 numeros");
        for(int c = 1; c < 6; c++){
            System.out.println("digite o numero " + c);
            m = input.nextInt();
            soma += m;

        }
        System.out.println("a soma dos numeros foi " + soma + " e a media é " + (soma/5));
        input.close();

    
    }

}
