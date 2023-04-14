class A{
    public static void main(String args[]){
        int N=5;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }

            System.out.println();
        }

    }
}