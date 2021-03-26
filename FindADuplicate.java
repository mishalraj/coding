//assumptions : all the elements element>0 && <=n
// time complexity : O(n) and space complexity : O(1);

public class FindADuplicate {
    public static void main(String str[])
    {
        int arr[]= {1, 2, 3, 2, 3, 4};

       findDuplicate(arr);
    }

    private static void findDuplicate(int[] arr) {
        for(int i =0;i<arr.length; i++)
        {
            int temp= Math.abs(arr[i]);

            if(arr[temp]>0)
            {
                arr[temp]= Math.abs(arr[temp])*(-1);
            }
            else
            {
                System.out.print(arr[temp]*(-1));
                return;             // if we want all the duplicates just remove this return statement;
            }
        }
    }
}
