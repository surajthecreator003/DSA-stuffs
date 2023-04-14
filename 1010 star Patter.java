class A{/////101010 program
    public static void main(String args[]){
        int N=5;
        for(int i=1;i<=N;i++){
            if(i%2!=0){
                for(int j=1;j<=i;j++){
                    if(j%2!=0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }

                }
                System.out.println();
            }
            else{
                    for(int j=1;j<=i;j++){
                        if(j%2==0){
                            System.out.print("1");
                        }
                        else{
                            System.out.print("0");
                        }

                    }
                System.out.println();
            }
        }
    }
}