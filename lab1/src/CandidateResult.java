public class CandidateResult {
    private final Candidate candidate;
    private int votes;

    public CandidateResult(Candidate candidate) {
        this.candidate = candidate;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public int getVotes() {
        return votes;
    }

    public void incrementVotes() {
        this.votes++;
    }
}
