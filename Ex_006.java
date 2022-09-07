
import java.util.Scanner;
public class Ex_006 { 

public static void main(String[]args) {
    int peso;
    double multa;
    int exerço;
    Scanner input = new Scanner(System.in);

    System.out.println("PFV DIGITE O PESO DO SEU PEIXE");
    peso = input.nextInt();
    exerço = (peso - 50);
    multa = (4.00 * exerço);
    if(peso <= 50){
        System.out.println("o seu peso esta dentro do limite, você não tem multa");
    }else{
        System.out.println("infelizmente voce passou "+ ( exerço)+ " kilos");
        System.out.println("e a sua multa sera de R$ "+ (multa));
    }input.close();


    
   }
}
