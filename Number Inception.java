class A{
    public static void main (String args[]){
        int N=9;
        for(int i=N;i>0;i--){
            for(int j=N;j>=i;j--){
                System.out.print(j);
                System.out.print(" ");

            }
            for(int j=i-1;j>=1;j--){
                System.out.print(i);
                System.out.print(" ");

            }
            for(int j=i-1;j>=1;j--){
                System.out.print(i);
                System.out.print(" ");

            }
            for(int j = i+1; j<=N; j++){
                if(j==1){
                    continue;
                }
                else{
                    System.out.print(j);
                    System.out.print(" ");

                }

            }


            System.out.println();
        }

        for(int i=1;i<N;i++){
            for(int j=N;j>i;j--){
                System.out.print(j);
                System.out.print(" ");

            }
//            /
            for(int j=1;j<i+1;j++){
                System.out.print(i+1);
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(i+1);
                System.out.print(" ");

            }
            for(int j=i+2;j<=N;j++){
                System.out.print(j);
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}