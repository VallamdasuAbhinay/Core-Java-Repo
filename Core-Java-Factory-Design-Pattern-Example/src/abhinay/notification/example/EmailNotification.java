package abhinay.notification.example;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Email Notification to the user....");
	}

}
