import java.util.Scanner;

public class fancyNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

       int count=0;
       int[] printArr = new int[100];
            int j=0;

        for(int i=0;i<len;i++){
            if(msb(arr[i])){
                if(nonZero(arr[i])){
                    count = count+1;
                    printArr[j] = arr[i];
                    j++;
                }
            }
        }

        System.out.println(count);
        for(int k=0;k<count;k++){
            System.out.println(printArr[k]);;
        }
    }

    private static boolean nonZero(int i) {
        char c;
        String num = i+"";
        for(int j=1;j<num.length()-1;j++){
            c = num.charAt(j);
            if(c!='0'){
                return false;
            }
        }

        return true;
    }

    private static boolean msb(int i) {
       String num = i+"";
       char first = num.charAt(0);
       char last = num.charAt(num.length()-1);
       if(first != '0' && last != '0'){
            return true;
       }else{
        return false;
       }
    }
}