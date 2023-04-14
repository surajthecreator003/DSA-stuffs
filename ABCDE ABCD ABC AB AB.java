class A{
    public static void main(String args[]){
        int N=5;int A=65;int sum=0;
        for (int i=N;i>0;i--){
            sum=A;
            for(int j=0;j<i;j++){
                sum=A+j;
                System.out.print((char)sum);

            }
            System.out.println();
        }
    }
}