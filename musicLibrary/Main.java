public class Main {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("ac", "Peoples", 10, 42.5);
        Album a2 = new Album("abcd", "Peo", 9, 36);
        Album a3 = new Album("ab", "People", 12, 39.1);
        Album a4 = new Album("abc", "Peopl", 12, 39.1);
        Album a5 = new Album("abcdef", "Peopl", 12, 39.1);
        Album a6 = new Album("abcde", "P", 12, 39.1);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        System.out.println(myLibrary);
        myLibrary.selectionSort();
        System.out.println(myLibrary);
        System.out.println(myLibrary.binarySearchTitle("abc"));
        System.out.println(myLibrary.linearSearchTitle("abc"));
        myLibrary.insertionSort();
        System.out.println(myLibrary);

        System.out.println(myLibrary.binarySearchArtist("Peo"));
        System.out.println(myLibrary.linearSearchArtist("Peo"));

        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}