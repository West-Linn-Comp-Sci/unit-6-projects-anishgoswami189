class Main {
  public static void main(String[] args) {

    int[] nums = {45, 34, 99, 5, 12, 23, 56, 77, 88};

    creation(nums); 
  }

  public static void creation(int[] nums){
    int range1 = 0;
    int range2 = 0;
    int range3 = 0;
    int range4 = 0;
    int range5 = 0;
    int range6 = 0;
    int range7 = 0;
    int range8 = 0;
    int range9 = 0;
    int range10 = 0;

    for(int i = 0; i < nums.length; i++){
      if(nums[i] >= 1 && nums[i] <= 10){
        range1++;
      }

      if(nums[i] >= 11 && nums[i] <= 20){
        range2++;
      }

      if(nums[i] >= 21 && nums[i] <= 30){
        range3++;
      }

      if(nums[i] >= 31 && nums[i] <= 40){
        range4++;
      }

      if(nums[i] >= 41 && nums[i] <= 50){
        range5++;
      }

      if(nums[i] >= 51 && nums[i] <= 60){
        range6++;
      }

      if(nums[i] >= 61 && nums[i] <= 70){
        range7++;
      }

      if(nums[i] >= 71 && nums[i] <= 80){
        range8++;
      }

      if(nums[i] >= 81 && nums[i] <= 90){
        range9++;
      }

      if(nums[i] >= 91 && nums[i] <= 100){
        range10++;
      }



    }

  System.out.print("1 - 10 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();

  System.out.print("11 - 20 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();

  System.out.print("21 - 30 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();

  System.out.print("31 - 40 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();

  System.out.print("41 - 50 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();

  System.out.print("51 - 60 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();

  System.out.print("61 - 70 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();

  System.out.print("71 - 80 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();

  System.out.print("81 - 90 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  System.out.println();
  
  System.out.print("91 - 100 |");
  for(int i = 0; i < range1; i++){
    System.out.print("*");
  }

  }
}
