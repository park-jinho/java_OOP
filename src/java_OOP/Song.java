package java_OOP;

public class Song {
	//static변수 메소드영역 클래스명.접근 
	public static int countOfSong;
	
	//지역변수 stack저장
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	//인스턴스변수 힙저장 
	//참조변수 에저장해사용 참조변수.접근
	
	public Song(String title, String artist, String album, String composer,
			    int track, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.track = track;
		this.year = year;
	}
	
	public Song() {}
	
	public Song(String title, String artist) {
		this.title = "["+title+"]";
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println(artist +title+ "("+album+", "+year+", "+track+")");
	}
	
}
