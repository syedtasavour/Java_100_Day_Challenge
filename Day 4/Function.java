import java.util.*;
public class Function {

    public static int CalSum(int a, int b){
        return a+b;
    }
    public static void main (String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value One: ");
        int a = sc.nextInt();
        System.out.print("Enter Value Two: ");
        int b = sc.nextInt();
        System.out.print(CalSum(a,b));


    }
    
}
