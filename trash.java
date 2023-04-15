class A {
    public static void main(String args[]) {
        int N = 5;
        for (int i = N; i >=1 ; i--) {
            for (int j = 1; j < i; j++) {//1
                System.out.print("l");
            }
            for (int j = i; j <=N; j++) {//1
                System.out.print(j);
            }


            System.out.println();
        }
    }
}