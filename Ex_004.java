import java.util.Scanner;
public class Ex_004 {
    public static void main(String[] args) {
        double altura;
        Scanner input = new Scanner(System.in);

        System.out.println("pfv digite sua altura");
        altura = input.nextDouble();
        System.out.println("o seu peso ideal é:" + ((72.7* altura)-58));
        input.close();
        

        
    }
}
