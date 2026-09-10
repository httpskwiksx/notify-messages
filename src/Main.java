public class Main {
    public static void main(String[] args) {
        NotificationDirector director = new NotificationDirector();
        Notification email = director.createOrderReadyNotification(new EmailNotificationBuilder(), "hochukushat@example.com");
        Notification sms = director.createOrderReadyNotification(new SmsNotificationBuilder(), "+88005353535");
        System.out.println(email.getContent());
        System.out.println(email.getRecipient());
        System.out.println(sms.getRecipient());
        System.out.println(sms.getContent());

    }
}