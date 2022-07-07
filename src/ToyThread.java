import java.util.concurrent.atomic.AtomicBoolean;

public class ToyThread extends Thread {
    Switch aSwitch;

    public ToyThread(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void run() {

        while (!isInterrupted()) {
            try {
                Thread.sleep((int)(Math.random()*2000));
            } catch (InterruptedException e) {
                this.interrupt();
            }
            if (aSwitch.getIsOn().get()) {
                aSwitch.setIsOn(new AtomicBoolean(false));
                System.out.println("Поток-игрушка обнаружила включение и выключила тумблер");
            }
        }
    }

}
