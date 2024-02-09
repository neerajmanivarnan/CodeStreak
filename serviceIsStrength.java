import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class serviceIsStrength {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       
        String[] targetAndLength = reader.readLine().split(" ");
        int target = Integer.parseInt(targetAndLength[0]);
        int arrLength = Integer.parseInt(targetAndLength[1]);

        
        if (arrLength > 100) {
            arrLength = 100;
        }

       
        int[] arr = new int[arrLength];
        String[] elements = reader.readLine().split(" ");
        for (int i = 0; i < arrLength; i++) {
            int num = Integer.parseInt(elements[i]);
            
            if (num < 100) {
                num = 100;
            } else if (num > 500) {
                num = 500;
            }
            arr[i] = num;
        }

        reader.close();

        HashMap<Integer, Integer> numIndicesMap = new HashMap<>();
        int flag = 0;
        for (int i = 0; i < arrLength; i++) {
            int complement = target - arr[i];
            if (numIndicesMap.containsKey(complement)) {
                System.out.println(target);
                System.out.print(numIndicesMap.get(complement) + " ");
                System.out.print(i);
                flag = 1;
                break;
            } else {
                numIndicesMap.put(arr[i], i);
            }
        }

        if (flag == 0) {
            System.out.println(target);
        }
    }
}
