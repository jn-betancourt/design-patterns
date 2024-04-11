package structural.decorator;
// The statement `import java.io.*;` in Java is used to import all classes from the `java.io` package.
// This allows the current Java file to use classes from the `java.io` package without specifying the
// package name each time. In this case, it is used to import classes related to input and output
// operations, such as file handling, streams, readers, and writers.
import java.io.*;

/**
 * The `FileDataSource` class implements the `DataSource` interface to write and read data to/from a
 * file.
 */
public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}