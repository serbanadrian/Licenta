package org.example;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;

public class Numarare2 {
    public Numarare2(){

    }
    public void crearePDF() throws MalformedURLException, FileNotFoundException {
        float col1 = 190f;
        float full[] = {col1*3};
        String image1 = "C:\\Users\\adria\\OneDrive\\Desktop\\licenta\\Licenta\\Poze\\Scriere 2.1.png";
        ImageData imageData1 = ImageDataFactory.create(image1);
        Image img1 = new Image(imageData1);
        String image2 = "C:\\Users\\adria\\OneDrive\\Desktop\\licenta\\Licenta\\Poze\\Incercuire cifra 2.png";
        ImageData imageData2 = ImageDataFactory.create(image2);
        Image image = new Image(imageData2);
        String image3 = "C:\\Users\\adria\\OneDrive\\Desktop\\licenta\\Licenta\\Poze\\partrate 2.png";
        ImageData imageData3 = ImageDataFactory.create(image3);
        Image img3 = new Image(imageData3);
        String path = "Invatarea cifrei 2.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);
        document.add(new Paragraph("Invatarea cifrei 2 (doi)").setFontSize(20f));
        Border gb = new SolidBorder(Color.GRAY,2f);
        Table div = new Table(full);
        div.setBorder(gb);
        document.add(div);
        document.add(new Paragraph("Exersarea scrierii cifrei 2(doi)"));
        document.add(img1);
        document.add(img1);
        document.add(new Paragraph("Exercitii de recunoastere a civrei 2 (doi):"));
        document.add(image.setFontSize(0.5f));
        document.add((new Paragraph("Creati prin incercuire grupe de cate doua: ")));
        document.add(img3);
        document.close();
    }
}
