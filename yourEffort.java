import java.util.Scanner;

public class yourEffort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        float arr[] = new float[num];
        float temp ;

        for(int i=0;i<num;i++){
            arr[i] = sc.nextFloat();
            if(arr[i]>100){
                arr[i] = 100;
            }
        }

        // float min = arr[0];
        // float max = arr[num-1];
        int count = 0;

        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        float num2 = arr[1];
        float max = arr[num-1];

       

        

        float maxRange = max-num2;
        for(int i=0;i<num;i++){
            if(arr[i] < maxRange || arr[i] < 30){
                count = count+1;
            }
        }

        System.out.println(count);
    }
}
