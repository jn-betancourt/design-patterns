package structural.decorator;

// The `import java.util.Base64;` statement in the Java code is importing the `Base64` class from the
// `java.util` package. This class provides static methods for encoding and decoding data using Base64
// encoding. In the context of the EncryptionDecorator class, the `Base64` class is used to perform
// Base64 encoding and decoding operations on the data being processed.
import java.util.Base64;

/**
 * The EncryptionDecorator class extends DataSourceDecorator to provide methods for encoding and
 * decoding data using Base64 encoding with a simple byte shift encryption.
 */
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}