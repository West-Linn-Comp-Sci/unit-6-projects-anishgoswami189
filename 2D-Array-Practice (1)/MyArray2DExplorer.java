public class MyArray2DExplorer{
    public int minRow(int[][] nums, int row){
    int min = nums[row][0];
    for(int i = 1; i < nums[row-1].length; i++){
      if(min > nums[row-1][i]){
        min = nums[row-1][i];
      }
    }

    return min;
  }

  public int[] allRowSums(int[][] data){
    int[] sum = new int[data.length];
    for(int i = 0; i < data.length; i++){
      for(int j = 0; j < data[0].length; j++){
        sum[i] += data[i][j];
      }
    }

    return sum;
    
  }

  public int[] colMaxs(int[][] matrix){
    int[] largest = new int[matrix[0].length];
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        if(matrix[i][j] > largest[j]){
          largest[j] = matrix[i][j];
        }
      }
    }

    return largest;
  }

  public double[] averageCol(int[][] nums){
    double[] averages = new double[nums[0].length];
    int[] sums = new int[nums[0].length];
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[0].length; j++){
        sums[j] += nums[i][j];
      }
    }

    for(int i = 0; i < nums[0].length; i++){
      averages[i] = (double) sums[i]/nums.length;
    }

  return averages;
  }

  public int smallEven(int[][] matrix){
    int even = 10000;
    boolean foundEven = false;

    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        if(matrix[i][j] % 2 == 0 && foundEven == false){
          foundEven = true;
          even = matrix[i][j];
          continue;
        }

        if(matrix[i][j] % 2 == 0 && matrix[i][j] < even){
          even = matrix[i][j];
        }
      }
    }

    return even;
  }

  public int biggestRow(int[][] nums){
    int greatest = 0;
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[0].length; j++){
        sum += nums[i][j];
      }
      if(sum > greatest){
        greatest = sum;
      }
      sum = 0;
    }

    return sum;
  }
}