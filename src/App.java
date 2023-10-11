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

        System.out.println("Del b");
        System.out.println("Ange täljaren: ");
        int tä = t.nextInt();
        System.out.println("Ange nämnaren: ");
        int nä = t.nextInt();
        int di = tä/nä;
        tä%=nä;
        System.out.println("Bråket i blandat form är "+di+" "+tä+"/"+nä);
    }
}
