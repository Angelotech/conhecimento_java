import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int nu;
        int num;
        int soma = 0;

        System.out.println("pfv digite seu numero para ver o intervalo entre eles:");
        System.out.println("digite o primeiro numero: ");
        nu = input.nextInt();
        System.out.println("digite os segundo numero");
        num = input.nextInt();

        for(int c = nu+1; c < num; c++){
            soma += c;
            System.out.print(c + " ");
        }
        System.out.println(soma);
        input.close();  
    }
}
