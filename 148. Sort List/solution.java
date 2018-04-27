/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
     public ListNode sortList(ListNode head) {
         if(head == null || head.next == null) return head;
         ListNode slow = head, fast = head, pre = head;
         while(fast != null && fast.next != null)
         {
             pre = slow;
             slow = slow.next;
             fast = fast.next.next;
         }
         pre.next = null;
         ListNode left = sortList(head);
         ListNode right = sortList(slow);
         return mergeList(left, right);  
    }
    private ListNode mergeList(ListNode head1, ListNode head2)
    {
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        if(head1.val <= head2.val)
        {
            head1.next = mergeList(head1.next, head2);
            return head1;
        }
        else
        {
            head2.next = mergeList(head1, head2.next);
            return head2;
        }
    }
    
    /* 冒泡排序法
    public ListNode sortList(ListNode head) {
        int times = 0;
        ListNode re = new ListNode(-1);
        re.next = head;
        ListNode re1 = re;
        while(head != null && head.next != null)
        {
            if(head.val > head.next.val)
            {
                ListNode headNext = head.next;
                re.next = headNext;
                ListNode headnn = headNext.next;
                headNext.next = head;
                head.next = headnn;
                head = headNext;
            }
            re = head;
            head = head.next;
            times++;
        }
        
        for(int i = 0; i < times; i++)
        {
            head = re1.next;
            re = re1;
            int j = 0;
            while((head != null && head.next != null) && j < times)
            {
                if(head.val > head.next.val)
                {
                    ListNode headNext = head.next;
                    re.next = headNext;
                    ListNode headnn = headNext.next;
                    headNext.next = head;
                    head.next = headnn;
                    head = headNext;
                }
                re = head;
                head = head.next;
                j++;
            }
        }
        return re1.next;
    }
    */
}
