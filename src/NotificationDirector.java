public class NotificationDirector {
    public Notification createOrderReadyNotification ( NotificationBuilder builder, String recipient) {
    return builder
            .recipient(recipient)
            .text("Your order has been ready.")
            .build();
    }
}
