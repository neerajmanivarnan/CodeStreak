import java.util.Scanner;

public class colorsSol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int result =0;
        int max=0;
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>0){
                result = result + arr[i];
            }
        
        }
        if(result == 0){
            System.out.println(findMax(arr));
        }else{
            System.out.println(result);
        }
        
    }

    private static int findMax(int[] arr) {
       int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }
}
