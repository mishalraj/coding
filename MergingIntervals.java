
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
 class intervals
{
	 int start;
	 int end;
	 intervals(int x, int y)
	 {
		this.start= x;
		this.end = y;
	 }
	 
}
public class MergingIntervals {
	
	 public static void mergeIntervals(intervals arr[])
	 {
		 Stack <intervals> stack = new Stack<>();
		 Arrays.sort(arr, new Comparator<intervals>(){
			 public int compare(intervals i1, intervals i2)
			 {
				 return i1.start - i2.start;
			 }
		 });
		 
		 stack.push(arr[0]);
		 for(int i =1;i<arr.length;i++)
		 {
			 intervals top = stack.peek();
			 if(top.start< arr[i].start)
			 {
				 stack.push(arr[i]);
			 }
			 else if (top.start< arr[i].end)
			 {
				 top.end= arr[i].end;
				 stack.pop();
				 stack.push(top);
			 }
		 }
		 
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intervals arr[]= new intervals[4];
		
	
	    arr[0]=new intervals(6,8); 
        arr[1]=new intervals(1,9); 
        arr[2]=new intervals(2,4); 
        arr[3]=new intervals(4,7); 
        
        mergeIntervals(arr); 

	}

}
