package structural.bridge;
public class App extends OSGuiApp {

    public App() {
        String sistemaOperativo = System.getProperty("os.name").toLowerCase();
        if (sistemaOperativo.contains("win")) {
            setGui(new WindowsGui());
        } else if (sistemaOperativo.contains("nux") || sistemaOperativo.contains("nix")) {
            setGui(new LinuxGUi());
        } else if (sistemaOperativo.contains("mac")) {
            setGui(new IOSGui());
        } else {
            System.out.println("Sistema operativo no identificado.");
        }
    }
}
