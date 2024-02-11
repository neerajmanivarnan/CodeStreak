import java.util.Scanner;

public class rating {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int len = sc.nextInt();
       int[] newArr = new int[len];
       int sum1=0;
       int sum2=0;
       int critical=-1;


       for(int i=0;i<len;i++){
        newArr[i] = sc.nextInt();
        if(newArr[i]>5){
            newArr[i] = 5;
        }
        if(newArr[i]<-5){
            newArr[i] = -5;
        }

        if(newArr[i]==0){
            newArr[i] = -1;
        }
        
       }

       for(int i=0;i<len;i++){
        for(int j=0;j<i;j++){
            sum1 = sum1+newArr[j];
        }

        for(int k=i+1;k<len;k++){
            sum2 = sum2+newArr[k];
        }

        if(sum1==sum2){
            critical = newArr[i];
            System.out.println(critical);
            
        }else{
            sum1=0;
            sum2 =0;
        }
       }

       if(critical == -1){
        System.out.println(findMin(newArr));
       }

       
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }
    }
