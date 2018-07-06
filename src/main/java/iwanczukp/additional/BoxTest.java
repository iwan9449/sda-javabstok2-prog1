package iwanczukp.additional;

class BoxTest {

    public static void main(String[] args) {

        Box<Integer, String> box1 = new Box<>(23, "Test");
        Box<Double, Integer> box2 = new Box<>(23.0, 5);
        Box<Person, Person> box3 = new Box<>(new Person("Jan Kowalski", 39), new Person("Anna Kowalska", 37));

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

    }

}
