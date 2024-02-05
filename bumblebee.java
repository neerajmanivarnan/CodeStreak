import java.util.Scanner;



public class bumblebee {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      
        
        if(num%369!=0){
            System.out.println("Not bumblebee");
        }else{
            if(newFunc(num)){
                if(num<=0){
                 System.out.println("Not bumblebee");
                }else{
                    System.out.println("Bumblebee");
                }
                
            }else{
                System.out.println("Not bumblebee");
            }
        }

        sc.close();
    }

    private static boolean newFunc(int i) {
        String num = i+"";
        for(i=0;i<num.length();i++){
            if(num.charAt(i) == '0'){
                System.out.println("number is "+num.charAt(i)+"returning false");
                return false;
            }
        }

        return true;
    }
}