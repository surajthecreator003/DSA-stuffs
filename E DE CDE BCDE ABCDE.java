class A {
    public static void main(String args[]) {
        int N = 9;
        int L = 65 + N - 1;int Z;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print((char)(L - j));
            }
            System.out.println();
        }
    }
}