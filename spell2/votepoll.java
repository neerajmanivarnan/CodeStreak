import java.util.Scanner;

public class votepoll{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];

        for(int i=0;i<num;i++){
            nums[i] = sc.nextInt();
        }
        
        int pre = 0;
        int suf = 0;
        int[] result = new int[num];
        for(int i = 0; i < num; i++) {
            result[i] = pre;
            pre += nums[i];
        }
        for(int i = num-1; i >= 0; i--) {
            result[i] += suf;
            suf += nums[i];
        }
        
        
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}