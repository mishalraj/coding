public class MergingArrays {

    static int arr1[]= {1, 5, 9, 10, 15, 20};
    static int arr2[]= {2, 3, 8, 13};

    public static void main(String[] args) {

        int m = arr1.length;
        int n = arr2.length;

        sortTwoArrays(m,n);

        for(int i=0;i<m;i++)
        {
            System.out.print(arr1[i]);
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr2[i]);
        }
    }

    private static void sortTwoArrays(int m, int n) {

    }
}
