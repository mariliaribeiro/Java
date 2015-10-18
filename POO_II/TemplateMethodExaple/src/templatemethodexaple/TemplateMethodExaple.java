package templatemethodexaple;

public class TemplateMethodExaple {
    
    // Quando se tem um formato predefinido para a implementação mas seus passos podem variar.
   // Quando se quer evitar duplicação de código implementando códigos na classe base ou nas variações das subclasses;

    public static void main(String[] args) {
        CSVDataParser csvDataParser = new CSVDataParser();
        csvDataParser.parseDataAndGenerateOutput();
        System.out.println("**********************");
        DatabaseDataParser databaseDataParser=new DatabaseDataParser();
        databaseDataParser.parseDataAndGenerateOutput();
    }
    
}
