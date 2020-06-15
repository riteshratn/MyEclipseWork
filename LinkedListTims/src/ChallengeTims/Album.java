package ChallengeTims;
import java.util.ArrayList;

public class Album {
       private String name;
       private String artist;
       private ArrayList<Song> songs;
       
       public Album(String name,String artist) {
    	   this.name=name;
    	   this.artist=artist;
    	   this.songs=songs;
    	   
       }
	public boolean addSong(String title,double duration) {
		if(findSong(title)==null) {
			this.songs.add(new Song(title,duration));
			return true;
		}
		return false;
	}
	private Song findSong(String title) {
		for(Song checkedSong:this.songs) {
			if(checkedSong.getTitle().contentEquals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	public boolean addToPlayList(int trackNumber,LinkedList<Song> playList) {
		int index=trackNumber-1;
		if((index>=0)&&(index<=this.songs.size())){
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track "+trackNumber);
		return false;
	}
	public boolean addToPlayList(String title,LinkedList<Song> playList) {
		if(checkedSong!=null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("This song" +title + "is not in album");
		return false;
	}
}
