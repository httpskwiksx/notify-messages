# notify-messages - Builder Pattern
A Java project demonstrating the Builder design pattern.

The program creates two types of notifications:
- Email with HTML content;
- SMS with plain text.

Notifications are printed to the console. not sent.

## Classes

- Notification (stores the recipient, channel and content);
- NotificationBuilder (defines common configuration methods amd validation);
- EmailNotificationBuilder (builds email notification);
- SmsNotificationBuilder (builds SMS notifications);
- NotificationDirector (provides a reusable order-ready message recipe);
- Main (runs the demonstration)

## How to Run
### IntelliJ IDEA
1. Open the project.
2. Select JDK 17.
3. Run Main.java.

## Usage

* To create an Email, use EmailNotificationBuilder.
* To create an SMS, use SmsNotificationBuilder.
* Pass the selected builder and recipient to the director's createOrderReadyNotification() method.

## Validation

The builder checks that the recipient and message text are not empty.
If required data is missing, it throws an exception.



