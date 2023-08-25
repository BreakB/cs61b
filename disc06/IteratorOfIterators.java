import java.util.*;
public class IteratorOfIterators implements Iterator<Integer> {
    List<Iterator<Integer>> iterator_list;
    public IteratorOfIterators(List<Iterator<Integer>> a) {
        iterator_list = new LinkedList<>();
        for (Iterator<Integer> b : a) {
            if (b.hasNext()) {
                iterator_list.add(b);
            }
        }
    }
    @Override
    public boolean hasNext() {
        return !iterator_list.isEmpty();
    }
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator<Integer> itor = iterator_list.removeFirst();
        int ans = itor.next();
        if (itor.hasNext()) {
            iterator_list.addLast(itor);
        }
        return ans;
    }
}
