Node Reverse(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    Node newHead = Reverse(head.next); // reverse all but first
    head.next.next = head; // make original second point at first
    head.next = null; // make original first point at nothing

    return newHead;
}
