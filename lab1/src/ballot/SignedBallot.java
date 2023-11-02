package ballot;

public class SignedBallot {
    private final Ballot ballot;
    private final byte[] sign;
    private final byte[] publicKey;
    public SignedBallot(Ballot ballot, byte[] sign, byte[] publicKey) {
        this.ballot = ballot;
        this.sign = sign;
        this.publicKey = publicKey;
    }

    public Ballot getBallot() {
        return ballot;
    }

    public byte[] getSign() {
        return sign;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }
}
