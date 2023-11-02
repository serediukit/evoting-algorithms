import java.util.List;

public class Result {
    private final List<CandidateResult> candidateResultList;
    private boolean isEnded = false;

    public Result(List<CandidateResult> results) {
        this.candidateResultList = results;
    }

    public void endVoting() {
        isEnded = true;
    }

    public String getResults() {
        return "Результати:";
    }

    public List<CandidateResult> getCandidateResultList() {
        return candidateResultList;
    }

    public boolean isEnded() {
        return isEnded;
    }
}
