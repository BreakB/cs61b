public class Partition {
    public static IntList[] partition(IntList lst, int k) {
        IntList[] array = new IntList[k];
        int index = 0;
        IntList L = reverse(lst);
        while (L != null) {
            // 取出L中的一个元素，放到array[index]中
                // 记得保留被取前的内容
            IntList prevAtIndex = array[index];
            IntList next = L.rest;
            array[index] = L;
            array[index].rest = prevAtIndex;
            L = next;
            index = (index + 1) % array.length;
        }
        return array;
    }
}
