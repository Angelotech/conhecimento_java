import java.util.Scanner;
/*O Sr. Manoel Joaquim expandiu seus negócios para além dos 
negócios de 1,99 e agora possui uma loja de conveniências. Faça um 
programa que implemente uma caixa registradora rudimentar. O 
programa deverá receber um número desconhecido de valores 
referentes aos preços das mercadorias. Um valor zero deve ser 
informado pelo operador para indicar o final da compra. O programa 
deve então mostrar o total da compra e perguntar o valor em dinheiro 
que o cliente forneceu, para então calcular e mostrar o valor do troco. 
Após esta operação, o programa deverá voltar ao ponto inicial, para 
registrar a próxima compra. A saída deve ser conforme o exemplo 
abaixo:
o Lojas Tabajara 
o Produto 1: R$ 2.20 */
public class Ex_15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador;
        double valor;
        double soma = 0;
        double dinheiro;
    

        while (true) {
           System.out.println("  ");
            System.out.println("lojas tabajara");
            System.out.println("para finalizar a compra digite [0]"); 
            contador = 1;       
            
            do {
                System.out.println("PRODUTO " + contador +" produto: ");
                valor = input.nextDouble();
                soma += valor;
                contador ++;
            } while (valor !=0);
            System.out.println("TOTAL: R$ " + soma);
            System.out.print("dinheiro: ");
            dinheiro = input.nextDouble();
            System.out.println("troco: "+ (dinheiro - soma));
            input.close();
            
        }
        
    }
}
