package com.bigworks;

import com.bigworks.log.console.ConsoleLogCreator;
import com.bigworks.log.txt.TXTLogCreator;
import com.bigworks.log.xml.XMLLogCreator;
import com.bigworks.logger.Logger;

public class CalculadoraDeImpostos {
	  

	  public CalculadoraDeImpostos() {
	  }
	  
	  public void calcular(double valor) {

	    // no fim, o programador gostaria de deixar registrado o valor calculado
		    
	    Logger logger = new ConsoleLogCreator();
	    logger.log("Imposto calculado para o valor R$" + valor);
	    
	    Logger logger2 = new XMLLogCreator("/home/rafael/log.xml");
	    logger2.log("Gravando arquivo de log xml teste");	   
	    
	    Logger logger3 = new TXTLogCreator("/home/rafael/log.txt");
	    logger3.log("Gravando arquivo de log texto teste");
	    
	  }
	  
	  
	  
	  public static void main (String[] args) {
		  		  
		  CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		  
		  calculadora.calcular(5);
		  
	  }	  
		
	  
	}