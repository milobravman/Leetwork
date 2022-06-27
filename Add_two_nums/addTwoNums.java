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
        
//         String l1_As_str= "";
//         String l2_As_str= "";
//         while (l1 != null){
//             String value_as_str = String.valueOf(l1.val) ;
//             l1_As_str = l1_As_str + value_as_str;
//             l1 = l1.next;
//         }
        
//         while (l2 != null){
//             String value_as_str = String.valueOf(l2.val) ;
//             l2_As_str = l2_As_str + value_as_str;
//             l2 = l2.next;
//         }
        
//         String l1_As_str_r = "";
//         String l2_As_str_r = "";
        
//         for (int i=0; i<l1_As_str.length(); i++)
//         {
//              char ch= l1_As_str.charAt(i); //extracts each character
//              l1_As_str_r= ch+l1_As_str_r; //adds each character in front of the existing string
//         }
        
//         for (int i=0; i<l2_As_str.length(); i++)
//         {
//              char ch= l2_As_str.charAt(i); //extracts each character
//              l2_As_str_r= ch+l2_As_str_r; //adds each character in front of the existing string
//         }
        
//         long l1_As_int = Long.parseLong(l1_As_str_r);
//         long l2_As_int = Long.parseLong(l2_As_str_r);
        
//         long Final =  l1_As_int + l2_As_int;
        
//         String Final_s_pre_r = String.valueOf(Final);
            
//         String Final_r = "";
        
//         for (int i=0; i<Final_s_pre_r.length(); i++)
//         {
//              char ch= Final_s_pre_r.charAt(i); //extracts each character
//              Final_r= ch+Final_r; //adds each character in front of the existing string
//         }
        
//         // String test = "";
//         // test = ""+ Final_r.charAt(0);
        
//         int temp = Character.getNumericValue(Final_r.charAt(0));
//         head.val = temp;
//         ListNode pointer = new ListNode();
//         pointer = head;
//         for (int i=1; i<Final_r.length(); i++)
//         {
//             int temp2 = Character.getNumericValue(Final_r.charAt(i));
//             ListNode tempNode = new ListNode(temp2);
//             pointer.next = tempNode;
//             pointer = pointer.next;
            
//         }
        
//         //head.val = Integer.parseInt(Final_r);
        
//         return head;
//     }
// }