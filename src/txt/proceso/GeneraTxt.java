package txt.proceso;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GeneraTxt {

	public void generaTXT(String linea, String nombreArchivo){	
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(nombreArchivo, true));			
			out.write(linea);
			out.newLine();
		    out.close();
		} catch (IOException e) {System.out.println(e);}
	}
	
	public String generaLinea(String MatrizLinea[][], int columnasEvaluadas, int conteoLineas){
		String linea = "";
		try{			
			for(int i=1;i<=columnasEvaluadas;i++){
								
				if(MatrizLinea[i][2].trim().equals("S")){
					String cadena = MatrizLinea[i][1];
					int largoTotal = Integer.parseInt(MatrizLinea[i][3].trim());
					int largoCadena = cadena.length();
					for(largoCadena=largoCadena;largoCadena<largoTotal;largoCadena++){
						cadena+=" ";
					}
					linea+=cadena;
				}else{
					String cadena = MatrizLinea[i][1];
					int largoTotal = Integer.parseInt(MatrizLinea[i][3].trim());
					int largoCadena = cadena.length();
					String ceros = "";
					for(largoCadena=largoCadena;largoCadena<largoTotal;largoCadena++){
						ceros+="0";
					}			
					ceros+=cadena;
					linea+=ceros;
				}								
				
			}	
		}catch(Exception e){
			System.out.println("Error GeneraLinea : " + conteoLineas + "-" + e);}				
		return linea;
	}
	
}
