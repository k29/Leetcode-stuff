class Solution {
    fun reverse(x: Int): Int {

        var inp = Math.abs(x)
        var res:Int = 0

        while(inp != 0) {
            if (Math.abs(res) > Int.MAX_VALUE/10) return 0
            res = res*10 + inp%10
            inp = inp/10
        }

        if(x<0) {
            return -res
        } else {
            return res
        }
    }
}
