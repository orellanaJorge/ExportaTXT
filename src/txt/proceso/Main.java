package txt.proceso;
import txt.bd.QueryBd;

public class Main {

	public static void main(String[] args) {
		
		Sqls f = new Sqls();		
		String MatrizLinea[][]= new String[100][100]; 
		String MatrizDimensiones[][]= new String[100][100];
		MatrizLinea = f.content();
		f = null;
		
		int loop=1;
		while(!MatrizLinea[loop][1].trim().equals("FIN")){		
			String sql = MatrizLinea[loop][1].trim();
			String nombreArchivo = MatrizLinea[loop][2].trim();
			int columnas = Integer.parseInt(MatrizLinea[loop][3].trim());
			int begin=4;
			for(int j=1;j<=columnas;j++){
				MatrizDimensiones[j][1] =  MatrizLinea[loop][begin].trim();begin++;
				MatrizDimensiones[j][2] =  MatrizLinea[loop][begin].trim();begin++;		
			}			
			
			QueryBd qry = new QueryBd();		
			qry.SQL_Dev_TXT(sql, nombreArchivo, columnas, MatrizDimensiones);		
			qry = null;
			
			System.out.println("Generación de (" + nombreArchivo + ")  OK.");
			
			loop++;
		}		
		System.out.println("FIN");		
	}
}
