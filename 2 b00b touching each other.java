
class A {
    public static void main(String args[]) {
        int N = 2;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {//1
                System.out.print("*");
            }
            for (int j = N - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = N - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {//4
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= N; i++) {


                for (int j = N-1; j >i-1 ; j--) {//1
                    System.out.print("*");
                }
                for (int j = 1; j < i+1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i+1; j++) {
                    System.out.print(" ");
                }
                for (int j = N-1; j >i-1 ; j--) {//4
                    System.out.print("*");
                }
                System.out.println();

        }
    }
}