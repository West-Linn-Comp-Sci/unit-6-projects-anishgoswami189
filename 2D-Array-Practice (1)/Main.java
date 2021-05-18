class Main {
  public static void main(String[] args) {
    int array [][] = {  {4,1,8,5},
                        {0,2,3,4},
                        {6,6,2,2} };
    MyArray2DExplorer exp = new MyArray2DExplorer();



    System.out.println();

    System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
    System.out.println(exp.minRow(array, 2));

    System.out.println();

    System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
    int [] colMaxs = exp.colMaxs(array);
    for(int i = 0; i < colMaxs.length; i++){
      System.out.print(colMaxs[i] + " ");
    }
    System.out.print("}");

    System.out.println();
    System.out.println();

    System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
    int [] sum = exp.allRowSums(array);
    for(int i = 0; i < sum.length; i++){
      System.out.print(sum[i] + " ");
    }
    System.out.print("}");

    System.out.println();
    System.out.println();

    System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
    double [] avg = exp.averageCol(array);
    for(int i = 0; i < avg.length; i++){
      System.out.print(avg[i] + " ");
    }
    System.out.print("}");


    System.out.println();
    System.out.println();

    System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
    System.out.println(exp.smallEven(array));

    System.out.println();
    System.out.println();

    System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
    System.out.println(exp.biggestRow(array));

    System.out.println();

  }


}

