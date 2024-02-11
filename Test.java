import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,2,3,1,2};
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result = result ^ arr[i];
        }

        System.out.println(result);

        
    }
}
