import java.util.Scanner;
public class Ex_002{
    public static void main(String[] args) {
        try(Scanner ler = new Scanner(System.in)){;
            System.out.println("digite quanto vc ganhar por hora: ");
            double hora = ler.nextDouble();
            System.out.println("agora digite quantas horas vc trablhar no mês: ");
            int valor = ler.nextInt();
            double salario = (valor * hora);
            System.out.println("o seu salario por mês é de : " + (salario));



        }
        
        


        

        
    }
}