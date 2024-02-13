import java.util.Scanner;

class patient{
    String name;
    int priority;
    
    public patient() {
    }

    public patient(String name) {
        this.name = name;
        
    }

    public patient(int priority) {
        
        this.priority = priority;
    }
    

}

public class codeRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        patient[] p = new patient[persons];
        patient temp = new patient();
        for(int i=0;i<persons;i++){
            p[i] = new patient();
            String name = sc.next();
            
            
            p[i].name = (name);
        }

        sc.nextLine();
        for(int i=0;i<persons;i++){
            int num = sc.nextInt();
            
            p[i].priority = (num);
        }

        for(int i=0;i<persons-1;i++){
            for(int j=0;j<persons-i-1;j++){
                if(p[j].priority > p[j+1].priority){
                    temp.name = p[j].name;
                    temp.priority = p[j].priority;
                    p[j].name = p[j+1].name;
                    p[j].priority = p[j+1].priority;
                    p[j+1].name = temp.name;
                    p[j+1].priority = temp.priority;
                }
            }
        }

       

        for(int i=persons-1;i>=0;i--){
            System.out.println(p[i].name);
        }

        
    }
}
