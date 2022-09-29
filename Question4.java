package exercise3;



import java.util.Objects;
public class Question4
{
    String name;
    int age;
    String designation;

    public Question4(String name, int age, String designation)
    {
        this.name= name;
        this.age= age;
        this.designation= designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question4 employee = (Question4) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
}