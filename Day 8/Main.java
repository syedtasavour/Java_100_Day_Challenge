import java.util.*;

public class Main {
       void logic (int n) {
        int j=0;int i=1;
        for (n=n;n>0;n--){
            System.out.print(j+"  ");
            int sum = j+i;
            j =i;
            i = sum;


        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = scanner.nextInt();
        obj.logic(n);


    }
}
