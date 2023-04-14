class A{
    public static void main(String args[]){
        int N=5;
        for(int i=1;i<=N;i=i+1){
            if (i <= N) {
                for(int j=N-1;j>=i;j--){
                    System.out.print(" ");

                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                for(int j=N-1;j>=i;j--){
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for(int i=N;i>0;i--){
            if(i!=N){
                for(int j=N-1;j>=i;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++){
                    System.out.print("*");
                }
                for(int j=N-1;j>=i;j--){
                    System.out.print(" ");
                }
            }
            else{
                continue;
            }

            System.out.println();
        }
    }
}