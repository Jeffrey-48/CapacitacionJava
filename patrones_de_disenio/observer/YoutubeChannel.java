package observer;

import java.util.ArrayList;

public class YoutubeChannel implements Observable{
	
	private ArrayList<Observer> channelSubscribers = new ArrayList<>();
	private String lastVideoPosted = "";

	public void addNewVideo(String titulo) {
		this.lastVideoPosted=titulo;
		this.notifyN();
		System.out.println("New video added to channel");
	}
	
	@Override
	public void attach(Observer o) {
		this.channelSubscribers.add((Observer) o);
	}

	@Override
	public void detach(Observer o) {
		//Eliminar susccriptor
		
	}

	@Override
	public void notifyN() {
		for (Observer observer : this.channelSubscribers) {
			observer.update();
		}
		
	}

	public String getLastVideoPosted() {
		return lastVideoPosted;
	}

	public void setLastVideoPosted(String lastVideoPosted) {
		this.lastVideoPosted = lastVideoPosted;
	}

}
