public class Repeat4
{
	public static void main(String[] args)
	{
	  String seq= "GATCGCAATGATCTAAGTAATGACTAAGTCAAATGC";
      String rep = "AAT";
      int n= seq.length();
	  int m= rep.length();
	  int c=0;
      
      for(int i=0; i<n; i++)
      {
              
         for(int j=0; j<m; j++)
          { 
               if(seq[i]==rep[j])
               {
                 c++;
               }
               i++;
          } 
            if(c==3)
            {
               n=n+1;               
            }          
      }     

       System.out.println("  --------------------------------------");
       System.out.println("  Your sequence is '"+seq+"'");
	   System.out.println("  Your repeat is '"+rep+"'");
	   
      if(n>=1)
        System.out.println("  The repeat is present "+n+" time(s)");
      else
        System.out.println("  The repeat is absent");        
      System.out.println("  Thank you!");     
       System.out.println("  --------------------------------------");
	}
}	