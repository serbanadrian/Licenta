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
import java.net.URISyntaxException;
import java.nio.charset.MalformedInputException;

public class Main {
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException, URISyntaxException {

        Numarare2 numarare1 = new Numarare2(6,"Spirale", "albastre");
        Numarare2 numarare2 = new Numarare2(7,"Cercuri", "albastre");
        Numarare2 numarare3 = new Numarare2(8,"Patrate", "rosii");
        Numarare2 numarare4 = new Numarare2(9,"Spirale", "rosii");
        Numarare2 numarare5 = new Numarare2(10,"Triunghiuri", "rosii");
        numarare1.crearePDF();
        numarare2.crearePDF();
        numarare3.crearePDF();
        numarare4.crearePDF();
        numarare5.crearePDF();

    }
}