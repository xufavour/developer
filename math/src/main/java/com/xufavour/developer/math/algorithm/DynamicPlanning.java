package com.xufavour.developer.math.algorithm;

/**
 * @Author: favour
 */
public class DynamicPlanning {

    /**
     * 0-1 背包问题有很多变体，我这里介绍一种比较基础的。
     * 我们有一个背包，背包总的承载重量是 Wkg。现在我们有 n 个物品，每个物品的重量不等，并且不可分割。
     * 我们现在期望选择几件物品，装载到背包中。在不超过背包所能装载重量的前提下，如何让背包中物品的总重量最大？
     */


    /**
     * weight: 物品重量，n: 物品个数，w: 背包可承载重量
     */
    public int knapsack(int[] weight, int n, int w) {
        boolean[][] states = new boolean[n][w + 1];
        return 0;
    }
}
