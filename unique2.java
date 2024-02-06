import java.util.Scanner;

public class unique2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String ch;
        int pass = 0;
        for(int i=0;i<str.length();i++){
            // ch = str.charAt(i)+;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j) == str.charAt(i)){
                    System.out.println("evil spell");
                    pass = 1;
                    break;
                    
                }
            }
            if(pass  == 1){
                break;
            }
        }

        if(pass == 0){
            System.out.println("good spell");
        }


    }
}