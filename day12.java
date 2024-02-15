import java.util.HashMap;
import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        String code  = sc.nextLine();
        int key = sc.nextInt();
        
        System.out.println(helper(code,key));;
        
    }

    private static String helper(String code, int key) {
        String result="";
        char append;
        String appendString="";
        String c2="";
        HashMap<Character,Integer> newMap = new HashMap<>();
        for(int i=97 , j=0;i<123;i++,j++){
            char c = (char)i;
            newMap.put(c,j);
        }

       

        for(int i=0;i<code.length();i++){
            char c1 = code.charAt(i);
            if(Character.isAlphabetic(c1)){
                    if(Character.isLowerCase(c1)){
                        if(newMap.containsKey(c1)){
                        int num = newMap.get(c1);
                        num= num+key;
                        num = num%27;
                        append = (char)num;
                        result = result+append;
                    }
                    }else if(Character.isUpperCase(c1)){
                        c2 = c1+"";
                        c2 = c2.toLowerCase();
                        if(newMap.containsKey(c2)){
                            int num = newMap.get(c2);
                            num= num+key;
                            num = num%27;
                            append = (char)num;
                            appendString = append+"";
                            appendString = appendString.toUpperCase();
                            result = result+appendString;
                    }    
            }else{
                result = result+" ";
            }
            
            
        }

    }

    return result;
    }
}
