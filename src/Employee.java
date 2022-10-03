public class Employee extends Person{
    private String code;
    private String function;

        public Employee(String name, String id, int age, String code, String function) {
        super(name, id, age);
        this.code = code;
        this.function = function;
    }
}
