import java.util.ArrayList; 
public class Purse { 
  private ArrayList<Coin> coins; 
 
  public Purse() { 
  coins = new ArrayList(); 
  }
 
// adds aCoin to the purse 
  public void add(Coin aCoin) { 
    coins.add(aCoin); 
  } 
 

 
// returns the number of coins in the Purse that matches aCoin 
// (both myName & myValue) 
  public int count(Coin aCoin){
    int sum = 0;
    for(int i = 0; i < this.coins.size(); i++){
      if(this.coins.get(i).equals(aCoin)){
        sum++;
      }
    }

    return sum;
  }

  public double getTotal(){
    double sum = 0;
    for(int i = 0; i < this.coins.size(); i++){
      sum += this.coins.get(i).getValue();
    }


    return sum;
  }

  public String findSmallest(){
    Coin min = this.coins.get(0);
    for(int i = 1; i < this.coins.size(); i++){
      if(min.getValue() > this.coins.get(i).getValue()){
        min = this.coins.get(i);
      }
    }

    return min.getName();
  }
 
// returns the name of the Coin in the Purse that has the smallest value 
}
