package txt.proceso;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Sqls {
	
	public String[][] content(){		
		
	Properties prop = new Properties();
	InputStream is = null;		 
	try {		    
	    is=new FileInputStream("src\\txt\\proceso\\ExportaTXT.properties");		    		    
	    prop.load(is);
	} catch(IOException ioe) {System.out.println(ioe);}		
		
		String MatrizLinea[][]= new String[1000][1000]; 
		
		int a  =1;
		Object objx;
		
		objx= "sql1_sql";MatrizLinea[a][1] =prop.getProperty(objx.toString());		
		objx= "sql1_col";MatrizLinea[a][3] =prop.getProperty(objx.toString());		
		objx= "sql1_nombre";MatrizLinea[a][2] =prop.getProperty(objx.toString());
		MatrizLinea[a][4] = "N";MatrizLinea[a][5] = "20";
		MatrizLinea[a][6] = "N";MatrizLinea[a][7] = "2";
		MatrizLinea[a][8] = "S";MatrizLinea[a][9] = "70";
		MatrizLinea[a][10] = "S";MatrizLinea[a][11] = "50";
		MatrizLinea[a][12] = "S";MatrizLinea[a][13] = "5";
		MatrizLinea[a][14] = "S";MatrizLinea[a][15] = "100";
		MatrizLinea[a][16] = "N";MatrizLinea[a][17] = "15";
		
		a=2;
		objx= "sql2_sql";MatrizLinea[a][1] =prop.getProperty(objx.toString());		
		objx= "sql2_col";MatrizLinea[a][3] =prop.getProperty(objx.toString());		
		objx= "sql2_nombre";MatrizLinea[a][2] =prop.getProperty(objx.toString());		
		MatrizLinea[a][4] = "N";MatrizLinea[a][5] = "20";
		MatrizLinea[a][6] = "N";MatrizLinea[a][7] = "2";
		MatrizLinea[a][8] = "S";MatrizLinea[a][9] = "70";
		MatrizLinea[a][10] = "S";MatrizLinea[a][11] = "50";
		MatrizLinea[a][12] = "S";MatrizLinea[a][13] = "5";
		MatrizLinea[a][14] = "S";MatrizLinea[a][15] = "100";
		MatrizLinea[a][16] = "N";MatrizLinea[a][17] = "15";		
		
		a=3;
		MatrizLinea[a][1] = "FIN";		
		
		return MatrizLinea;
	}
	
}
