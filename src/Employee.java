public class Employee {

    String fullName;
    int age;
    String role;

    public Employee(String fullName, int age, String role) {
        this.fullName = fullName;
        this.age = age;
        this.role = role;
    }

    public String promoteEmployee(String newRole) {
        this.role = newRole;
        return newRole;
    }
}
