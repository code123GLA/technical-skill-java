import java.util.Scanner;
public class uppelower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int uppercount = 0;
        int lowercount = 0;
        for(int i =0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch>='A' && ch<='Z'){
                uppercount++;

            }
            else if(ch>='a' && ch<='z'){
                lowercount++;
            }
            System.out.println("upper count letter os " + uppercount );
            System.out.println("lower count letter is " + lowercount);

        }

    }
    
}
