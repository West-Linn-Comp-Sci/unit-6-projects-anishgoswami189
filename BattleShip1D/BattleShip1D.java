public class BattleShip1D{
  int[] grid;

  public BattleShip1D(){
    this.grid = new int[7];
  }
  
  public void placeShip(int begCord){
    for(int i = 0; i < 3; i++){
      this.grid[i + begCord - 1] = 1;
    }
  }

  public boolean isLost(){
    for(int i = 0; i < grid.length; i++){
      if(grid[i] == 1){
        return false;
      }
    }

    return true;
  }

  public boolean fire(int cord){
    if(grid[cord-1] == 1){
      grid[cord-1] = 0;
      return true;
    }

    return false;
  }

}