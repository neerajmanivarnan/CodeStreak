import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class day14q2 {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(helper(str));
    }

    private static boolean helper(String str) {
        str = str.toLowerCase();
        str=str.replace(" ","");
        int cnt;
        HashMap<String,Integer> newMap = new HashMap<>();
        HashMap<Character,Integer> count = new HashMap<>();
        newMap.put("vowels",0);
        newMap.put("cons",0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                if(count.containsKey(str.charAt(i))){
                    //do nothing
                }else{
                    cnt = newMap.get("vowels");
                    cnt = cnt+1;
                    newMap.put("vowels", cnt);
                    count.put(str.charAt(i),0);
                }
            }else if(Character.isAlphabetic(str.charAt(i))){
                if(count.containsKey(str.charAt(i))){
                    //do nothing
                }else{
                    cnt = newMap.get("cons");
                    cnt = cnt+1;
                    newMap.put("cons", cnt);
                    count.put(str.charAt(i),0);
                }
            }else{
                //do nothing
            }

        }

        if(newMap.get("vowels") == newMap.get("cons")){
            return true;
        }else{
            return false;
        }
    }
}
