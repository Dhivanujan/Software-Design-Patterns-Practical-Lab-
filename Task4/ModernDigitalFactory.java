public class ModernDigitalFactory implements CourseMaterialFactory {
    @Override
    public ReadingMaterial createReadingMaterial() {
        return new EBook();
    }

    @Override
    public Assessment createAssessment() {
        return new OnlineQuiz();
    }

    @Override
    public Lecture createLecture() {
        return new VideoLecture();
    }
}