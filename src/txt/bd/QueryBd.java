package txt.bd;
import java.sql.*;
import txt.proceso.GeneraTxt;

public class QueryBd {

	public void SQL_Dev_TXT(String sql,String nombreArchivo, int columnas, String MatrizDimensiones[][]) {
		
		try {
			Connection con = this.conecta();
			java.sql.ResultSet rset = null;
			rset = con.createStatement().executeQuery(sql);		
			
			GeneraTxt fileTxt = new GeneraTxt();		 
			String MatrizLinea[][]= new String[100][100]; 
			int conteoLineas = 1;
			while (rset.next()) {
				for(int x=1;x<=columnas;x++){
					if(rset.getString(x)==null){MatrizLinea[x][1] = "";}else{MatrizLinea[x][1] = rset.getString(x);}				
					MatrizLinea[x][2] = "N";MatrizLinea[x][3] = "20";
					MatrizLinea[x][2] = MatrizDimensiones[x][1];MatrizLinea[x][3] = MatrizDimensiones[x][2];
				}
				String linea = fileTxt.generaLinea(MatrizLinea, columnas, conteoLineas);
				fileTxt.generaTXT(linea, "C:\\TXT\\" + nombreArchivo);
				conteoLineas++;
			}		 	
			fileTxt=null;con.close();con = null;rset.close();rset = null;
		}catch(Exception e){System.out.println("Error BD - Sql : " + e);}
		
	}
		

	private Connection conecta() {
		Connection con = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());					
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.150.150.196:1521:legados", "dmips ", "123456");
			// con = DriverManager.getConnection("jdbc:oracle:thin:@Jorge-VAIO:1521:XE", "dmips", "123456");			
		} catch (Exception e) {System.out.println("Error BD - Conecta  : " + e);}
		return con;
	}


	
}
