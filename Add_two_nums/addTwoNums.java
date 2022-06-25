class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);

        System.out.print(l1);
        
        String l1_As_str= "";
        String l2_As_str= "";
        while (l1 != null){
            int value = l1.val;
            System.out.println(value);
            System.out.println("value");
            String value_as_str = String.valueOf(value) ;
            //head.val = x;
            l1 = l1.next;
        }
        return head;
    }
    public static void main(String[] args){
        Solution k = new Solution();
        ListNode x = new ListNode();
        ListNode y = new ListNode();
        k.addTwoNumbers()
        System.out.println(k);
    }
}