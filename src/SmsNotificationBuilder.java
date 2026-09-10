public class SmsNotificationBuilder extends NotificationBuilder {

    @Override
    public Notification build() {
        validate();
        return new Notification(recipient, "SMS", text);
    }

}
