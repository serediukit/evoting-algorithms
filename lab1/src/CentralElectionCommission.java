import ballot.EncryptedBallot;
import util.*;

import java.util.*;

public class CentralElectionCommission {
    private Map<Integer, CandidateResult> candidates;
    private Map<Integer, Voter> voters;
    private HashSet<Integer> acceptedVoters;
    private boolean isEnded = false;
    private Result result;
    private byte[] CECKey;

    public CentralElectionCommission(List<Candidate> candidates, List<Voter> voters, Generator generator) {
        for (Candidate candidate : candidates) {
            this.candidates.put(candidate.getId(), new CandidateResult(candidate));
        }
        for (Voter voter : voters) {
            this.voters.put(voter.getId(), voter);
        }

        CECKey = generator.getKey();
        assert this.candidates != null;
        result = new Result(this.candidates.values().stream().toList());
    }

    public void sendBallot(EncryptedBallot encryptedBallot, Signer signer, Encrypter encrypter, Serializer serializer) {
        if (isEnded) {
            System.out.println("Голосування вже завершено!!!");
        } else {
            byte[] info =
        }
    }
}
