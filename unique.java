


import java.util.HashMap;
import java.util.Scanner;

public class unique {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<String,Integer> newMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch;
        int num = 0;
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i)+"";
            
            if(newMap.containsKey(ch)){
                System.out.println("evil spell");
                num = 1;
            }else{
                newMap.put(ch, 0);
            }
        }

        if(num == 0){
            System.out.println("good spell");
        }
    }
}