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

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Numarare2 {
    private int nr;
    private String figura;
    private String culoare;
    public Numarare2(int nr, String figura, String culoare){
        this.nr = nr;
        this.culoare = culoare;
        this.figura = figura;

    }
    public void crearePDF() throws MalformedURLException, FileNotFoundException, URISyntaxException {
        float col1 = 190f;
        float full[] = {col1*3};
            String image1 = "src/main/resources/Poze/ScrierePDF " + nr +".png";

            ImageData imageData1 = ImageDataFactory.create(image1);
            Image img1 = new Image(imageData1);
            String image2 = "src/main/resources/Poze/Incercuire cifra " + nr +".png";
            ImageData imageData2 = ImageDataFactory.create(image2);
            Image image = new Image(imageData2);
            String image3 = "src/main/resources/Poze/" + figura + " " + culoare +".png";
            ImageData imageData3 = ImageDataFactory.create(image3);
            Image img3 = new Image(imageData3);
            String path = "Invatarea cifrei " + nr +".pdf";
            PdfWriter pdfWriter = new PdfWriter(path);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            pdfDocument.setDefaultPageSize(PageSize.A4);
            Document document = new Document(pdfDocument);
            document.add(new Paragraph("Invatarea cifrei " + nr).setFontSize(20f));
            Border gb = new SolidBorder(Color.GRAY, 2f);
            Table div = new Table(full);
            div.setBorder(gb);
            document.add(div);
            document.add(new Paragraph("Exersarea scrierii cifrei " + nr + this.numar()));
            document.add(img1);
            document.add(img1);
            document.add(new Paragraph("Exercitii de recunoastere a civrei " + nr + this.numar() + ":"));
            document.add(image.setFontSize(0.5f));
            document.add((new Paragraph("Creati prin incercuire grupe de cate " + this.figuri())));
            document.add(img3);
            document.close();
    }
    public String numar(){
        if (nr == 1) return "(unu)";
        if (nr == 2) return "(doi)";
        if (nr == 3) return "(trei)";
        if (nr == 4) return "(patru)";
        if (nr == 5) return "(cinci)";
        if (nr == 6) return "(sase)";
        if (nr == 7) return "(sapte)";
        if (nr == 8) return "(opt)";
        if (nr == 9) return "(noua)";
        if (nr == 10) return "(zece)";
        return "invalid";
    }
    public String figuri(){
        if (nr == 1) return "1(individuale):";
        if (nr == 2) return "2(doua):";
        if (nr == 3) return "3(trei):";
        if (nr == 4) return "4(patru):";
        if (nr == 5) return "5(cinci):";
        if (nr == 6) return "6(sase):";
        if (nr == 7) return "7(sapte):";
        if (nr == 8) return "8(opt):";
        if (nr == 9) return "9(noua):";
        if (nr == 10) return "10(zece):";
        return "invalid";
    }
}
