public class ConcreteCommandA  implements Command{
        private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.actionA();
  }
}
