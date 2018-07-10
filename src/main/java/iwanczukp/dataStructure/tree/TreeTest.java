package iwanczukp.dataStructure.tree;

class TreeTest {

    public static void main(String[] args) {
        Node a = new Node("A", null, null);
        Node c = new Node("C", null, null);
        Node e = new Node("E", null, null);
        Node h = new Node("H", null, null);
        Node d = new Node("D", c, e);
        Node b = new Node("B", a, d);
        Node i = new Node("I", h, null);
        Node g = new Node("G", null, i);
        Node root = new Node("F", b, g);

        BinaryTree tree = new BinaryTree(root);

        tree.showTree(DfsType.PRE_ORDER);
        tree.showTree(DfsType.IN_ORDER);
        tree.showTree(DfsType.POST_ORDER);

        System.out.println();
        System.out.println();

        CompleteBinaryTree<Integer> completeBinaryTree = new CompleteBinaryTree<>(10);

        completeBinaryTree.add(9);
        completeBinaryTree.add(53);
        completeBinaryTree.add(23);
        completeBinaryTree.add(66);
        completeBinaryTree.add(3);
        completeBinaryTree.add(87);
        completeBinaryTree.add(24);

        System.out.println(completeBinaryTree);

        System.out.println(completeBinaryTree.getLeftChild(2));
        System.out.println(completeBinaryTree.getRightChild(2));

        System.out.println();
        System.out.println();

        Heap heap = new Heap(20);

        heap.add(1);
        heap.add(60);
        heap.add(15);
        heap.add(40);
        heap.add(20);
        heap.add(50);

        System.out.println(heap);

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());

        System.out.println(heap);

    }

}
