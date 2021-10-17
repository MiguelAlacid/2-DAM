package ctrl;

import java.io.*;

import model.Persona;
public class gestionFch {

	//25 caracteres x 2 = 50,
	private RandomAccessFile fch; // 5 caracteres x 2 = 10, 4 int, 8 double  == 22
	
	public gestionFch(String fileName) {
		abrirFichero(fileName);
	}

	private void abrirFichero(String fileName) {
		try {
			fch = new RandomAccessFile(fileName,"rw"); //r solo lectura //w solo escritura //rw ambos
		}catch(FileNotFoundException e) {
			System.err.println("El fichero " + fileName + "no existe");
		}
		
	}

	public void cerrarFichero() {
		try {
			fch.close();
		}catch(IOException e) {
			System.err.println("el fichero no puede cerrarse.");
		}
		
	}

	public void escribirRegistro(int iNumeroRegistro, Persona persona) {
		
		try {
			long posicion = getPosition(iNumeroRegistro);
			fch.seek(posicion);
			
			//NOMBRE
			String sNombre = persona.getsNombre();
			char chLetra;
			for(int i = 0; i < 5; i++) {
				
				chLetra = (i<sNombre.length()) ? sNombre.charAt(i) : ' ';
				fch.writeChar(chLetra);
			}
			
			//EDAD
			fch.writeInt(persona.getiEdad());
			//ALTURA
			fch.writeDouble(persona.getdAltura());
		} catch (IOException e) {
			System.err.println("el fichero no es accesible");
		}
	}

	private long getPosition(int iNumeroRegistro) {
		
		return (iNumeroRegistro -1) * Persona.longReg;
	}

	public Persona leerRegistro(int iNumeroRegistro) {
		String sNombre = "";
		int iEdad = 0;
		double dAltura = 0.0;
		
		try {
			long posicion = getPosition(iNumeroRegistro);
			fch.seek(posicion);
			
			// NOMBRE
			for(int i = 0; i < Persona.longNombre; i++) {
				sNombre += fch.readChar();
				}
			
			// EDAD
			
			iEdad = fch.readInt();
			
			// ALTURA
			
			dAltura = fch.readDouble();
			}catch(IOException e){
			System.err.println("El fichero no es accesible");
		}
		return new Persona(sNombre, iEdad, dAltura);
	}
	
}
