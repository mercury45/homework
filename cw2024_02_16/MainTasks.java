public class MainTasks {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(2506);
        list.add(6);
        list.add(100);
        list.add(-66);
        list.add(666);
        list.printList();
        list.deleteTwoFirst();
        list.printList();
        System.out.println("list.max() = " + list.max());
        list.add(2506);

        list.printList();
        list.sort();
        list.printList();
        list.addSort(10);
        list.printList();

    }
}
