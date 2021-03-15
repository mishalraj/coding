
public class SearchInRotatedArray {

	 public boolean search(int[] nums, int target) {
	        if(nums.length==0) return false;
			if(target>nums[0]){
				int i=1;
				while(i<nums.length){
					if(target<nums[i]){
						return false;
					}else if(target==nums[i]){
						return true;
					}
					i++;
				}
			}else if(target<nums[0]){
				int i=nums.length-1;
				while(i>0){
					if(target>nums[i]){
						return false;
					}else if(target==nums[i]){
						return true;
					}
					i--;
				}
			}
			else{
				return true;
			}
	         return false;
	    }
	 
	public static void main(String[] args) {
		
		int arr[]= {2,5,6,0,0,1,2};
		
		int target=0;
		
		SearchInRotatedArray obj= new SearchInRotatedArray();
		System.out.println(obj.search(arr,target));
	}

}
