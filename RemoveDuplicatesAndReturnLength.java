package arrays;

public class RemoveDuplicatesAndReturnLength {
	
	 public static int removeDuplicates(int[] nums) {
	       int length= nums.length;
	         int x= nums[0];
	        for(int i=1;i<length;i++)
	        {
	           if(nums[i]==x)
	               length--;
	            
	            else
	                x=nums[i];
	        }
	        
	        return length;
	    }

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,4,4,5};
		
		System.out.println(removeDuplicates(arr));
	}

}
