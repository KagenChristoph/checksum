import java.util.Scanner;

class checksum  
{  

  public static void main(String args[]) {

    final int max_int = 255;  // The maximum size for the input
    int count = 10;           // The number of integers to read from stdin
    int sum = 0;              // Note that the "sum" might exceed max_int
    int checksum = 0;         // The value of the 6th input integer
    int quotient;             // The result of evaluating the assignment:  quotient   = sum / (max_int + 1);
    int remainder;            // The result of evaluating the assignment:  remainder  = sum % (max_int + 1 );
    int complement;           // The result of evaluationg the assignment: complement = max_int - sum;
    int checkPass = 5;
    Scanner input = new Scanner(System.in);
	for(int i = 0;i < count; i++)
	{
		int curVal = input.nextInt();
		if(i == checkPass)
		{
			checksum = curVal;
			curVal = 0;
		}
		if (curVal > max_int || curVal < 0)
		{
			System.out.print("Input out of correct range: EXITING");
			System.exit(0);
		}
		sum += curVal;
	}
	quotient   = sum / (max_int + 1);
	remainder  = sum % (max_int + 1 );
	sum = quotient + remainder;
	complement = max_int - sum;
  System.out.printf("Stored Checksum: %d, Computed Checksum: %d\n", checksum, complement);
  if (checksum != complement ) {
    System.err.printf("Error Detected!\n");  
  }
  
}
}