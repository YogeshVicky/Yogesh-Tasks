
public class ArrayEqual {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int arr2[]= {1,2,3,4,5};            //comparing size and elements of arrays
	
	boolean equal = true;
	
	if(arr.length == arr2.length) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!= arr2[i])
				equal=false;
		}
	}
	
	else {
		equal=false;
	}
	
	
	if(equal) {
		System.out.println("Arrays are equal");
	}
	else {
		System.out.println("Arrays are not equal");
	}
	
}
}
