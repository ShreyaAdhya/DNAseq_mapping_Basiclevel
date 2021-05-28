public class FreqDNA
{
   public static void main(String[] args) 
	{
	   String seq= "attacgctcgctatgcggtattactagctagctagctactaggctagcttggaactata";
	   
	   int n = seq.length();
	   int ac=0, cc=0, gc=0, tc=0,minf=0, maxf=0;
	   float fa=0, fc=0, fg=0, ft=0;
	   for(int i=0;i<n;i++)
	   {
	      switch(seq.charAt(i))
	      {
	          case 'a': case 'A': ac++;
	          break;
	          
	          case 'c': case 'C': cc++;
	          break;
	          
	          case 'g': case 'G': gc++;
	          break;
	          
	          case 't': case 'T': tc++;
	          break;
	              
	      }
	   }   
	    
	   fa = (ac*100)/n;
	   fc = (cc*100)/n;
	   fg = (gc*100)/n;
	   ft = (tc*100)/n;
	   
	   maxf = Math.max(gc,Math.max(tc,Math.max(ac,cc)));
	   minf = Math.min(gc,Math.min(tc,Math.min(ac,cc)));
	  
	   
	   
	   System.out.println("\n  Your sequence is '"+seq+"'");
	   
	   System.out.println("\n  ---------------------------------");
	   System.out.println("   TABLE 1 :    Base  Percentage %");
	   System.out.println("  ---------------------------------");
	   System.out.println("\t\tA\t"+fa);
	   System.out.println("\t\tT\t"+ft);
	   System.out.println("\t\tC\t"+fc);
	   System.out.println("\t\tG\t"+fg);
	   System.out.println("  ---------------------------------");
	   System.out.println("   TABLE 2 :   Base  Frequency");
	   System.out.println("  ---------------------------------");
	   System.out.println("\t\tA\t  "+ac);
	   System.out.println("\t\tT\t  "+tc);
	   System.out.println("\t\tC\t  "+cc);
	   System.out.println("\t\tG\t  "+gc);
	   
	   System.out.println("\n    Maximum frequency is "+maxf);
	   System.out.println("    Minimum frequency is "+minf);
	   System.out.println("  ---------------------------------\n");
	}	   
}