public class DNAgap
{
	public static void main(String[] args) 
	{
	   String seq= "attacgctcg_ctatgcggt a ttactagctagctagc t actagg__ctagcttggaactata ";	   
	   int n = seq.length();
	   System.out.print("  -------------------------------------------------");
	  System.out.println("\n  Your input sequence is   : '"+seq+"'");
	   
	   int c=0, d=0;
	   float t=0;
	   
	   for(int i=0;i<n;i++)
	   {
	      if (seq.charAt(i)==' ')
	         c++;
	      if (seq.charAt(i)=='_')
	         d++;
	   }
	   t=c+d;
	   
	   System.out.print("\n  Number of gaps :   "+c);
	   System.out.print("\n  Number of underscores :   "+d);
	   
	   System.out.print("\n\n  Percentage of gaps :   "+(c/t)*100);
	   System.out.print("\n  Percentage of underscores :   "+(d/t)*100);
	   System.out.println("\n  -------------------------------------------------");
	}	   
}
