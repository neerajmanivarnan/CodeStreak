import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class tiethetalk {
    public static int countFormalMeetings(String[] jack, String[] ruby) {
        HashSet<String> jackSet = new HashSet<>();
        for (String place : jack) {
            jackSet.add(place);
        }

        int formalMeetings = 0;
        for (String place : ruby) {
            if (jackSet.contains(place)) {
                formalMeetings++;
            }
        }

        return formalMeetings;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       
        int m = Integer.parseInt(reader.readLine());

      
        String[] jackPlaces = new String[m];
        for (int i = 0; i < m; i++) {
            jackPlaces[i] = reader.readLine();
        }

       
        int n = Integer.parseInt(reader.readLine());

       
        String[] rubyPlaces = new String[n];
        for (int i = 0; i < n; i++) {
            rubyPlaces[i] = reader.readLine();
        }

     
        int meetings = countFormalMeetings(jackPlaces, rubyPlaces);
        System.out.println(meetings);

        
        reader.close();
    }
}
