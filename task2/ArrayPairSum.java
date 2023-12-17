import java.util.*;

class arrsum{
	public void sum(int arr[], int arr2[], int num) {
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
			if(arr[i]+arr2[j]==num) {
				
			 System.out.println (arr[i] + " + " + arr2[j] + " = " + num);
			}
			
			}
		
	}
		
	
}
}

public class ArrayPairSum {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number between 1 to 10 : ");
	int num = sc.nextInt();
	
	int [] arr = {1,2,3,4,5,6,7,8,9};
	
	int [] arr2 = {1,2,3,4, 5,6,7,8,9};
	
	arrsum s1 = new arrsum();
	s1.sum(arr, arr2, num);
			
		}
		
	}
	








/*public class ArrayPairSum
{
    static void findThePairs(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
 
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
 
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
 
        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
 
        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
    }
}*/

