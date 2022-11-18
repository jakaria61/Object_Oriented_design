public class EmailNotification implements Notification {

    @Override
    public void notifyUser(String text) {
        // TODO Auto-generated method stub
        System.out.println("Sending Email notification"+text);
    }
    
}
