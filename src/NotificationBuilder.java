public abstract  class NotificationBuilder {
    protected String  recipient;
    protected String  text;

    public NotificationBuilder recipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public NotificationBuilder text(String text) {
        this.text = text;
        return this;
    }

    protected void validate() {
        if (recipient == null  || recipient.isEmpty()) {
            throw new IllegalArgumentException("Recipient cannot be null or empty");
        }
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Text cannot be null or empty");
        }
    }
    public abstract Notification build();
}
