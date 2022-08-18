

/**
 * @Author: lazymxh
 * @ProjectName: Beiwork
 * @Package: IntelliJ IDEA
 * @Description:
 * 用你熟悉的语言实现下面这个算法 （JAVA）
 * 给出一个整数数组 A 和一个查询数组 queries。
 * 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。 （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。） 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 * 示例： 输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]] 输出：[8,6,2,4] 解释： 开始时，数组为 [1,2,3,4]。 将 1 加到 A[0] 上之后，数组为 [2,2,3,4]，偶数值之和为 2 + 2 + 4 = 8。 将 -3 加到 A[1] 上之后，数组为 [2,-1,3,4]，偶数值之和为 2 + 4 = 6。 将 -4 加到 A[0] 上之后，数组为 [-2,-1,3,4]，偶数值之和为 -2 + 4 = 2。 将 2 加到 A[3] 上之后，数组为 [-2,-1,3,6]，偶数值之和为 -2 + 6 = 4。
 *
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
