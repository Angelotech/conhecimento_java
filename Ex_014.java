import java.util.Scanner;
public class Ex_014 {
    /*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende  */
    public static void main(String[] args) {
        double  preço;
        Scanner input = new Scanner(System.in);

        System.out.println("digite o valor do pão para saber o preço");
        preço = input.nextDouble();

        for(int c = 1; c < 51; c++){
            System.out.println(c + " = R$ " + (c * preço));

        }input.close();



        
    }
}
