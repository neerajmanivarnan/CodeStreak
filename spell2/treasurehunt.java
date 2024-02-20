import java.util.HashMap;
import java.util.Scanner;

public class treasurehunt{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int result;

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int temp;

        // for(int i=0;i<num-1;i++){
        //     for(int j=0;j<num-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        int d = findD(arr);

        boolean flag = ifMiss(arr,d);

        if(flag){
             result = findMiss(arr,d);
        }else{
             result = findMissBT(arr,d);
        }

     

       
        
        System.out.println(result);

    }

    



    private static int findD(int[] arr) {
        int num;
        int result = -1;

       HashMap<Integer,Integer> newMap = new HashMap<>();
       for(int i=0;i<arr.length-1;i++){
        num = arr[i+1] - arr[i];
        if(newMap.containsKey(num)){
            result = num;
            break;
        }else{
            newMap.put(arr[i+1]-arr[i], 0);
        }
       }
       return result;
    }





    private static int findMiss(int[] arr, int d) {
        int num = arr[0];
        int res  = num -d;
        return res;
    }

    private static boolean ifMiss(int[] arr, int d) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] + d != arr[i+1]){
                return false;
            }
        }

        return true;
    }

    private static int findMissBT(int[] arr, int d) {
        int res = -1;
        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            newMap.put(arr[i], 0);
        }

        int num;
        for(int i=0,j=arr[0];i<arr.length;i++,j=j+d){
            num = j;
            if(newMap.containsKey(num)){
                continue;
            }else{
                res = num;
            }
        }

        return res;
    }

    
}