public class GCcount
{
   public static void main(String[] args) 
	{
	   String seq= "attacgctcgctatgcggtattactagctagctagctactaggctagcttggaactata";
	   
	   int n = seq.length();
	   int ac=0, cc=0, gc=0, tc=0, iv=0;
	   float gcp=0;
	   for(int i=0;i<n;i++)
	   {
	      switch(seq.charAt(i))
	      {
	          case 'a':case 'A': ac++;
	          break;
	          
	          case 'c':case 'C': cc++;
	          break;
	          
	          case 'g':case 'G': gc++;
	          break;
	          
	          case 't':case 'T': tc++;
	          break;
			  
			  default:iv++;
			  break;	  
		   }
	   }
	   
	   gcp = cc+gc;
	   gcp = (gcp/n)*100;	   
	   
	   System.out.println("Your sequence is '"+seq+"'");
	   System.out.println("\n-----------------------------------");
	   System.out.println("\tBase\tCount");
	   System.out.println("-----------------------------------");
	   System.out.println("\t A\t "+ac);
	   System.out.println("\t T\t "+tc);
	   System.out.println("\t C\t "+cc);
	   System.out.println("\t G\t "+gc);
	   System.out.println("\n    Invalid outputs : "+iv);
	   System.out.println("    GC % is "+gcp);
	   System.out.println("-----------------------------------");
	   
	}	   
}
