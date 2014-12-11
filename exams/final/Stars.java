    public class Stars
    {
	public static void main (String[] args)
	{
	    final int MAX_ROWS = 10;

	    for (int row = 1; row <= MAX_ROWS; row++)
		{
		    for (int star = 1; star <= row; star++)
			{
			    System.out.print ("(" + row + "," + star + ")");
			}
		    System.out.println();
		}
	    for (int row = MAX_ROWS; row >= 0; row--)
		{
		    for (int star = row; star >= 0; star--)
			{
			    System.out.print ("(" + row + "," + star + ")");
			    //System.out.print ("*");
			}
		    System.out.println();
		}

	    

	}
    }