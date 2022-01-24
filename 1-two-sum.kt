class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var res1:Int=-1; var res2:Int=-1
        val hashmap = hashMapOf<Int, Int>()
        nums.forEachIndexed{ index, el ->
            var complement = target - el
            if(hashmap.containsKey(complement)){
                res1 = hashmap[complement]!!
                res2 = index
            }
            hashmap[el] = index
        }
        return intArrayOf(res1, res2)
    }
}