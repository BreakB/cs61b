package deque;

public class ArrayDeque<T> {
    private T[] items;
    private int size;
    private int nextFirst, nextLast;

    public ArrayDeque() {
        items = (T[]) new Object[8];
        size = 0;
        nextFirst = 4;
        nextLast = 5;
    }

    private int arrayInd(int ind) {
        if (nextFirst + 1 + ind >= items.length) {
            return nextFirst + 1 + ind - items.length;
        } else {
            return nextFirst + 1 + ind;
        }
    }

    private void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        int ind;
        for (int i = 0;i < size; i++) {
            ind = arrayInd(i);
            a[capacity / 4 + i] = items[ind];
        }
        items = a;
        nextFirst = capacity / 4 - 1;
        nextLast = nextFirst + size + 1;
    }

    public void addFirst(T item) {
        if (size == items.length) {
            resize((int) (items.length * 2));
        }

        items[nextFirst] = item;
        if(nextFirst == 0) {
            nextFirst = items.length - 1;
        } else {
            nextFirst -= 1;
        }
        size += 1;
    }

    public void addLast(T item) {
        if (size == items.length) {
            resize((int) (items.length * 2));
        }

        items[nextLast] = item;
        if (nextLast == items.length - 1) {
            nextLast = 0;
        } else {
            nextLast += 1;
        }
        size = size + 1;
    }

    public T getFirst() {
        int ind = arrayInd(0);
        return items[ind];
    }

    private T getLast() {
        int ind = arrayInd(size - 1);
        return items[ind];
    }

    public T get(int i) {
        int ind =  arrayInd(i);
        return items[ind];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        if ((size < items.length / 4) && (size > 8)) {
            resize(items.length / 2);
        }
        T data = getFirst();
        int ind = arrayInd(0);
        items[ind] = null;
        nextFirst = ind;
        size = size - 1;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        if ((size < items.length / 4) && (size > 8)) {
            resize(items.length / 2);
        }
        T data = getLast();
        int ind = arrayInd(size - 1);
        items[ind] = null;
        nextLast = ind;
        size = size - 1;
        return data;
    }

    public void printDeque() {
        for (T j : items) {
            System.out.print(j + " ");
        }
    }
}
