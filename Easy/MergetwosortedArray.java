import java.util.Scanner;

public class MergetwosortedArray {
    public static int[] mergeTwo(int[] one, int[] two ){
        int[] res = new int[one.length+two.length];
        int i=0,j=0,k=0;
        boolean Flag = true;
        int count = 0;
        while(i<one.length && j<two.length){
            if(one[i]< two[j]){
                res[k]=one[i];
                i++;
                k++;
                if(Flag != true){
                    count++;
                    Flag = true;
                }
            }else{
                res[k] = two[j];
                j++;
                k++;
                if(Flag!=false){
                    count++;
                    Flag = false;
                }
            }
        }
        while(i<one.length){
            res[k] = one[i];
            i++;k++;
            if(Flag!=true){
                Flag = true;
                count++;
            }
        }
        while(j<two.length){
            res[k] = two[j];
            j++;k++;
            if(Flag!=false){
                Flag = false;
                count++;
            }
        }
        if(one[0]<two[0]){
            count++;
        }
        System.out.println(count+"count");
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int[] arr1 = new int[l1];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int l2 = sc.nextInt();
        int[] arr2 = new int[l2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        int[] res = new int[l1+l2];
        res = mergeTwo(arr1,arr2);
        display(res);
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }
}
