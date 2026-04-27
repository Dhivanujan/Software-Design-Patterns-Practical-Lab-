package Task5;
class EmailFactory extends NotificationFactory {
    Notification createNotification() {
        return new EmailNotification();
    }
}
