import java.util.HashMap;
import java.util.Scanner;

public class day14q1 {
    //remove repeating characters
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = helper(str);
        System.out.println(result);
    }

    private static String helper(String str) {
        char[] arr = new char[str.length()];
        String org  = "";

        char[] newAr = new char[str.length()];

        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }

        
        HashMap<Character,Integer> newMap = new HashMap<>();
        for(int i=0,j=0;i<str.length();i++){
            if(newMap.containsKey(arr[i])){
                continue;
            }else{
                newMap.put(arr[i], 0);
                newAr[j] = arr[i];
                j++;
            }
        }

        for(int i =0;i<newAr.length;i++){
            org = org+newAr[i];
        }
        org = org.trim();
        return org;
    }
}
