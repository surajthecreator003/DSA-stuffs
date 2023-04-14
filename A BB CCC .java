class A{
    public static void main(String args[]){
        int A=65;int N=5;int sum=0;
        for (int i=0;i<N;i++){

            for(int j=0;j<=i;j++){
                sum=A+i;
                char A1=(char)sum;
                System.out.print(A1);
            }

            System.out.println();
        }
    }
}