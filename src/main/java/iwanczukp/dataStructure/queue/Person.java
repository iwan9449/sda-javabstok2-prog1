package iwanczukp.dataStructure.queue;

class Person {
    private String name;
    private Integer age;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " lat";
    }

    Integer getAge() {
        return age;
    }
}
