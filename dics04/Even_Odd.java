public class Even_Odd {
    public static void evenOdd(IntList lst) {
        if (lst == null || lst.rest == null) {
            return;
        }
        IntList oddList = lst.rest;
        // 记录奇数下标的开始位置
        IntList second = lst.rest;
        // 两个节点跳跃着（每次跳跃一个节点）连接节点
        while (lst.rest != null && oddList.rest != null) {
            // 将下一个节点跳过，连接0 2 4 ...
            lst.rest = lst.rest.rest;
            // 将下一个节点跳过，连接1 3 5 ...
            oddList.rest = oddList.rest.rest;

            // 跳到下一个节点
            lst = lst.rest;
            oddList = oddList.rest;
        }
        lst.rest = second;
    }
}
