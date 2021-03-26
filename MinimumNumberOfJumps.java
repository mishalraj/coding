//Time complexity : O(n) space complexity : O(1);
public class MinimumNumberOfJumps {
    public static void main(String args[])
    {
        int arr []= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        System.out.println(findNumberOfJumps(arr));

    }

    private static int findNumberOfJumps(int[] arr) {

        int maxReach=arr[0];
        int steps= arr[0];
        int jumps=1;

        for(int i=1;i<arr.length;i++)
        {
            if(i == arr.length - 1)
                return jumps;
          maxReach = Math.max(maxReach, i+arr[i]);
          steps--;

          if(steps==0) {
              jumps++;

              if (i >= maxReach)
                  return -1;

              steps = maxReach - i;
          }
        }
        return -1;
    }
}
