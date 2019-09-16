// Object for D (query)

public class Respond extends dataClass{
    int waitingTime;

    public Respond(String[] arr) {
        super(arr);
        this.waitingTime = Integer.parseInt(arr[5]);
    }

    public int getWaitingTime() {
        return waitingTime;
    }
}