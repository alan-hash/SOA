package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j;
		MDB administradorBD =  new MDB();
		List<ArrayList<String>> datosObtenidos= new ArrayList<ArrayList<String>>();
		ArrayList<String> renglonObtenido = new ArrayList<String>();
		String leyenda;
                //insertar
               leyenda= administradorBD.registrarAlta("tbusuarios", "1, 'Jhon','usuarioJhon',1234");
	//	System.out.println(leyenda);
                
                //modificar

      //leyenda = administradorBD.modificarRegistro("tbusuarios", "nombre= 'Saul' , usuario='Sempai' ,  psw= '123547'", "id = 6");e
//     System.out.println(leyenda);
                
               
          //leyenda = administradorBD.borrarRegistro("TbUsuarios", "id = 6");
             System.out.println(leyenda);
		
                //consulta
		datosObtenidos = administradorBD.consultarDatos("tbUsuarios", "id , nombre,apPaterno, psw", "id=1");
                  System.out.println(leyenda);
		for(i=0;i<datosObtenidos.size();i++)
		{
                    renglonObtenido = datosObtenidos.get(i);
                    for(j=0;j<renglonObtenido.size();j++){
			System.out.print(renglonObtenido.get(j) + " ");
                    }
                    System.out.println();
		}
        }
}
