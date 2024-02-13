import java.util.Scanner;

class patient {
    String name;
    int priority;

    public patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Priority: " + priority;
    }
}

public class codeRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of patients: ");
        int persons = sc.nextInt();

        patient[] patients = new patient[persons];

        // Read patient information
        for (int i = 0; i < persons; i++) {
            System.out.print("Enter patient " + (i + 1) + " name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient " + (i + 1) + " priority (higher number means higher priority): ");
            int priority = sc.nextInt();

            patients[i] = new patient(name, priority);
        }

        // Handle priority 0 constraint
        int zeroPriorityIndex = findZeroPriorityIndex(patients);
        if (zeroPriorityIndex != -1) {
            swap(patients, zeroPriorityIndex, 0);
        }

        // Sort patients by priority (excluding the patient with priority 0)
        selectionSort(patients, 1, persons - 1);

        // Print sorted patients
        System.out.println("\nPatients sorted by priority:");
        for (patient patient : patients) {
            System.out.println(patient);
        }
    }

    // Method to find the index of a patient with priority 0
    private static int findZeroPriorityIndex(patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].priority == 0) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Selection sort, modified to start from index 1
    private static void selectionSort(patient[] patients, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= endIndex; j++) {
                if (patients[j].priority < patients[minIndex].priority) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            if (minIndex != i) {
                patient temp = patients[i];
                patients[i] = patients[minIndex];
                patients[minIndex] = temp;
            }
        }
    }

    // Method to swap elements in an array
    private static void swap(patient[] arr, int index1, int index2) {
        patient temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
