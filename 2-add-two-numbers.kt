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
        // iterators for l1 and l2
        var l1Itr = l1
        var l2Itr = l2

        // result list and its iterator
        var resListHead: ListNode? = null
        var resListItr: ListNode? = null

        // carry value
        var carry = 0

        // loop over till all are not null or carry is not 0
        while(l1Itr != null || l2Itr != null || carry != 0) {

            // extract values of each list item
            val num1:Int = l1Itr?.`val` ?: 0
            val num2:Int = l2Itr?.`val` ?: 0

            // sum = sum of digits plus carry
            val sum = num1+num2 + carry

            // extract ones place
            val sum_digit = sum%10

            // find out the carry
            carry = sum/10

            // if head is null, set it and set the iterator
            // else, create new node and add to the list.
            if (resListHead == null) {
                resListHead = ListNode(sum_digit)
                resListItr = resListHead
            } else {
                val tempNode = ListNode(sum_digit)
                resListItr?.next = tempNode
                resListItr = tempNode
            }

            // Iterate
            l1Itr = l1Itr?.next
            l2Itr = l2Itr?.next
        }

        // return head
        return resListHead
    }
}