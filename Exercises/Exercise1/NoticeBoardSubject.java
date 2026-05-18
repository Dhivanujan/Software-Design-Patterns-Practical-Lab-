package Exercises.Exercise1;

// Subject Interface
public interface NoticeBoardSubject {

    void subscribe(StudentObserver student);

    void unsubscribe(StudentObserver student);

    void notifyStudents();
}