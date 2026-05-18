package Exercises.Exercise1;

// Concrete Observer
public class Student implements StudentObserver {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String notice) {
        System.out.println(name + " received notice: " + notice);
    }
}
