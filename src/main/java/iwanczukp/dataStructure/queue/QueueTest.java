package iwanczukp.dataStructure.queue;

import java.util.Comparator;

class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueueV2<>((a, b) -> b - a);
        System.out.println(queue.isEmpty());
        queue.push(10);
        queue.push(17);
        queue.push(19);
        queue.push(1);
        queue.push(8);
        queue.push(6);
        System.out.println(queue);
//        System.out.println("Zdejmuje: " + queue.pop());
//        System.out.println(queue);
//        System.out.println("Zdejmuje: " + queue.pop());
//        System.out.println(queue);

        Queue<Person> people = new PriorityQueueV2<>(Comparator.comparingInt(Person::getAge));
        System.out.println(queue.isEmpty());
        people.push(new Person("Ola", 20));
        people.push(new Person("Michał", 35));
        people.push(new Person("Magda", 19));
        people.push(new Person("Tomek", 29));
        people.push(new Person("Kasia", 27));
        people.push(new Person("Andrzej", 35));
        System.out.println(people);
//        System.out.println("Zdejmuje: " + people.pop());
//        System.out.println(people);
//        System.out.println("Zdejmuje: " + people.pop());
//        System.out.println(people);


        PriorityQueue<Integer> priorityQueue = new PriorityQueueV1<>();
        System.out.println(priorityQueue.isEmpty());
        priorityQueue.push(1, 10);
        priorityQueue.push(2, 30);
        priorityQueue.push(3, 3);
        priorityQueue.push(4, 1);
        priorityQueue.push(5, 23);
        priorityQueue.push(6, 2);
        System.out.println(priorityQueue);
    }

}
