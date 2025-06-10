package demo18;

public class Student {
    int id;
    String name;
    int age;
    String telephone;

    public Student(int id, String name, int age, String telephone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", telephone=" + telephone + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
