package com.cnc.ecart;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class PDFBoxPDFSplitter implements Pdfsplitter {

    @Override
    public void split(String sourceFile, String outputDir) throws Exception {
        PDDocument document = PDDocument.load(new File(sourceFile));
        Splitter splitter = new Splitter();
        List<PDDocument> splitDocuments = splitter.split(document);

        Iterator<PDDocument> iterator = splitDocuments.listIterator();
        int pageCount = 1;
        while (iterator.hasNext()) {
            PDDocument splitDocument = iterator.next();
            String outputDir1 = "C:/Users/Avi/Desktop";
            String outputFile = outputDir1 + File.separator + "javaque" + pageCount + ".pdf";
           //            String outputFile = outputDir + File.separator + "output_" + pageCount + ".pdf";
            splitDocument.save(outputFile);
            splitDocument.close();
            pageCount++;
        }
        document.close();
    }
}
