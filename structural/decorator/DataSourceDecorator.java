package structural.decorator;

/**
 * The `DataSourceDecorator` class is a decorator pattern implementation that wraps around a
 * `DataSource` object to add additional functionality while maintaining the same interface.
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
