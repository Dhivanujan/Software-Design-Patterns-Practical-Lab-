public class TraditionalPrintFactory implements CourseMaterialFactory {
    @Override
    public ReadingMaterial createReadingMaterial() {
        return new PrintedTextbook();
    }

    @Override
    public Assessment createAssessment() {
        return new WrittenEssay();
    }

    @Override
    public Lecture createLecture() {
        return new ClassroomLecture();
    }
}