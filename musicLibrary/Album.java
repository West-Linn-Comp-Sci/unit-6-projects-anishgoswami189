public class Album{
  String title;
  String Artist;
  int tracks;
  double playTime;

  public Album(String title, String Artist, int tracks, double playTime){
    this.title = title;
    this.Artist = Artist;
    this.tracks = tracks;
    this.playTime = playTime;
  }

  public String toString(){
    
    return "Title: " + this.title + " Artist: " + this.Artist + " Tracks: " + this.tracks + " play time: " + this.playTime;
  }

  public String getTitle(){
    return this.title;
  }

  public String getArtist(){
    return this.Artist;
  }

  public int getTracks(){
    return this.tracks;
  }

  public double getPlayTime(){
    return this.playTime;
  }
}