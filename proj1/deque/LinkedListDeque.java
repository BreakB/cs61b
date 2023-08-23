package deque;

import java.util.Iterator;

public class LinkedListDeque<T> implements Deque<T>, Iterable<T> {

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

    @Override
    public void addFirst(T item) {
        IntNode node = new IntNode(item,null,null);
        node.prev = sentinel;
        node.next = sentinel.next;
        sentinel.next.prev = node;
        sentinel.next = node;
        size += 1;
    }

    @Override
    public void addLast(T item) {
        IntNode node = new IntNode(item,null,null);
        node.prev = sentinel.prev;
        node.next = sentinel;
        sentinel.prev.next = node;
        sentinel.prev = node;
        size += 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {
        IntNode p = sentinel.next;
        while (p.item != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

    @Override
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

    @Override
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

    @Override
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if(!(o instanceof Deque)) {
            return false;
        }
        if (((Deque<T>) o).size() != this.size()) {
            return false;
        }
        for (int i = 0; i < size; i ++) {
            if (!((Deque<T>) o).get(i).equals(this.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    public class LinkedListIterator implements Iterator<T> {
        private int pos;
        private LinkedListIterator() {
            pos = 0;
        }
        public boolean hasNext() {
            return pos < size;
        }
        public T next() {
            T item = get(pos);
            pos ++;
            return item;
        }
    }
}
