import java.util.concurrent.atomic.AtomicBoolean;

public class UserThread extends Thread {
    private Switch aSwitch;
    private int numberOfSwitchings = 3;

    public UserThread(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void run() {

        for (int i = 0; i < numberOfSwitchings; i++) {
            try {
                Thread.sleep((int)(Math.random()*3000));
            } catch (InterruptedException e) {
                this.interrupt();
            }
            if (!aSwitch.getIsOn().get()) {
                aSwitch.setIsOn(new AtomicBoolean(true));
                System.out.println("⏻   Поток-пользователь включил тумблер");
            }
        }

    }


}
