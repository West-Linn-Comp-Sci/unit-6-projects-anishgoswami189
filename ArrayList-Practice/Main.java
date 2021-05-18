import java.util.ArrayList; 
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println("Test Remove Zeros");
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,0,1,4,0,6,0));
    System.out.println("Starting List: " + nums);
    removeZeros(nums);
    System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

    System.out.println();

    ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
    System.out.println("Test Letter Counter:");
    System.out.println(words);
    System.out.println("Expected: 18 \n Actual: " + countLetters(words));

    System.out.println();

    System.out.println("Test keyPosition: find a 1");
    System.out.println(nums);
    System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

    System.out.println();

    System.out.println("Test parse into array");
    System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " + parseIntoArrayList("West Linn"));

    System.out.println();

    System.out.println("Test FindMin for Personobjects");
    ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(new Person(32, "Abe"),
    new Person(14, "Betty"), new Person(18, "Cris")));
    System.out.println(people);
    System.out.println("Expected: BETTY \n Actual: " + findMin(people));

    System.out.println();

    System.out.println("Purse Test:");
    Purse myPurse = new Purse();
    myPurse.add(new Coin(.25, "quarter"));
    myPurse.add(new Coin(.05, "nickel"));
    myPurse.add(new Coin(.01, "penny"));
    myPurse.add(new Coin(.25, "quarter"));

    System.out.println(myPurse);
    System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
    System.out.println("Smallest Coin = " + myPurse.findSmallest());
    System.out.println("Total of Purse = $" + myPurse.getTotal());

    }

  public static void removeZeros(ArrayList<Integer> list){
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) == 0){
        list.remove(i);
        i--;
      }
    }
  }

  public static int countLetters(ArrayList<String> list){
    int sum = 0;
    for(int i = 0; i < list.size(); i++){
      sum += list.get(i).length();
    }

    return sum;
  }

  public static int findPosition(int keyValue, ArrayList<Integer> list){
    int key = -1;
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) == keyValue){
        key = i;
        break;
      }
    }

    return key;
  }


  public static ArrayList parseIntoArrayList(String str){
    ArrayList<Character> parsed = new ArrayList<Character>();
    for(int i = 0; i < str.length(); i++){
      parsed.add(str.charAt(i));
    }

    return parsed;
  }

  public static String findMin(ArrayList<Person> list){
    int min = list.get(0).getAge();
    String minName = list.get(0).getName();

    for(int i = 1; i < list.size(); i++){
      if(min > list.get(i).getAge()){
        min = list.get(i).getAge();
        minName = list.get(i).getName();
      }
    }

    return minName;


  }







}
