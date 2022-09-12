import java.util.Scanner;

public class Ext_009 {
    public static void main(String[] args) {
        try(Scanner ler = new Scanner (System.in)){;
            System.out.println("pfv digite a sua primeira nota: ");
            double casa = ler.nextDouble();
            System.out.println("pfv digite a segunda nota: ");
            double caso = ler.nextDouble();
            System.out.println("digite a terceira nota: ");
            double nota =ler.nextDouble();
            double media = ((casa + caso + nota )/3);
            System.out.println("a sua media è: " + (media));

            if(media == 10){
                System.out.println("vc se destacou");
            }else if (media < 7){
                System.out.println("voce foi reprovado");
                
            }else if(media >= 7){
                System.out.println("passou");
            }
                
            

        }
        

    }
    

    
}
