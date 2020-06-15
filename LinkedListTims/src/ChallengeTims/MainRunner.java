package ChallengeTims;

import java.util.LinkedList;
import java.util.ListIterator;

public class MainRunner {

	public static void main(String[] args) {
		Album album=new Album("Stormbinger","Deep purple");
		album.addSong("Stormbinger", 4.6);
		album.addSong("Love doe", 4.22);
		album.addSong("holy mean", 4.3);
		album.addSong("hold on", 3.21);
		album.addSong("lean on", 4.5);
		album.addSong("perfect", 6.5);
		album.addSong("th gipsy", 4.0);
		album.addSong("Stormbeveryday", 4.9);
		album.addSong("always", 3.6);
		
		album=new Album("For those about to rock","AC/DC");
		album.addSong("For those about to rock", 5.44);
		album.addSong("i put the finger", 3.35);
		album.addSong("lets go", 3.45);
		album.addSong("inject the venom", 4.4);
		album.addSong("snowballed", 5.6);
		album.addSong("evil wals", 3.36);
		album.addSong("cod", 6.6);
		album.addSong("break rules", 5.32);
		album.addSong("height of long knives", 4.6);
		
		
		LinkedList<Song> playList=new LinkedList<Song>();
		albums.get(0).addToPlayList("You cant do it right",playList);
		albums.get(0).addToPlayList("Holy man ",playList);
		albums.get(0).addToPlayList("You cant do it right",playList);
		albums.get(0).addToPlayList(9,playList);
		albums.get(1).addToPlayList(8,playList);
		albums.get(1).addToPlayList(3,playList);
		albums.get(1).addToPlayList(2,playList);
		albums.get(1).addToPlayList(6,playList);
		
		play(playList);

	}
	  private static void play(LinkedList<Song> playList) {
		  ListIterator<Song> listIterator=playList.listIterator();
		  if(playList.size()==0) {
			  System.out.println("No song in playlist");
		  }else {
			  System.out.println("Now playing "+listIterator.next().toString());
		  }
		  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
