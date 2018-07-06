package iwanczukp.dataStructure.list;

class ListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(6);
        list.add(222);
        list.add(43);
        list.add(66);
        System.out.println(list.getSize());

        System.out.println(list.remove(4));
        System.out.println(list.getSize());

        System.out.println();

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));



    }
}
