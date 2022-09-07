import java.util.Scanner;
public class Ex_007 {
    public static void main(String[] args) {
        int hora;
        double horat;
        double salariob;
        double imposto;
        double inss;
        double sindicato;
        double sliquido;
        Scanner input = new Scanner(System.in);

        System.out.println("digite o numeros de horas trabalhadas: ");
        hora = input.nextInt();
        System.out.println("digite quanto voce ganhar por hora ");
        horat = input.nextDouble();
        salariob = (hora * horat);
        System.out.println("o seu salario bruto é " + salariob);
        imposto = (salariob * 11)/100;
        System.out.println("o seu valor pago para o imposto de renda foi de: " + imposto);
        inss = (salariob * 8)/100;
        System.out.println("o seu inss foi de " + inss);
        sindicato = (salariob * 5)/100;
        System.out.println(" o desconto do sindicato foi de: " + sindicato);
        sliquido =  salariob - ( imposto + inss + sindicato);
        System.out.println(" e o seu desconto liquido é: 200"+ sliquido);
        input.close();
       






        
    }
    


    
}
