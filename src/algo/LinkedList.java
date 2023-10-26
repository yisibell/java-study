package algo;

/** 节点 */
class ListNode {
  int val;
  ListNode next;

  public ListNode(int val) {
    this.val = val;
  }
}

// 链表
public class LinkedList {

  public ListNode n0;
  public ListNode n1;
  public ListNode n2;
  public ListNode n3;
  public ListNode n4;

  public LinkedList() {

    this.n0 = new ListNode(1);
    this.n1 = new ListNode(3);
    this.n2 = new ListNode(2);
    this.n3 = new ListNode(5);
    this.n4 = new ListNode(4);
    
    this.n0.next = this.n1;
    this.n1.next = this.n2;
    this.n2.next = this.n3;
    this.n3.next = this.n4;
  }

  public void insert(ListNode n0, ListNode P) {
    ListNode n1 = n0.next;
    P.next = n1;
    n0.next = P;
  }

  public void remove(ListNode n0) {
    if (n0.next == null)
      return;
    // n0 -> P -> n1
    ListNode P = n0.next;
    ListNode n1 = P.next;
    n0.next = n1;
  }

  public ListNode access(ListNode head, int index) {
    for (int i = 0; i < index; i++) {
      if (head == null)
        return null;
      head = head.next;
    }
    return head;
  }

  public int find(ListNode head, int target) {
    int index = 0;
    while (head != null) {
      if (head.val == target)
        return index;
      head = head.next;
      index++;
    }
    return -1;
  }

}
