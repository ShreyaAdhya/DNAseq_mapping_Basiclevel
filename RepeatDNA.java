public class RepeatDNA
{
	public static void main(String[] args)
	{
	   String seq= "AATAAATCAATGTCAGTATCTACGTAGCAAT";
      String rep = "AAT";
      int n= seq.length();
	   int m= rep.length();
	   int r=0;
      
      for(int i=0; i<n; i++)
      {
         int c=0;     
         for(int j=0; j<m; j++)
          { 
             if(seq.charAt(i)==rep.charAt(j))
               {
                 c++;
               }
               i++;
          } 
          System.out.println(c);
            if(c==3)
            {
               r++;               
            }          
      }     

       System.out.println("  --------------------------------------");
       System.out.println("  Your sequence is '"+seq+"'");
	   System.out.println("  Your repeat is '"+rep+"'");
	   
      if(n>=1)
        System.out.println("  The repeat is present "+r+" time(s)");
      else
        System.out.println("  The repeat is absent");        
      System.out.println("  Thank you!");     
       System.out.println("  --------------------------------------");
	}
}	
