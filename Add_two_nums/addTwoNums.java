class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);

        System.out.print(l1);
        
        String l1_As_str= "";
        String l2_As_str= "";
        while (l1 != null){
            System.out.println(l1.getVal());
            System.out.println("value");
            String value_as_str = String.valueOf(l1.getVal()) ;
            //head.val = x;
            l1 = l1.next;
        }
        return head;
    }
    public static void main(String[] args){
        Solution k = new Solution();
        ListNode x = new ListNode(3);
        ListNode y = new ListNode(4);
        k.addTwoNumbers(x,y);
        System.out.println(k);
    }
}