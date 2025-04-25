import java.util.*;

public class VotingSystem {
    private Map<String, Integer> votesMap;
    private Map<String, Integer> sortedVotesMap;
    private Map<String, Integer> orderedVotesMap;

    public VotingSystem() {
        this.votesMap = new HashMap<>();
        this.sortedVotesMap = new TreeMap<>();
        this.orderedVotesMap = new LinkedHashMap<>();
    }

    // Cast a vote for a candidate
    public void voteForCandidate(String candidate) {
        // Increment the vote for the candidate in the HashMap
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);

        // Maintain the order of votes in LinkedHashMap
        orderedVotesMap.put(candidate, votesMap.get(candidate));

        // Maintain sorted votes in TreeMap
        sortedVotesMap.put(candidate, votesMap.get(candidate));
    }

    // Display votes in sorted order using TreeMap
    public void displayVotesInSortedOrder() {
        System.out.println("Votes in Sorted Order (Alphabetical):");
        for (Map.Entry<String, Integer> entry : sortedVotesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display votes maintaining order of casting using LinkedHashMap
    public void displayVotesInOrderOfCasting() {
        System.out.println("Votes in Order of Casting:");
        for (Map.Entry<String, Integer> entry : orderedVotesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display all votes in the order they were counted using HashMap
    public void displayVotes() {
        System.out.println("Votes Counted:");
        for (Map.Entry<String, Integer> entry : votesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display the candidate with the highest votes
    public void displayWinner() {
        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : votesMap.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println("Winner: " + winner + " with " + maxVotes + " votes.");
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        // Simulate voting
        system.voteForCandidate("Alice");
        system.voteForCandidate("Bob");
        system.voteForCandidate("Alice");
        system.voteForCandidate("Charlie");
        system.voteForCandidate("Bob");
        system.voteForCandidate("Alice");

        // Display results
        system.displayVotesInSortedOrder();
        system.displayVotesInOrderOfCasting();
        system.displayVotes();
        system.displayWinner();
    }
}
