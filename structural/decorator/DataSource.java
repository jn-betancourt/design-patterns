package structural.decorator;

// This code snippet is defining a Java interface named `DataSource`. This interface has two abstract
// methods:
// 1. `void writeData(String data)` - This method takes a `String` parameter `data` and does not return
// anything.
// 2. `String readData()` - This method does not take any parameters and returns a `String`.
public interface DataSource {
    void writeData(String data);

    String readData();
}