import java.util.Scanner;



public class Exicicio {
    public static void main(String[] args){
       try(Scanner scan = new Scanner (System.in)){;
        System.out.println("digite se nome: " );
        String NomeCompleto = scan.nextLine();
        System.out.println("o seu nome é "+ (NomeCompleto));

        System.out.println("digite seu primeiro nome: ");
        String PrimeiroNome = scan.next();
        System.out.println("o sue primeiro nome é " + PrimeiroNome + NomeCompleto);
        System.out.println("digite sua idade");     
        int Idade = scan.nextInt();
        System.out.println("é a sua idade é " + Idade);
        for(int i = 0; i >=5; i++){
            System.out.println(i);
        }
        
        }
        
        
   
        
    }

    
}