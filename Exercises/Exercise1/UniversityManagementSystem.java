package Exercises.Exercise1;

// Main Class
public class UniversityManagementSystem {

    public static void main(String[] args) {

        DigitalNoticeBoard noticeBoard = new DigitalNoticeBoard();

        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // Subscribe students
        noticeBoard.subscribe(s1);
        noticeBoard.subscribe(s2);
        noticeBoard.subscribe(s3);

        // Post notices
        noticeBoard.postNotice("Exam schedule released!");
        noticeBoard.postNotice("Workshop on AI this Friday.");

        // Unsubscribe one student
        noticeBoard.unsubscribe(s2);

        // Post another notice
        noticeBoard.postNotice("Assignment deadline extended.");
    }
}