class SMSFactory extends NotificationFactory {
    Notification createNotification() {
        return new SMSNotification();
    }
}