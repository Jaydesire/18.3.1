import java.util.concurrent.atomic.AtomicBoolean;

public class Switch {
    AtomicBoolean isOn = new AtomicBoolean(false);

    public AtomicBoolean getIsOn() {
        return isOn;
    }

    public void setIsOn(AtomicBoolean isOn) {
        this.isOn = isOn;
    }
}
