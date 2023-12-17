
public class averagescore {

	public static void main(String[] args) {
		
		int over [] = {2,1,0,0,4,6,0,1,1,4,4,4,1,1,0,0,4,4,0,0,2,2,6,6};
		int score [] = {40,55,20,5};
		int dot=0, single=0, two =0, boundries=0,sixes=0, totscore1=0,totscore2=0, count1=0;
		float average=0;
		
		for(int i=0; i<over.length; i++) {

             if(over[i]==0) {
            	 
            	dot++;
             }
             else if(over[i]==1) {
            	 single++;
             }
             else if(over[i]==2) {
            	 two++;
             }
             else if(over[i]==4) {
            	 boundries++;
             }
             else if(over[i]==6) {
            	 sixes++;
             }      
            	
		} 
		
		for(int j=0; j<over.length; j++ ) {
       	 
       	 totscore1 = totscore1+over[j];
       	
        }

       for(int k=0; k<score.length; k++) {
    	   totscore2 = totscore2+score[k];
    	   count1++;
       }
	
	   average = (totscore1 + totscore2) / (count1 + 1);
	   
	   System.out.println("Number of dot ball faced by batter : " +  dot + 
			              "\nNumber of single's: " + single +
			              "\nNumber of two's: "+ two +
			              "\nNumber of boundries: " + boundries +
			              "\nNumber of sixes: " + sixes +
			              "\nTotal Score in the match: "+ totscore1+
			              "\nAverage score in this series: " + average
			   );
	
	}

}
