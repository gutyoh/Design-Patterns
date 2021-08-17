package me.rosch;

public class MailService {
    public void sendEmail() {
        connect(1);
        authenticate();
        disconnect();
    }

    private void connect(int timeOut) {
        System.out.println("Connected");
    }

    private void disconnect() {
        System.out.println("Disconnected");
    }

    private void authenticate() {
        System.out.println("Authenticated");
    }
}
