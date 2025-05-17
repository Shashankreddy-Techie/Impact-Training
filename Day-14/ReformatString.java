import java.util.*;

public class ReformatString {
    public String reformat(String s) {
        // Count the frequency of each character
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Create a max heap based on character frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(countMap.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prevEntry = null;

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();
            result.append(currentEntry.getKey());

            // Decrease the frequency of the current character
            if (currentEntry.getValue() > 1) {
                if (prevEntry != null) {
                    maxHeap.offer(prevEntry);
                }
                prevEntry = new AbstractMap.SimpleEntry<>(currentEntry.getKey(), currentEntry.getValue() - 1);
            } else {
                prevEntry = null;
            }
        }

        // Check if the reformatting was successful
        return result.length() == s.length() ? result.toString() : "";
    }

    public static void main(String[] args) {
        ReformatString reformatter = new ReformatString();
        String input = "aabbcc";
        String output = reformatter.reformat(input);
        System.out.println("Reformatted String: " + output);
    }
}
