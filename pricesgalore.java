import java.util.Scanner;

public class pricesgalore {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int number = 8743;
        int count = calCount(number);
        // System.out.println(places(8743));
        if(isSorted(number)){
            if(places(number)){
                if(count == 5){
                    System.out.println("Villa");
                }else if(count == 4){
                    System.out.println("Car");
                }else if(count == 3){
                    System.out.println("MobilePhone");
                }else{
                    System.out.println("BetterLuckNextTime");
                }
            }else{
                System.out.println("BetterLuckNextTime");
            }
        }else{
            System.out.println("BetterLuckNextTime");
        }

        sc.close();
    }

    private static boolean places(int number) {
        int flag = 0;
       String n = number+"";
       for(int i=1;i<n.length();i++){
            if(i%2 == 0){
                int newNum = Integer.parseInt(n.charAt(i-1)+"");
                if(newNum%2 == 0){
                    flag = 1;
                    break;
                }else{
                    continue;
                }
            }else{
                int newNum = Integer.parseInt(n.charAt(i-1)+"");
                if(newNum%2 != 0){
                    flag = 1;
                    break;
                }else{
                    continue;
                }
            }
       }

       if(flag == 1){
        return false;
       }else{
        return true;
       }
    }

    private static boolean isSorted(int number) {
        int prev = number%10;
       int rem;
       while(number>0){
        rem = number%10;
        if(rem >= prev){
            prev = rem;
            number = number/10;
            continue;

        }else{
            return false;
        }
        
       }

       return true;
    }

    private static int calCount(int number) {
        int count = 0;
        while(number > 0){
            number = number / 10;
            count = count+1;
        }
        return count;
    }
}