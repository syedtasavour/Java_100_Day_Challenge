public class linearSearch {
    public static int lin(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key ==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int m[]= {1,22,4,5,6,7,8564,34,53};
        int key =3;
        System.out.print(lin(m,key));
    }
} 
