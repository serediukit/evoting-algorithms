package util;

public class Signer {
    private final byte[] sign;

    Signer(byte[] sign) {
        this.sign = sign;
    }

    public byte[] sign() {
        return sign;
    }
}
