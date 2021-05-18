

public class Person{
  private int myAge;
  private String myName;

  Person(int Age, String name){
    this.myAge = Age;
    this.myName = name;

  }

  public String getName(){
    return this.myName;
  }

  public int getAge(){
    return this.myAge;
  }

}