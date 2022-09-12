import java.util.Scanner;
public class Ex_01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;
        boolean not = true;

        System.out.println("pfv digite uma nota entre 0 e 10");

        do {
            nota = input.nextInt();

            if ( nota >= 0 && nota <= 10) {
                System.out.println("valor correto sua nota foi: " + nota);
                not = true;
            }else{
                System.out.println("valor invalido digite o que se pede");  
                System.out.println("pfv digite uma nota entre 0 e 10");
                not = false;
            }
                
        }while(!not);
        input.close();

        
       

 
    }

}