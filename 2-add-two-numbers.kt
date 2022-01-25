/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var temp1 = l1
        var temp2 = l2
        var carry = 0
        var resListHead: ListNode? = null
        var resListItr: ListNode? = null
        while(temp1 != null || temp2 != null || carry != 0) {
            var num1:Int = 0
            var num2:Int = 0
            if(temp1 != null){
                num1 = temp1.`val`
            }
            if (temp2 != null) {
                num2 = temp2.`val`
            }
            var sum = num1+num2 + carry
            var sum_digit = sum%10 // keep the last digit here
            carry = sum/10

            if (resListHead == null) {
                resListHead = ListNode(sum_digit)
                resListItr = resListHead
            } else {
                var tempNode = ListNode(sum_digit)
                resListItr?.next = tempNode
                resListItr = tempNode
            }

            temp1 = temp1?.next
            temp2 = temp2?.next
        }
        return resListHead
    }
}