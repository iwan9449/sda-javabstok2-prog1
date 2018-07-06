package iwanczukp.dataStructure.stack;

import iwanczukp.dataStructure.stack.LinkedStack;

import iwanczukp.dataStructure.stack.Stack;

class StackTest {

    public static void main(String[] args) {
        Stack<String> linkedStack = new LinkedStack<>();
        Stack<String> arrayStack = new ArrayStack<>(10);

//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.push("Ala ma kota");
//        linkedStack.push("Jakiś inny tekst");
//        linkedStack.push("Java jest super!");
//        linkedStack.push("Coś tam");
//        linkedStack.push("Ostatni tekst");
//
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.push("Ala ma kota");
//        linkedStack.push("Jakiś inny tekst");
//        linkedStack.push("Java jest super!");
//        linkedStack.push("Coś tam");
//        linkedStack.push("Ostatni tekst");
//
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();
//
//        linkedStack.pop();
//        System.out.println(linkedStack);
//        System.out.println("Is empty: " + linkedStack.isEmpty());
//        System.out.println("Size: " + linkedStack.getSize());
//        System.out.println();

        System.out.println(arrayStack);
        System.out.println("Is empty: " + arrayStack.isEmpty());
        System.out.println("Size: " + arrayStack.getSize());
        System.out.println();

        arrayStack.push("Ala ma kota");
        arrayStack.push("Jakiś inny tekst");
        arrayStack.push("Java jest super!");
        arrayStack.push("Coś tam");
        arrayStack.push("Ostatni tekst");

        System.out.println(arrayStack);
        System.out.println("Is empty: " + arrayStack.isEmpty());
        System.out.println("Size: " + arrayStack.getSize());
        System.out.println();

        arrayStack.pop();
        System.out.println(arrayStack);
        System.out.println("Is empty: " + arrayStack.isEmpty());
        System.out.println("Size: " + arrayStack.getSize());
        System.out.println();

        arrayStack.pop();
        System.out.println(arrayStack);
        System.out.println("Is empty: " + arrayStack.isEmpty());
        System.out.println("Size: " + arrayStack.getSize());
        System.out.println();

        arrayStack.pop();
        System.out.println(arrayStack);
        System.out.println("Is empty: " + arrayStack.isEmpty());
        System.out.println("Size: " + arrayStack.getSize());
        System.out.println();

        arrayStack.pop();
        System.out.println(arrayStack);
        System.out.println("Is empty: " + arrayStack.isEmpty());
        System.out.println("Size: " + arrayStack.getSize());
        System.out.println();

        arrayStack.pop();
        System.out.println(arrayStack);
        System.out.println("Is empty: " + arrayStack.isEmpty());
        System.out.println("Size: " + arrayStack.getSize());
        System.out.println();

    }

}
