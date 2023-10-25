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
    /* 初始化链表 1 -> 3 -> 2 -> 5 -> 4 */
    // 初始化各个节点
    n0 = new ListNode(1);
    n1 = new ListNode(3);
    n2 = new ListNode(2);
    n3 = new ListNode(5);
    n4 = new ListNode(4);
    // 构建引用指向
    n0.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
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
