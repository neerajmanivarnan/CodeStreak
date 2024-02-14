import java.util.Scanner;

public class colors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result =0;
        for(int i=0;i<num;i++){
            int num2 = sc.nextInt();
            if(num2>0){
                result = result + num2;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
