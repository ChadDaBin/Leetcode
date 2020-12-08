package com.chad.leetcode.medium;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 *
 *  
 *
 * 示例：
 *
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class MinimumSizeSubArraySum {

    /**
     * 思路：滑动窗口双指针
     */
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0,r = 0,len = nums.length,sum = 0,res = Integer.MAX_VALUE;
        while(r<len){
            sum += nums[r++];
            while(sum>=s){
                res = Math.min(res,r-l);
                sum -= nums[l++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}