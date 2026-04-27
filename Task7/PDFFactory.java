package Task7;
class PDFFactory extends DocumentFactory {
    Document createDocument() {
        return new PDFDocument();
    }
}
