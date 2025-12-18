import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
	// input Array
	System.out.println("Enter number of elements: ");
	int n = sc.nextInt();
	
	int[] nums = new int[n];
	
	System.out.println("Enter sorted elements:");
	for(int i = 0; i < n; i++){
	    nums[i] = sc.nextInt();
	}
	
	//Input target 
	System.out.println("Enter Target element: ");
	int target = sc.nextInt();
		
		int low = 0;
		int high = nums.length - 1;
		boolean found = false;
		
		
		while(low <= high){
		int mid = (low + high)/2;
		
		if (nums[mid] == target){
		    found = true;
		    break;}
	
		else if(nums[mid] > target){
		    
		        high = mid -1;
		    }
		    else{
		        low = mid +1;
		  }
		
    }
		if(found){
		    System.out.println("Target found");}
		else{
		    System.out.println("Target not found");}
		}	
}
