

/**
 * @Author: lazymxh
 * @ProjectName: Beiwork
 * @Package: IntelliJ IDEA
 * @Description:
 * @Since: 2022-08-18 15:46
 **/
public class test {

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int S = 0;
        for (int x: A)
            if (x % 2 == 0)
                S += x;

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            int val = queries[i][0], index = queries[i][1];
            if (A[index] % 2 == 0) S -= A[index];
            A[index] += val;
            if (A[index] % 2 == 0) S += A[index];
            ans[i] = S;
        }

//
           return ans;
    }
    public static void main(String[] args){
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};

        for (int a:  sumEvenAfterQueries(A,queries)) {
            System.out.print(a);
        }

    }

}
