import java.util.HashMap;
import java.util.Scanner;

public class chomp {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }


         HashMap<Integer,String> newMap = new HashMap<>();
         

         newMap.put(1, "Biryani");
         newMap.put(2, "Butter Chicken");
         newMap.put(3, "Paneer Tikka");
         newMap.put(4, "Masala Dosa");
         newMap.put(5, "Chole Bhature");
         newMap.put(6, "Samosa");
         newMap.put(7, "Tandoori Chicken");
         newMap.put(8, "Rajma Chawal");
         newMap.put(9, "Idli Sambhar");
         newMap.put(10, "Aloo Paratha");
         newMap.put(11, "Palak Paneer");
         newMap.put(12, "Pani Puri");
         newMap.put(13, "Dal Makhani");
         newMap.put(14, "Chicken Tikka");
         newMap.put(15, "Vada Pav");
         newMap.put(16, "Dhokla");
         newMap.put(17, "Chicken Curry");
         newMap.put(18, "Gulab Jamun");
         newMap.put(19, "Fish Curry");
         newMap.put(20, "Aloo Gobi");

        int prev=arr[0];  
        int max = arr[0];       

        for(int i=1;i<num;i++){
            if(arr[i] == prev && arr[i]>=max){
                max = arr[i];
                prev = arr[i];
            }else{
                prev = arr[i];
            }
            
        }

        

         String result = newMap.get(max);
         System.out.println(result);
    }
}
