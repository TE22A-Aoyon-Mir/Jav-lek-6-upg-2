import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("Del a");
        System.out.println("Ange ett tal: ");
        int tal1 = t.nextInt();
        int x = 500;
        tal1+=x;
        tal1/=1000;
        tal1*=1000;
        System.out.println("Talet avrundat blir "+tal1);
    }
}
