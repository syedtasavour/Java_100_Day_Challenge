public class linearSearch {
    public static int lin(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key ==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                 arr[0]=j;
                 arr[1]=i;
                 
                }
            }

        }return arr;
    }
    public static boolean isPalindrome(int x) {
        int save = x;
        int n = 0;
        int y =0;
        while(n>0){
        n = x%10;
        y = y * 10 +n;
        x = x/10;
        }if(save==n){
            return true;

        }else{
            return false;
        }

    }
    public static void main(String args[]){
        int m[]= {1,22,4,5,6,7,8564,34,53};
        int key =3;
        boolean n= isPalindrome(121);
        System.out.print(n);
    }
}
