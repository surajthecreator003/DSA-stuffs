class A{
    public static void main(String args[]){
        int N=27;;int A=65;
        for(int i=1;i<=N;i++){
            for (int j=1;j<=N-i;j++){//1
                System.out.print(" ");
            }
            for (int j=i-1;j>=0;j--){//2

                System.out.print((char)(A+j));
            }
            for (int j=0;j<i;j++){//3
                if(j==0){
                    continue;
                }
                else{
                    System.out.print((char)(A+j));
                }

            }
            for (int j=1;j<=N-i;j++){//4
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}