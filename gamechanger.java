

import java.util.HashMap;
import java.util.Scanner;

public class gamechanger {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> newMap = new HashMap<>();
        int num = sc.nextInt();
        int[] arr = new int[num];
        int num2;

        for(int i=0;i<num;i++){
            num2 = sc.nextInt();
            newMap.put(num2,0);
        } 
        
        int single = sc.nextInt();
        int couple = 2*single;
        

        if(newMap.containsKey(single) && newMap.containsKey(couple)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

       

    
    }
}