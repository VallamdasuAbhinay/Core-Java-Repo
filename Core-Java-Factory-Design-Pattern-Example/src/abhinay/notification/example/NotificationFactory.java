package abhinay.notification.example;

import java.util.Objects;

public class NotificationFactory {

	public Notification createNotification(String notificationType) {
		if (Objects.isNull(notificationType)) {
			return null;
		} else if (notificationType.equalsIgnoreCase("SMS")) {
			return new SMSNotification();
		} else if (notificationType.equalsIgnoreCase("Email")) {
			return new EmailNotification();
		} else {
			throw new IllegalArgumentException("Invalid Parameter : Notification Type Passed");
		}
	}

}
