package Assignment_Lesson_5.Exercise5.Question4;

public class DocumentManager {
    protected Document [] documents;
    protected int numberOfDocuments;
    protected final int maxNumber = 100;

    public DocumentManager(){
        documents = new Document[maxNumber];
        numberOfDocuments = 0;
    }

    public void addMoreDocument(Document document){
        if(numberOfDocuments < maxNumber){
            documents[numberOfDocuments] = document;
            numberOfDocuments++;
            System.out.println("Added document!");
        }
        else{
            System.out.println("Maximum of document reached!");
        }
    }

    public void deleteDocument(String id){
        int found = 0;
        for(int i = 0; i < numberOfDocuments; i++){
            if(documents[i].id.equals(id)){
                for(int j = i; j < numberOfDocuments - 1; j++){
                    documents[j] = documents[j + 1];
                }
                documents[numberOfDocuments - 1] = null;
                numberOfDocuments--;
                i--;
                found++;
            }
        }
        if(found > 0){
            System.out.println("Deleted document with id: " + id);
        }
        else{
            System.out.println("Cannot find the document with id: " + id);
        }
    }

    public void print(){
        for(Document doc : documents){
            doc.printInfo();
        }
    }

    public void searchDocument(String type){
        int found = 0;
        for(int i = 0; i < numberOfDocuments; i++){
            if(type.equalsIgnoreCase("Book") && documents[i] instanceof Book){
                System.out.println(documents[i]);
                found++;
            }
            if(type.equalsIgnoreCase("Magazine") && documents[i] instanceof Magazine){
                System.out.println(documents[i]);
                found++;
            }
            if(type.equalsIgnoreCase("Newspaper") && documents[i] instanceof Newspaper){
                System.out.println(documents[i]);
                found++;
            }
        }
        if(found == 0){
            System.out.println("No document found with type: " + type);
        }
    }
}
