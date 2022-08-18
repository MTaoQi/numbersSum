

/**
 * @Author: lazymxh
 * @ProjectName: Beiwork
 * @Package: IntelliJ IDEA
 * @Description:
 * @Since: 2022-08-18 15:46
 **/
public class test {

    /**
     * 分析
     *我们操作数组中的某一个元素 A[index] 的时候，数组 A 其他位置的元素都应保持不变。
     *如果 A[index] 是偶数，我们就从 S 中减去它，然后计算 A[index] + val 对 S 的影响（如果是偶数则在 S 中加上它）。
     */


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

    /**
     *   展现了我们的算法在每一次询问(如果是奇数跳过更新S操作)
     *     操作之后应该如何调整 S
     */


}
