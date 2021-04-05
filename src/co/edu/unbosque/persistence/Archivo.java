package co.edu.unbosque.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Archivo {

	private final String SAMPLE_CSV_FILE = "Data\\pets.csv";

	public Archivo() {
		
	}

	public void escribirArchivo(ArrayList<PetDTO> lista) {
		String DELIMITADOR = ",";
		String SALTO = "\n";
		String CABECERA = "Caso,Especie,Tamaño,Dirección,Localidad,Persona,Telefono,Email,Comentario";
		FileWriter bw;
		try {
			bw = new FileWriter(SAMPLE_CSV_FILE);
			
			for (PetDTO pet : lista) {
				bw.append(SALTO);
				bw.append(pet.getCaso());
				bw.append(DELIMITADOR);
				bw.append(pet.getEspecie());
				bw.append(DELIMITADOR);
				bw.append(pet.getTamaño());
				bw.append(DELIMITADOR);
				bw.append(pet.getLocalidad());
				bw.append(DELIMITADOR);
				bw.append(pet.getDireccion());
				bw.append(DELIMITADOR);
				bw.append(pet.getNombrePersona());
				bw.append(DELIMITADOR);
				bw.append(pet.getTelefonoPersona());
				bw.append(DELIMITADOR);
				bw.append(pet.getEmailPersona());
				bw.append(DELIMITADOR);
				bw.append(pet.getComentariPersona());
				bw.append(DELIMITADOR);
				bw.append(pet.getFecha());
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {

		}
	}
	
	 public ArrayList<PetDTO> leerArchivo() {
		 	ArrayList<PetDTO> lista = new ArrayList<PetDTO>();
	        BufferedReader bufferLectura = null;
	        try {
	            bufferLectura = new BufferedReader(new FileReader(SAMPLE_CSV_FILE));

	            String linea = bufferLectura.readLine();

	            while (linea != null) {
	                PetDTO pet = new PetDTO();
	                String[] campos = linea.split(",");
	                if (campos.length == 10) {
	                    try {
	                    	pet.setCaso(campos[0]);
	        				pet.setEspecie(campos[1]);
	        				pet.setTamaño(campos[2]);
	        				pet.setDireccion(campos[3]);
	        				pet.setLocalidad(campos[4]);
	        				pet.setNombrePersona(campos[5]);
	        				pet.setTelefonoPersona(campos[6]);
	        				pet.setEmailPersona(campos[7]);
	        				pet.setComentariPersona(campos[8]);
	        				pet.setFecha(campos[9]);
	        				lista.add(pet);
	                    } catch (NumberFormatException e) {

	                    } 
	                }
	                linea = bufferLectura.readLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (bufferLectura != null) {
	                try {
	                    bufferLectura.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
			return lista;
	    }
}
