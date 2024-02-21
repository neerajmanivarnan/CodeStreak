import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class everymomc {

    public static void main(String[] args) {
        // Sample input
        int[] timeslots = {3, 1, 4, 2, 5, 6, 7};

        // Convert int array to pairs of integers
        List<List<Integer>> timeslotPairs = convertSlots(timeslots);

        // Validate timeslot format (optional)
        validateTimeslots(timeslotPairs);

        // Merge timeslots
        List<List<Integer>> mergedIntervals = mergeOverlappingSlots(timeslotPairs);

        // Print merged timeslots
        System.out.println("Merged timeslots:");
        for (List<Integer> interval : mergedIntervals) {
            System.out.println(interval.get(0) + " " + interval.get(1));
        }
    }

    private static List<List<Integer>> convertSlots(int[] timeslots) {
        

        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < timeslots.length; i += 2) {
            pairs.add(List.of(timeslots[i], timeslots[i + 1]));
        }
        return pairs;
    }

    private static void validateTimeslots(List<List<Integer>> timeslots) {
        for (List<Integer> slot : timeslots) {
            if (slot.get(0) >= slot.get(1)) {
                throw new IllegalArgumentException("Invalid timeslot: " + slot.get(0) + " to " + slot.get(1));
            }
        }
    }

    private static List<List<Integer>> mergeOverlappingSlots(List<List<Integer>> timeslots) {
        // Sort timeslots by their starting times
        Collections.sort(timeslots, (a, b) -> a.get(0).compareTo(b.get(0)));

        List<List<Integer>> mergedIntervals = new ArrayList<>();
        List<Integer> currentInterval = new ArrayList<>();

        for (List<Integer> slot : timeslots) {
            int start = slot.get(0);
            int end = slot.get(1);

            // Check for overlap and extend current interval if necessary
            if (!mergedIntervals.isEmpty() && end > currentInterval.get(1)) {
                currentInterval.set(1, Math.max(currentInterval.get(1), end));
            } else {
                // No overlap, add current interval (if any) and start a new one
                if (!currentInterval.isEmpty()) {
                    mergedIntervals.add(currentInterval);
                }
                currentInterval = new ArrayList<>(slot);
            }
        }

        // Add remaining interval if any
        if (!currentInterval.isEmpty()) {
            mergedIntervals.add(currentInterval);
        }

        return mergedIntervals;
    }
}
