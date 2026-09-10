public class EmailNotificationBuilder extends NotificationBuilder {

      @Override
      public Notification build(){
          validate();
          String htmlContent = "<p>" + text + "</p>";
          return new Notification(recipient, "EMAIL", htmlContent);

    }
}
