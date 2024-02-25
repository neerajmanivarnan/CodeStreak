import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum1 = 0;
        int sum2 = 0;
        int flag = 0;
        int temp;


        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        
        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                sum1 = sum1+arr[j];
            }
            for(int k = i+1;k<num;k++){
                sum2 = sum2 + arr[k];
            }

            if(sum1 == sum2){
                flag = 1;
                break;
            }else{
                sum1 =0;
                sum2 =0;
            }
        }

        
         

       if(flag == 1){
        System.out.println("True");
       }else{
        System.out.println("False");
       }
    }
}
