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
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        

//         ListNode head = new ListNode(0);
//         ListNode interator = head;
//         boolean carry_forward = false;
        
//         int headVal = l1.val +l2.val;
//         if(headVal > 9){
//             headVal = headVal - 10;
//             carry_forward = true;
//         }
//         head.val = headVal;
//         l1 = l1.next;
//         l2 = l2.next;
        
//         //head.val = headVal;
        
//         while (l1 != null || l2 != null){
//             if (l1 != null && l2 != null){
//                 if (carry_forward){
//                     headVal = l1.val +l2.val +1;
//                     carry_forward = false;
//                 }else {
//                     headVal = l1.val +l2.val;
//                 }
                
//                 if(headVal > 9){
//                     headVal = headVal - 10;
//                     carry_forward = true;
//                 }
//                 ListNode temp = new ListNode(0);
//                 interator.next = temp;
//                 interator = interator.next;
//                 interator.val = headVal;
//                 l1 = l1.next;
//                 l2 = l2.next;
//             }
            
//             if (l1 != null && l2 == null){
//                 if (carry_forward){
//                     headVal = l1.val +1;
//                     carry_forward = false;
//                 }else {
//                     headVal = l1.val;
//                 }
                
//                 if(headVal > 9){
//                     headVal = headVal - 10;
//                     carry_forward = true;
//                 }
//                 ListNode temp = new ListNode(0);
//                 interator.next = temp;
//                 interator = interator.next;
//                 interator.val = headVal;
//                 l1 = l1.next;
//             }
            
//             if (l1 == null && l2 != null){
//                 if (carry_forward){
//                     headVal = l2.val +1;
//                     carry_forward = false;
//                 }else {
//                     headVal = l2.val;
//                 }
                
//                 if(headVal > 9){
//                     headVal = headVal - 10;
//                     carry_forward = true;
//                 }
//                 ListNode temp = new ListNode(0);
//                 interator.next = temp;
//                 interator = interator.next;
//                 interator.val = headVal;
//                 l2 = l2.next;
//             }
            
//         }
        
//         if (carry_forward){
//             ListNode temp = new ListNode(1);
//             interator.next = temp;
//         }
        
        
//         return head;
//     }
// }