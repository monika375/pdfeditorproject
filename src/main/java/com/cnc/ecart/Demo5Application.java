package com.cnc.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {
//		SpringApplication.run(Demo5Application.class, args);
		Pdfsplitter splitter = new PDFBoxPDFSplitter();
        try {
            splitter.split("C:/Users/Avi/Desktop/javaque.pdf", "javaque");
            System.out.println("PDF Splitting completed successfully");
        } catch (Exception e) {
            System.out.println("Error occurred while splitting PDF: " + e.getMessage());
        }
	}

}
