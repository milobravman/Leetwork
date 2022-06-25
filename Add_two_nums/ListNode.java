//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val; 
        }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next; 
        }
    public int getVal(){
        return val;
    }
    public static void main(String[] args){

        ListNode k = new ListNode(5);
        System.out.print(k.getVal());
        System.out.println("k.getVal()");

    }
}
