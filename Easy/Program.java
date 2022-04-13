import java.util.*;
class Program {
    public static void placeMidLast(int[] arr, int n){
        int mid = n/2;
        int temp = arr[mid];
        
        for(int i=mid;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        placeMidLast(arr,n);
        
    }
}
