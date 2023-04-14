class A{
    public static void main(String args[]){
        int N=11;
        for (int i=0;i<N;i++){
            for (int j=N-i;j>0;j=j-1){
                System.out.print("");
            }
            for (int j=1;j<=2*i+1;j=j+1){
                System.out.print("*");
            }
            for (int j=N-i;j>0;j=j-1){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}