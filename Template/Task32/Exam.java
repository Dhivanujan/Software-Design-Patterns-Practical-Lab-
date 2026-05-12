package Template.Task32;

abstract class Exam {

    // Template Method
    final void conductExam() {
        startExam();
        answerQuestions();
        submitExam();
        generateResults();
    }

    void startExam() {
        System.out.println("Exam Started");
    }

    abstract void answerQuestions();

    void submitExam() {
        System.out.println("Exam Submitted");
    }

    void generateResults() {
        System.out.println("Results Generated");
    }
}

// MCQ Exam
class MCQExam extends Exam {

    void answerQuestions() {
        System.out.println("Answering MCQ Questions");
    }
}

// Coding Exam
class CodingExam extends Exam {

    void answerQuestions() {
        System.out.println("Answering Coding Questions");
    }
}
