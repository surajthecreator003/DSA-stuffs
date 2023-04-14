class A{
    public static void main(String args[]){
        int N=9;int z=0;
        for (int i=1;i<=N;i++){

            for(int j=1;j<=i;j++){
                z=z+1;
                System.out.print(z);
                System.out.print("   ");

            }
            System.out.println();
        }
    }
}