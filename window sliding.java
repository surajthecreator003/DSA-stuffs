// Java code for
// O(n) solution for finding
// maximum sum of a subarray
// of size k
class GFG {

    // Returns maximum sum in
    // a subarray of size k.
    static void maxSum(int arr[], int n, int k)
    {
        if (k>n){
            
            System.out.println("fuckkkk bad value");
        }

        int maxsum=0;
        for(int i=0;i<k;i++){
            maxsum=maxsum+arr[i];
        }
        System.out.println(maxsum);

        int windowsum=maxsum;
        for(int i=k;i<n;i++){
            windowsum=windowsum+arr[k]-arr[i-k];


            //find a print solution for k also;
        }

    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        maxSum(arr, n, k);
    }
}

// This code is contributed
// by  prerna saini.