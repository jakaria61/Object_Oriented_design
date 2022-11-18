public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notification=new NotificationFactory();
        String text="Hello Jakaria";
        Notification notification1=notification.createNotification("SMS");
        notification1.notifyUser(text);
        Notification notification2=notification.createNotification("EMAIL");
        notification2.notifyUser(text);
        Notification notification3=notification.createNotification("PUSH");
        notification3.notifyUser(text);

    }
}
