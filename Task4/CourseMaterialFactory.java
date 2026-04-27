package Task4;
public interface CourseMaterialFactory {
    ReadingMaterial createReadingMaterial();
    Assessment createAssessment();
    Lecture createLecture();
}
