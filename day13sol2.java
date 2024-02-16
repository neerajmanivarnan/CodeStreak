import java.util.Scanner;

public class day13sol2 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        
        int flag = 0;
        for(int i=0;i<num;i++){
            String word = sc.next();
            if(str.contains(word)){
                flag = 0;
            }else{
                flag = 1;
                System.out.println(0);
                break;
            }
        }

        if(flag == 0){
            System.out.println(1);
        }

        sc.close();

    }
}
