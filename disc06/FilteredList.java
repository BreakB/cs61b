import java.util.*;
import java.util.function.Predicate;

public class FilteredList<T> implements Iterable<T> {
    List<T> list;
    Predicate<T> pred;
    public FilteredList (List<T> L, Predicate<T> filter) {
        this.list = L;
        this.pred = filter;
    }
    @Override
    public Iterator<T> iterator() {
        return new FilteredListIterator();
    }
    private class FilteredListIterator<T> implements Iterator<T> {
        int index;
        public FilteredListIterator() {
            index = 0;
            Find_valid_index();
        }
        @Override
        public boolean hasNext() {
            return this.index < list.size();
        }
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T res = (T) list.get(index);
            index += 1;
            Find_valid_index();
            return res;
        }
        private void Find_valid_index() {
            while (hasNext() && !pred.test(list.get(index))) {
                index += 1;
            }
        }
    }

}
