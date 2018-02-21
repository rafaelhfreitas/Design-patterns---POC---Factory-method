package com.bigworks.log.txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import com.bigworks.log.LogPrinter;

public class TXTLogPrinter implements LogPrinter {

	
    private String filePath;

    
    public TXTLogPrinter() {
 
    }    

    public TXTLogPrinter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void print(String message) {
        FileWriter file;
        PrintWriter writer;
        
        try {
            file = new FileWriter(filePath);
            writer = new PrintWriter(file);
            java.util.Date data = new java.util.Date();
            writer.printf("%s%n", data.toString() + ' ' +message);

            file.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro no log: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
