package array;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		MySong ms1 = new MySong("My heart will go on", "Titanic", "Celine",1996);
		MySong ms2 = new MySong("Kolavari D", "IDK", "Dhanush",2012);
		MySong ms3 = new MySong("Chand Baliyaa", "Album001", "IDK",2021);
		MySong ms4 = new MySong("All is well", "3 Idiots", "Arjit",2010);
		MySong ms5 = new MySong("Kaam 25", "Sacred Games", "Raftaar",2020);
		MySong ms6 = new MySong("Tune Jo na kaha", "NewYork", "Mohit chauhan",2016);

		DoublyLinkedList dllList = new DoublyLinkedList();
		dllList.showAllSongs();
		
		dllList.addSong(ms1);
		dllList.addSong(ms2);
		dllList.addSong(ms3);
		dllList.addSong(ms4);
		dllList.addSong(ms5);
		
		dllList.showAllSongs();
		dllList.insertSong(ms4, ms6);
		dllList.showAllSongs();

	}

}

class MySong{
	String title;
	String album;
	String artist;
	int year;
	
	public MySong(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "MySong [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}


	MySong prev;
	MySong next;
}

class DoublyLinkedList{
	MySong start = null, ptr;
	
	
	void addSong(MySong newSong) {
		if(start == null) {
			System.out.println("JukeBox is empty..");
			start = newSong;
			start.prev = null;
			start.next = null;
			System.out.println("Added the first song...");
			
		}
		else if(start.next == null) {
			start.next  = newSong;
			newSong.prev = start;
			newSong.next = null;
		}
		else {
			ptr = start.next;
			while(ptr.next!=null) { 
				ptr=ptr.next;
			}
			ptr.next = newSong;
			newSong.prev = ptr;
			newSong.next = null;	
			System.out.println("ADDED the INTERNAL Song.....");
		}
	} 
	
	
	void showAllSongs() {
		if(start==null) {
			System.out.println("Juke box is empty....");
		}
		else {
			
			ptr = start;
			
			while(ptr!=null) {
				System.out.println("DATA : "+ptr);
				System.out.println("------------------");
				ptr=ptr.next;
			}
		}
	}
	
	
	void insertSong(MySong Addforsong, MySong SongToAdd ) {
		   boolean Found=false;
		   if(start==null) {
			   System.out.println("juke box is empty....NO song to find");
		   }
		   else if (start.next == null){
			   System.out.println("only one song is present in list");
			   SongToAdd.next=start;
			   SongToAdd.prev=null;
		   }
		   else {
			   ptr=start;
			   while(ptr!=null) {
				   if(ptr==Addforsong) {
					   System.out.println("found given song "+Addforsong);
					   
					   Found=true;
					   break;
				   }
				   ptr=ptr.next;
			   }
			   if(Found==true) {
				   System.out.println("Inserting Song"+SongToAdd);
				   SongToAdd.prev=ptr.prev;
				   SongToAdd.prev.next=SongToAdd;
				   SongToAdd.next=ptr;
				   ptr.prev=SongToAdd;   
			   }
			   else if(Found!=true) {
				   System.out.println("cant find the given songs");
			   }
		   }
		   
		   
	   }
	}


