public class MusicLibrary{
  Album[] library;
  int librarySize;
  int nextIndex;

  public MusicLibrary(){
    this.librarySize = 0;
    this.nextIndex = 0;

  }

  public void add(Album album){
    if(nextIndex >= this.librarySize){
      Album[] tempLibrary = new Album[librarySize + 1];
      if(librarySize == 0){
        this.library = tempLibrary;
      }
      else{
        this.copyLibrary(this.library, tempLibrary);
        this.library = tempLibrary;
      }
      
      this.librarySize++;
      tempLibrary[nextIndex] = album;
      nextIndex++;
    }
    else{
      this.library[nextIndex] = album;
      nextIndex++;
    }

  }

  public void doubleSize(){
    Album[] tempLibrary = new Album[this.librarySize * 2];
    this.copyLibrary(this.library, tempLibrary);
    this.library = tempLibrary;
    System.out.println(this.library.length);
    this.librarySize *= 2;

  } 

  public void remove(int index){
    Album[] tempLibrary = new Album[this.librarySize - 1];
    for(int i = 0; i < this.librarySize-1; i++){
      if(index < i){
        tempLibrary[i] = this.library[i];
      }
      else{
        tempLibrary[i] = this.library[i+1];
      }
    }
    this.librarySize -= 1;
    this.nextIndex -= 1;
    this.library = tempLibrary;
  }

  public void copyLibrary(Album[] library1, Album[] library2){
    for(int i = 0; i < library1.length; i++){
      library2[i] = library1[i];
    }

  }

  public String toString(){
    String info = "";
    for(int i = 0; i < this.nextIndex; i++){
      info += this.library[i].toString() + "\n";
    }
    for(int i = nextIndex; i < this.librarySize; i++){
      info += "Empty Album \n";
    }

    return info;
  }

  public int linearSearchArtist(String Artist){
    for(int i = 0; i < this.library.length; i++){
      if(this.library[i].getArtist().equals(Artist)){
        return i;
      }
    }

    return -1;
  }

  public int linearSearchTitle(String Title){
    for(int i = 0; i < this.library.length; i++){
      if(this.library[i].getTitle().equals(Title)){
        return i;
      }
    }

    return -1;

  }
  
  public void insertionSort(){
    int n = this.library.length;
    for (int i = 1; i < n; ++i) {
      Album key = this.library[i];
      int j = i - 1;
 

        while (j >= 0 && this.library[j].getArtist().length() > key.getArtist().length()) {
          this.library[j + 1] = this.library[j];
          j = j - 1;
        }
        this.library[j + 1] = key;
    }
  }

  
  public void selectionSort(){  
    for (int i = 0; i < this.library.length - 1; i++)  
    {  
      int index = i;  
      for (int j = i + 1; j < this.library.length; j++){  
        if (this.library[j].getTitle().length() < this.library[index].getTitle().length()){  
            index = j;//searching for lowest index  
        }  
      }  
      Album temp = this.library[index];   
      this.library[index] = this.library[i];  
      this.library[i] = temp;  
    }  
  }  


  public int binarySearchTitle(String title){
    int l = 0;
    int h =  this.library.length - 1;
    while (l <= h) {
      int m = l + (h - l) / 2;
      if (this.library[m].getTitle().length() == title.length()){
        if(this.library[m].getTitle().equals(title)){
          return m;
        }
      } 
 
      if (this.library[m].getTitle().length() < title.length()){
        l = m + 1;
      }
 
      else{
        h = m - 1;
      }
    }

    return -1;
  }

  public int binarySearchArtist(String artist){
    int l = 0;
    int h =  this.library.length - 1;
    while (l <= h) {
      int m = l + (h - l) / 2;
      if (this.library[m].getArtist().length() == artist.length()){
        if(this.library[m].getArtist().equals(artist)){
          return m;
        }
      } 
 
      if (this.library[m].getArtist().length() < artist.length()){
        l = m + 1;
      }
 
      else{
        h = m - 1;
      }
    }

    return -1;
  }
}