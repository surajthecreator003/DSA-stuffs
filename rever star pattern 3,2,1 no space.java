// Java code for
// O(n) solution for finding
// maximum sum of a subarray
// of size k
class GFG {

    public static void main(String[] args)
    {
        int N=11;
        for (int i=1;i<=N;i++){
            
            for(int j=N;j>=i;j=j-1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
