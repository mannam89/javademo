package java006_class.part09;

import java.util.Arrays;

public class Song {
	String title; // 노래제목
	String artist; // 가수
	String album; // 앨범
	String[] composer; // 작곡가
	int year; // 년도
	int track; // 트랙
	
	public Song() {
		
	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void display() {
		System.out.printf("노래제목: %s\n가수: %s\n앨범: %s\n작곡가: %s\n년도: %d\n트랙: %d\n",title,artist,album,String.join(", ",composer),year,track);
	}
}// end class
