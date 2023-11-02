import ballot.Ballot;
import ballot.EncryptedBallot;
import ballot.SignedBallot;
import util.*;

public class Voter {
    private final int id;
    private final String fullName;
    private final int age;
    private final boolean canVote;
    private final byte[] publicKey;
    private final byte[] privateKey;

    public Voter(int id, String fullName, int age, boolean canVote, Generator generator) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.canVote = canVote;
        publicKey = generator.getPublicKey();
        privateKey = generator.getPrivateKey();
    }

    public EncryptedBallot getBallot(int candidate, byte[] CECKey, Signer signer, Encrypter encrypter, Serializer serializer) {
//        Ballot ballot = new Ballot(id, candidate);
//        SignedBallot signedBallot = new SignedBallot(ballot, signer.sign(), publicKey);
//        EncryptedBallot encryptedBallot = new EncryptedBallot(encrypter.encrypt(), CECKey);
//        return encryptedBallot;
        return new EncryptedBallot(new byte[0]);
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isCanVote() {
        return this.age >= 18 && this.canVote;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }
}
