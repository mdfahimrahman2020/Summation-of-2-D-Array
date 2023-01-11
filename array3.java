import java.util.Scanner;
public class array3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		

		int[][] A = new int[2][3];
		int[][] B = new int[2][3];
		int[][] c = new int[2][3];

        System.out.print("\n\n\n\t\"2-D ARRAY\"");

		System.out.print("\n\n\nRow number = 2 and Column number = 3. So the total number of elements are 2x3 = 6 for A matrix.");
		System.out.println("\n\nEnter number for A marix : ");

        //Getting input for matrix A.
	    for (int row = 0; row<2; row++)
	    {
	    	for(int col = 0; col < 3; col++)
	    	{
	    		System.out.printf("A[%d][%d] = ", row,col);
	    		A[row][col] = input.nextInt();
	    	}
	    }


	    System.out.print("\n\n\nRow number = 2 and Column number = 3. So the total number of elements are 2x3 = 6 for B matrix.");
		System.out.println("\n\nEnter number for B marix : ");
        //Getting input for B matrix.
	    for (int row = 0; row<2; row++)
	    {
	    	for(int col = 0; col < 3; col++)
	    	{
	    		System.out.printf("B[%d][%d] = ", row,col);
	    		B[row][col] = input.nextInt();
	    	}
	    }

        

        //Printing A matrix.
	    System.out.print("\n\nA =  ");
	    for(int row = 0; row < 2; row++)
	    {
	    	for(int col = 0; col<3; col++)
	    	{
	    		System.out.print("\t"+A[row][col]);
	    	}
	    	System.out.println();
	    }

  

        

	    //Printing B matrix.
	    System.out.print("\n\nB =  ");
	    for(int row = 0; row < 2; row++)
	    {
	    	for(int col = 0; col<3; col++)
	    	{
	    		System.out.print("\t"+B[row][col]);
	    	}
	    	System.out.println();
	    }


	    //Printing A+B matrix.
	    System.out.print("\n\nA+B =  ");
	    for(int row = 0; row < 2; row++)
	    {
	    	for(int col = 0; col<3; col++)
	    	{
	    		System.out.print("\t"+(A[row][col]+B[row][col]));
	    	}
	    	System.out.println();
	    }




	    
	}     


}