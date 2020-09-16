package utils;

import com.aspose.pdf.Document;

public class PDFDecrypt {
    public void decryptPDF(){
        Document dipak = new Document("C:\\Users\\Dipak Maity\\Desktop\\boi.pdf","84894080");
        dipak.decrypt();
        System.out.println("File decrypted");
        dipak.save("C:\\Users\\Dipak Maity\\Desktop\\boi1.pdf");
    }
}
