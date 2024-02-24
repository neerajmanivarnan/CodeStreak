import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int flag;
        int count = 0;
        int temp;

        

        for(int i=0;i<num;i++){
            flag = 0;
            for(int j=i+1;j<num;j++){
                if(arr[j]>arr[i]){
                    
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
                count = count+1;
            }
        }

        System.out.println(count);
       

        
    }

    
}
