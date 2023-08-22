public class Fill_Grid {
    public static void fillGrid(int[] LL, int[] UR, int[][] S) {
        int N = S.length;
        int KL,KR;
        KL = KR = 0;
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < S[i].length; j++) {
                if(i > j) {
                    S[i][j] = LL[KL];
                    KL ++;
                }
                if(i < j) {
                    S[i][j] = UR[KR];
                    KR ++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] LL = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0 };
        int[] UR = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[][] S = {
                { 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0}
        };
        fillGrid(LL,UR,S);
    }
}
