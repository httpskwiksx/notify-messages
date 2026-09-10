public class Notification {
    private final  String recipient;
    private final String channel;
    private final String content;
    public Notification(String recipient, String channel, String content) {
        this.recipient = recipient;
        this.channel = channel;
        this.content = content;
    }
    public String getRecipient() {
        return recipient;
    }
    public String getChannel() {
        return channel;
    }
    public String getContent() {
        return content;
    }
}
