package yeatware.gui.settings;

public class BooleanSetting extends Setting {
    boolean value;

    public BooleanSetting(String name, boolean value) {
        super(name);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public int getHeight() {
        return 15;
    }
}
