package util;

public class Generator {
    private final byte[] publicKey;
    private final byte[] privateKey;

    Generator() {
        publicKey = new byte[0];
        privateKey = new byte[0];
    }
    public byte[] getPublicKey() {
        return publicKey;
    }

    public byte[] getPrivateKey() {
        return privateKey;
    }

    public byte[] getKey() {
        return new byte[0];
    }
}
