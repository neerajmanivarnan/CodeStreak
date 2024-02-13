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

public class codeReedCopy {
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

        if(containsSame(p)){
            for(int i=0;i<persons;i++){
            System.out.println(p[i].name);
        }
        }else{
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

        
        int zeroPriorityIndex = findZeroPriorityIndex(p);
        if (zeroPriorityIndex != -1) {
            swap(p, zeroPriorityIndex, 0);
        }

        
        selectionSort(p, 1, persons - 1);

       

        for(int i=persons-1;i>=0;i--){
            System.out.println(p[i].name);
        }
        }

        
    }

    private static int findZeroPriorityIndex(patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].priority == 0) {
                return i;
            }
        }
        return -1; 
    }

     
    private static void selectionSort(patient[] patients, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= endIndex; j++) {
                if (patients[j].priority < patients[minIndex].priority) {
                    minIndex = j;
                }
            }

           
            if (minIndex != i) {
                patient temp = patients[i];
                patients[i] = patients[minIndex];
                patients[minIndex] = temp;
            }
        }
    }

   
    private static void swap(patient[] arr, int index1, int index2) {
        patient temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static boolean containsSame(patient[] arr){
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result = result ^ arr[i].priority;
        }
        if(result == 0){
            return true;
        }else{
            return false;
            
        }
    }
}
