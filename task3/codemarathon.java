import java.util.*;

public class codemarathon {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Total Participants");
	int N=sc.nextInt();
	
	
	int [] arr = new int [N];
	
	int temp=0;
	
	for(int i=0; i<arr.length;i++){
		System.out.print("Enter the number");
		arr[i] = sc.nextInt();
	}
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
		
		for(int i=0; i<arr.length; i++) {
			for( int j=i+1; j<arr.length;j++) {
				
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;					
										
				}
						
			}
			
		}
		
		System.out.print("Enter the Top score number");
		int topscore=sc.nextInt();
		int sum=0;
		
		for(int i= N-1; i>=topscore; i--) {
	
			 sum=sum+arr[i];
			 
		}
	
		System.out.println(sum);
		
	
		
	}
}
