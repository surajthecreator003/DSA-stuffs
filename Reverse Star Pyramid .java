class A{
    public static void main(String args[]){
        int N=2;
        for (int i=N;i>0;i--){
            for (int j=N-1;j>=i;j=j-1){
                System.out.print(" ");
            }
            for (int j=1;j<=i*2-1;j=j+1){
                System.out.print("*");
            }
            for (int j=N-1;j>=i;j=j-1){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}