package abhinay.notification.example;

public class NotificationService {

	public static void main(String[] args) {
		NotificationFactory factoryObj = new NotificationFactory();
		Notification sms_notification = factoryObj.createNotification("SMS");
		sms_notification.notifyUser();
		System.out.println("--------------------");
		Notification email_notification = factoryObj.createNotification("email");
		email_notification.notifyUser();
		System.out.println("--------------------");
		Notification other_notification = factoryObj.createNotification("phone");
		other_notification.notifyUser();
		System.out.println("--------------------");
	}

}
