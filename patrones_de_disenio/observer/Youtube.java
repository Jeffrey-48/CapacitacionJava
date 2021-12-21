package observer;

public class Youtube {
	
	public static void main(String[] args) {
		YoutubeChannel channel = new YoutubeChannel();
		Subscriber sub1 = new Subscriber(channel);
		Subscriber sub2 = new Subscriber(channel);
		channel.attach(sub1);
		channel.attach(sub2);
		channel.addNewVideo("Nuevo video patrones de diseño");
	}
}
