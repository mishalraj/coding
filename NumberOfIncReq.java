
public class NumberOfIncReq {
	
	private int findNumOfInc(int a[],int b[])
	{
		int count=0;
		int num1=0;
		int num2=0;
		int digit1=0;
		int digit2=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			num1= a[i];
			num2= b[i];
			
			while(num1!=0 && num2!=0)
			{
				digit1= num1%10;
				digit2= num2%10;
				
				count+= Math.abs(digit1-digit2);
				num1=num1/10;
				num2= num2/10;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		int a[]= {134,245};
		int b[]= {254,345};
		NumberOfIncReq obj = new NumberOfIncReq();
		System.out.println(obj.findNumOfInc(a,b));	
	}

}
