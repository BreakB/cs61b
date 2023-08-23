package deque;
import java.util.Comparator;

public class MaxArrayDeque<T> extends ArrayDeque<T> {
    private Comparator<T> cmp;

    public MaxArrayDeque(Comparator<T> c) {
        super();
        cmp = c;
    }

    public T max() {
        if (isEmpty()) {
            return null;
        }
        T maxitem = this.get(0);
        for (int i = 0; i < size(); i++) {
            T value = this.get(i);
            if (cmp.compare(value, maxitem) > 0) {
                maxitem = value;
            }
        }
        return maxitem;
    }

    public T max(Comparator<T> c) {
        if (isEmpty()) {
            return null;
        }
        T maxitem = this.get(0);
        for (int i = 0; i < size(); i++) {
            T value = this.get(i);
            if (c.compare(value, maxitem) > 0) {
                maxitem = value;
            }
        }
        return maxitem;
    }
}
