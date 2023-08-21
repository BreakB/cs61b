public class SLList {
    private class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x,first);
    }

    /** 1.1 */
    public void insert(int item, int position) {
        int cnt = 0;
        IntNode p = first;
        if (position == 0) {
            p = new IntNode(item,p);
            return;
        }
        while (p.next != null) {
            if (cnt == position - 1) {
                p.next = new IntNode(item, p.next);
                return;
            }
            p = p.next;
        }
        p.next = new IntNode(item,null);
    }

//    /** 1.2 Use iteration */
//    public void reverse() {
//        IntNode anslist = null;
//        IntNode currNode = first;
//        IntNode nextNode = null;
//        while (currNode != null) {
//            // Record the rest list
//            nextNode = currNode.next;
//            // Add node to the anslist
//            currNode.next = anslist;
//            anslist = currNode;
//            // Process the rest list
//            currNode = nextNode;
//        }
//        first = anslist;
//    }

    /** 1.3 Use recursion */
    public void reverse() {
        first = reverse(first);
    }

    private IntNode reverse(IntNode list) {
        if (list == null || list.next == null) {
            return list;
        }
        IntNode rev = reverse(list.next);
        IntNode next_node = list.next;
        // Move the next node to the top
        next_node.next = list;
        list.next = null;
        return rev;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addFirst(2);
        L.addFirst(6);
        L.addFirst(5);
        L.insert(10,1);
        L.reverse();
    }
}
