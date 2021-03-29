package stringTest;

public class PoolMemTest {

	public static void main(String[] args) {

		String s3= "Cat";
		String s4="Cat";
		
		String s1= new String("Cat");
		String s2= new String("Cat");
		
		System.out.println(s4==s3);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.contentEquals(s2));

			
	}

}
