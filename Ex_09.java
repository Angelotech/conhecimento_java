import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("pfv digite um numero de 0 a 10, para saber sua tabuada");
        numero = input.nextInt();

        for(int c = 1; c < 11; c++){
            System.out.println(numero  + " x " + c + " = " + (c*numero));
        }input.close();


        
    }
}
