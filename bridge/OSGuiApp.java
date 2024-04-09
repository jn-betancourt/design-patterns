package bridge;
public abstract class OSGuiApp {
    protected Gui gui;
    public OSGuiApp(){
    }
    public void renderImage(){
        gui.openWindow();
    }
    public Gui getGui() {
        return gui;
    }
    public void setGui(Gui gui) {
        this.gui = gui;
    }
    
}
