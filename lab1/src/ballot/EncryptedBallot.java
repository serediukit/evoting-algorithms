package ballot;

public class EncryptedBallot {
    private final byte[] info;

    public EncryptedBallot(byte[] encryptedInfo) {
        this.info = encryptedInfo;
    }

    public byte[] getInfo() {
        return info;
    }
}
