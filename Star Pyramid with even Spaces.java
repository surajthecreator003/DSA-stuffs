class A{
    public static void main(String args[]){
        int N=5;
        for (int i=1;i<=N;i++){
            for (int j=N-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){

                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            for (int j=N-1;j>=i;j--){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}