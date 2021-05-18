import java.util.Scanner;

public class Runner{
  int moveCount;
  int playerTurn;
  BattleShip1D player1;
  BattleShip1D player2; 
  int winner;

  public Runner(){
    this.moveCount = 1;
    this.playerTurn = 1;
    player1 = new BattleShip1D();
    player2 = new BattleShip1D();
  }

  public int winner(){
    if(player1.isLost()){
      return 2;
    }

    if(player2.isLost()){
      return 1;
    }

    return 0;
  }

  public int calculateRating(int player){
    if(player == this.winner()){
      return (7 - this.moveCount) * 3 + 7;
    }
    

    else{
      return (this.moveCount-7); 
      
    }
  }

  public void runGame(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Player 1 enter the starting coordinate of your ship");
      int coord1 = sc.nextInt();
      System.out.println("Player 2 enter the starting coordinate of your ship");
      int coord2 = sc.nextInt();
      this.player1.placeShip(coord1);
      this.player2.placeShip(coord2);

      int gameOver = 0;
      int fire1;
      int fire2;
      while(true){
        System.out.println("Player 1 enter a coordinate to fire");
        fire1 = sc.nextInt();
        if(player2
        .fire(fire1)){
          System.out.println("Hit");
        }
        else{
          System.out.println("Miss");
        }

        if(this.winner() == 1){
          System.out.println("Congratulations Player 1, you have sunk the enemy ship");
          System.out.println("Your rating is "+ this.calculateRating(1));
          System.out.println(this.moveCount);
          break;
        }

        System.out.println("Player 2 enter a coordinate to fire");
        fire2 = sc.nextInt();
        if(player1.fire(fire2)){
          System.out.println("Hit");
        }
        else{
          System.out.println("Miss");
        }

        if(this.winner() == 2){
          System.out.println("Congratulations Player 2, you have sunk the enemy ship");
          System.out.println("Your rating is "+ this.calculateRating(2));
          break;
        }

        this.moveCount++;


        
      }
  }

}