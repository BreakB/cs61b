public class DrawingATriangle {
    public static void drawTriangle(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int max(int[] m) {
        int answer = 0;
        for (int j : m) {
            if (j >= answer) {
                answer = j;
            }
        }
        return answer;
    }
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0;i < a.length;i++) {
            int sum = 0, j = i;
            while (j < a.length & j <= i + n) {
                sum += a[j];
                j ++ ;
            }
            if (a[i] > 0) {
                a[i] = sum;
            }
        }
    }
    public static void main(String[] args) {
        int cnt = 10;
        drawTriangle(cnt);

        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));

        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
