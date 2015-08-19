package java_OOP;

public class SongApp {

	public static void main(String[] args) {
		Song s = new Song();
		s.setTitle("좋은날");
		s.setArtist("아이유");
		s.setAlbum("Real");
		s.setComposer("이민수");
		s.setTrack(3);
		s.setYear(2010);
	
		int year = s.getYear();
		System.out.println(year);
		s.show();
		
		Song s2 = new Song("좋은날","아이유","Real","이민수",3 , 2010);
		s2.show();
		
		Song s3 = new Song("러빙유","씨스타");
		s3.show();
		
	}

}
