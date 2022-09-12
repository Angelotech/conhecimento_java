public class Ex_03 {
    public static void main(String[] args) {
        int h = 80000;
        int b =  200000;
        int c = 0;

        do {
            System.out.println(h += (h * 0.03));
            System.out.println( b += (b * 0.015));
            System.out.println(c++);
        
            
        } while (h <= b);
        System.out.println("o valor de anos é " + c);

        
    }
}
