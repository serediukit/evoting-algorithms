package ballot;

public class Ballot {
    private final int voter;
    private final int candidate;

    public Ballot(int voter, int candidate) {
        this.voter = voter;
        this.candidate = candidate;
    }

    public int getVoter() {
        return voter;
    }

    public int getCandidate() {
        return candidate;
    }
}
