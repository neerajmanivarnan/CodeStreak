import java.util.Scanner;
import java.util.Stack;

public class everymomc {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        
        int num = sc.nextInt();
        int[] newar = new int[num*2];
        int number;

        for(int i=0;i<newar.length;i++){
            newar[i] = sc.nextInt();
        }

        st.push(newar[0]);
        
        for(int i=1;i<num*2;i++){
            number = newar[i];

            if(number<st.peek() && i%2==0){
                st.pop();
            }else{
                st.add(number);
            }
        }

        int size = st.size();
        int[] arr = new int[size];

        System.out.println(st.size()/2);
        int n = size-1;

        while(!st.isEmpty()){
            arr[n] = st.pop();
            // System.out.println(st.peek());
            n--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
      
    }

   

}
