public class CompDNA
{
	public static void main(String[] args) 
	{
	   String seq= "attacgctcgctatgcggtattactagctagctagctactaggctagcttggaactata";
	   int n = seq.length();
	   System.out.println("\n ---Your input sequence is :     '"+seq+"'");
	   System.out.print("\n ---Complementary sequence is :  '");
	   for(int i=0;i<n;i++)
	   {
	      switch(seq.charAt(i))
	      {
	          case 'a':case 'A': System.out.print("t");
	          break;
	          
	          case 'c':case 'C': System.out.print("g");
	          break;
	          
	          case 'g':case 'G': System.out.print("c");
	          break;
	          
	          case 't':case 'T': System.out.print("a");
	          break;
	              
	      }
	   }
	  System.out.println("'");
	}	   
}
