class A{
    public static void main(String args[]){
        int N=55;int Z=N/2+1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i==1){
                    if(j==1 || j==N){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("@");
                    }
                }
                else if(i==Z){
                    System.out.print("@");
                }
                else{
                    if(j==N || j==1){
                        System.out.print("@");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}