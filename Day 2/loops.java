import java.util.*;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Num: ");
        // int b=sc.nextInt();
        // int a =1;
        // int c=0;
        // while(a<=b){
        //     c += a;
        //     System.out.print(a+ " "+ c+ "\n");a++;
        // }
        // for(int i =0;i<4;i++){
        //     System.out.println("****");

        // }
        int ab =6458;
        int rev =0;
        while(ab>0){
            rev = (rev*10)+ab %10;
            ab /= 10;
           

        } System.out.print(rev);
    }
}
