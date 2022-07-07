public class Main {

    public static void main(String[] args) {
        Switch aSwitch = new Switch();
        UserThread userThread = new UserThread(aSwitch);
        ToyThread toyThread = new ToyThread(aSwitch);

        toyThread.start();
        userThread.start();

        try {
            userThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toyThread.interrupt();
    }
}
