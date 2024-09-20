package fichero;
import java.io.*;

public class Principal {
	public static void cambiarPermisos(File f) {
		f.setReadable(false);
		f.setWritable(false);
		f.setExecutable(false);
	}
	//reading permissions
	public static void verPermisos(File f) {
		String permisos="";
		if(f.canRead()) {
			permisos=permisos+"r";
		}
		else {
			permisos=permisos+"-";
		}
	//writing permissions
			if(f.canWrite()) {
				permisos=permisos+"w";
			}
			else {
				permisos=permisos+"-";
			}
	//execute permissions
			if(f.canExecute()) {
				permisos=permisos+"x";
			}
			else {
				permisos=permisos+"-";
			}
		System.out.println("Los permisos del archivo" + f.getAbsolutePath()+ "son :"+ permisos);
	}
	

	public static void crearFichero(File f) {
		try {
			//CREAMOS FSICAMENTE EL FICHERO
			if(!f.exists()) {
				if(directorio.mkdirs()) {
					crearFichero(f);
					verPermisos(f);
					cambiarPermisos(f);
					verPermisos(f);
					f.delete();
				}
			
			if(f.createNewFile()){
				System.out.println("fichero creado");
			}
			else {
				System.out.println("no ha sido creado sir");
			}
			} else {
				System.out.println("El fichero ya existe");
				
			}
			verPermisos(f);
		cambiarPermisos(f);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void comprobarDirectorio(File f) {
		if (f.isDirectory()) {
			listarFicheros(f);
			
		}else {
			if(f.isFile())
				System.out.println("no se puede recorrer");
		}
	}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		// escribimos el nombre del fichero que se guarda de forma automatica mor
		String Nombredirectorio= ".\\datos\\";
		String Nombrefichero = "ficheroNuevo.txt";
		File directorio = new File(Nombredirectorio);
		File fichero = new File(Nombrefichero);
		
		if(!directorio.exists()) {
			
		}
		njdsjgnsjkgnrkjgnrsjkgnskgnsgknsdg
		siskgnkgnskgnskgnsdgkngkgn
		try {
			//CREAMOS FSICAMENTE EL FICHERO
			if(!fichero.exists()) {
				if(directorio.mkdirs()) {
					crearFichero(fichero);
					verPermisos(fichero);
					cambiarPermisos(fichero);
					verPermisos(fichero);
					fichero.delete();
				}
			
			if(fichero.createNewFile()){
				System.out.println("fichero creado");
			}
			else {
				System.out.println("no ha sido creado sir");
			}
			} else {
				System.out.println("El fichero ya existe");
				
			}
			verPermisos(fichero);
		cambiarPermisos(fichero);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
