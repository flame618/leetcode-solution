/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return head;
        RandomListNode chead = head, head1 = new RandomListNode(-1), chead1 = head1;
        Map map = new HashMap();
        while(head != null)
        {
            head1.next = new RandomListNode(head.label);
            map.put(head, head1.next);
            head = head.next;
            head1 = head1.next;
        }
        head = chead;
        head1 = chead1;
        while(head != null)
        {
            RandomListNode key = head.random;
            head1.next.random = (RandomListNode)map.get(key);
            head = head.next;
            head1 = head1.next;
        } 
        return chead1.next;
    }
}
