/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        ListNode cur = root;
        int length = 0;
        while(cur != null)
        {
            length++;
            cur = cur.next;
        }
        int width = length / k, rest = length % k;
        cur = root;
        for(int i = 0; i < k; i++)
        {
            ListNode tempHead = new ListNode(-1), temp = tempHead;
            int w = width;
            if(i < rest) w++;
            for(int j = 0; j < w; j++)
            {
                temp = temp.next = new ListNode(cur.val);
                if(cur != null) cur = cur.next;
            }
            res[i] = tempHead.next;
        }
        return res;
    }
}
