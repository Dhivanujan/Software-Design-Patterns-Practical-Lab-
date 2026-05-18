package Exercises.Exercise1;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class DigitalNoticeBoard implements NoticeBoardSubject {

    private List<StudentObserver> students = new ArrayList<>();
    private String latestNotice;

    @Override
    public void subscribe(StudentObserver student) {
        students.add(student);
    }

    @Override
    public void unsubscribe(StudentObserver student) {
        students.remove(student);
    }

    @Override
    public void notifyStudents() {
        for (StudentObserver student : students) {
            student.update(latestNotice);
        }
    }

    public void postNotice(String notice) {
        this.latestNotice = notice;

        System.out.println("\nNew Notice Posted: " + notice);

        notifyStudents();
    }
}
