package callbackexamples;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Process {
    private int a;
    private int b;
    private int sleepTime;

    public Process(int a, int b, int sleepTime) {
        this.a = a;
        this.b = b;
        this.sleepTime= sleepTime;
    }

    public int sum(){

        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this.a+this.b;
    }

}
