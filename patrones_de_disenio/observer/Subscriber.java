package observer;

public class Subscriber implements Observer{
	
	private Observable observable = null;
	
	public Subscriber(Observable observable) {
		this.observable = observable;
	}
	
	@Override
	public void update() {
		System.out.println("New video posted!");
		YoutubeChannel yt = (YoutubeChannel) this.observable;
		System.out.println(yt.getLastVideoPosted());
		
	}
	
}
