/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        while(l1 != null || l2 != null)
        {
            if(l1 != null)
            {
                arr1.add(l1.val);
                l1 = l1.next;
            }
            if(l2 != null)
            {
                arr2.add(l2.val);
                l2 = l2.next;
            }
        }
        int i1 = arr1.size() - 1, i2 = arr2.size() - 1;
        int carry = 0;
        ListNode next = null, re = new ListNode(1);
        while(i1 >= 0 || i2 >= 0)
        {
            int num1 = 0, num2 = 0;
            if(i1 >= 0) {num1 = arr1.get(i1);i1--;}
            if(i2 >= 0) {num2 = arr2.get(i2);i2--;}
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            re.next = new ListNode(sum % 10);
            re.next.next = next;
            next = re.next;
        }
        return carry == 1 ? re : re.next;
    }
}
