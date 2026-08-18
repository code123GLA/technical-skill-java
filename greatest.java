import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = sc.nextInt();
        System.out.print("Enter b number ");
        int b = sc.nextInt();
        System.out.print("Enter c number ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);

        }
        else{
            System.out.println(c +" big" );
        }
        
    }
    
}
