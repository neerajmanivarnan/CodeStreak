import java.util.Scanner;

public class day12sol2 {

    public static String decrypt(String message, int key) {
        StringBuilder resultMsg = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                
                if (Character.isLowerCase(character)) {
                    char newChar = (char) ((character - 'a' + key) % 26 + 'a');
                    resultMsg.append(newChar);
                }
                
                else {
                    char newChar = (char) ((character - 'A' + key) % 26 + 'A');
                    resultMsg.append(newChar);
                }
            } else if(Character.isDigit(character)){
                
                resultMsg.append(character);
            }else{
                resultMsg.append(" ");
            }
        }
        return resultMsg.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        int key = sc.nextInt();

        String resultMsg = decrypt(code, key);
        
        System.out.println(resultMsg);
    }
}
