package deque;

public class LinkedListDeque<T> {

    private class IntNode {
        public T item;
        public IntNode next;
        public IntNode prev;

        public IntNode(T i, IntNode p, IntNode n) {
            prev = p;
            item = i;
            next = n;
        }
    }
    private IntNode sentinel;
    private int size;

    public LinkedListDeque() {
        sentinel = new IntNode(null,null,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public void addFirst(T item) {
        IntNode node = new IntNode(item,null,null);
        node.prev = sentinel;
        node.next = sentinel.next;
        sentinel.next.prev = node;
        sentinel.next = node;
        size += 1;
    }

    public void addLast(T item) {
        IntNode node = new IntNode(item,null,null);
        node.prev = sentinel.prev;
        node.next = sentinel;
        sentinel.prev.next = node;
        sentinel.prev = node;
        size += 1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        IntNode p = sentinel.next;
        while (p.item != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

    public T removeFirst() {
        if (sentinel.next.item == null) {
            return null;
        }
        T data = sentinel.next.item;
        sentinel.next.next.prev = sentinel;
        sentinel.next = sentinel.next.next;
        size -= 1;
        return data;
    }

    public T removeLast() {
        if (sentinel.next.item == null) {
            return null;
        }
        T data = sentinel.prev.item;
        sentinel.prev.prev.next = sentinel;
        sentinel.prev = sentinel.prev.prev;
        size -= 1;
        return data;
    }

    public T get(int index) {
        int cnt = 0;
        if (sentinel.next.item == null) {
            return null;
        }
        IntNode p = sentinel.next;
        while (p.item != null) {
            if (cnt == index) {
                return p.item;
            }
            p = p.next;
            cnt ++ ;
        }
        return null;
    }

    public T getRecursive(int index) {
        return getRecursive(sentinel.next, 0, index);
    }

    private T getRecursive(IntNode list, int index, int tar) {
        if (list.item == null){
            return null;
        }
        if (index == tar) {
            return list.item;
        }
        return getRecursive(list.next,index + 1,tar);
    }
}
