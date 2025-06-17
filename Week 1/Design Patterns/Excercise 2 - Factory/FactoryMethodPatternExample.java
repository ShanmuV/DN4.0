interface Document {
    void printContent();
}

class PDFDocument implements Document{
    public void printContent(){
        System.out.println("Printing the contents of PDF DOCUMENT!");
    }
}

class WordDocument implements Document{
    public void printContent(){
        System.out.println("Printing the contents of WORD DOCUMENT!");
    }
}

class ExcelDocument implements Document{
    public void printContent(){
        System.out.println("Printing the contents of EXCEL DOCUMENT");
    }
}

class DocumentFactory{
    public static Document createDocument(String type){
        if(type == null) return null;

        type = type.toLowerCase();
        switch (type) {
            case "pdf":
                return new PDFDocument();
            case "word":
                return new WordDocument();
            case "excel":
                return new ExcelDocument();
            default:
                System.out.println("Document not supported.");
                return null;
        }
    }
}

public class FactoryMethodPatternExample {
    public static void main(String argsp[]){
        // creating a pdf using factory
        Document pdf = DocumentFactory.createDocument("pdf");
        pdf.printContent();

        // creating a word doc using factory
        Document word = DocumentFactory.createDocument("word");
        word.printContent();

        //creating a excel document with factory
        Document excel = DocumentFactory.createDocument("excel");
        excel.printContent();
    }
}
