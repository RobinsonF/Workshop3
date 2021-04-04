package co.edu.unbosque.workshop3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import co.edu.unbosque.persistence.Archivo;
import co.edu.unbosque.persistence.PetDTO;

public class Data implements Runnable {

	private Socket socket;

	private Socket socketAgente;

	private ArrayList<PetDTO> petsList;

	private Archivo archivo;

	public Data(Socket socket, Socket socketAgente) {
		this.socket = socket;
		this.socketAgente = socketAgente;
		archivo = new Archivo();
		this.petsList = archivo.leerArchivo();

	}

	@Override
	public void run() {

		safePrintln("Connected: " + socket);
		safePrintln("Connected: " + socketAgente);

		try {

			var in = new Scanner(socket.getInputStream());
			var out = new PrintWriter(socket.getOutputStream(), true);

			var inA = new Scanner(socketAgente.getInputStream());
			var outA = new PrintWriter(socketAgente.getOutputStream(), true);

			out.println("Ciudadano de 4 patas - 1. Crear caso - 2. Hablar con un agente");

			while (in.hasNextLine()) {
				var message1 = in.nextLine();
				System.out.println(message1);
				if (message1.equals("1")) {
					PetDTO pet = new PetDTO();
					out.println(
							"Escoja el caso - 1. Perdida - 2. Robo - 3. Abandono - 4. Animal peligroso - 5. Manejo indevido en vía pública");
					var message2 = in.nextLine();

					switch (message2) {

					case "1":
						pet.setCaso("Perdida");
						out.println("Ingrese la especie");
						var message3 = in.nextLine();
						pet.setEspecie(message3);
						out.println("Ingrese el tamaño");
						message3 = in.nextLine();
						pet.setTamaño(message3);
						out.println("Ingrese la dirección");
						message3 = in.nextLine();
						pet.setDireccion(message3);
						out.println("Ingrese la localidad");
						message3 = in.nextLine();
						pet.setLocalidad(message3);
						out.println("Ingrese su nombre");
						message3 = in.nextLine();
						pet.setNombrePersona(message3);
						out.println("Ingrese su teléfono");
						message3 = in.nextLine();
						pet.setTelefonoPersona(message3);
						out.println("Ingrese su email");
						message3 = in.nextLine();
						pet.setEmailPersona(message3);
						out.println("¿Algún comentario?");
						message3 = in.nextLine();
						pet.setComentariPersona(message3);
						Date fechaHoy = new Date();
						pet.setFecha(String.valueOf(fechaHoy));
						petsList.add(pet);
						archivo.escribirArchivo(petsList);
						out.println("El caso ha sido creado");
						break;

					case "2":
						pet.setCaso("Robo");
						out.println("Ingrese la especie");
						var message4 = in.nextLine();
						pet.setEspecie(message4);
						out.println("Ingrese el tamaño");
						message4 = in.nextLine();
						pet.setTamaño(message4);
						out.println("Ingrese la dirección");
						message4 = in.nextLine();
						pet.setDireccion(message4);
						out.println("Ingrese la localidad");
						message4 = in.nextLine();
						pet.setLocalidad(message4);
						out.println("Ingrese su nombre");
						message4 = in.nextLine();
						pet.setNombrePersona(message4);
						out.println("Ingrese su teléfono");
						message4 = in.nextLine();
						pet.setTelefonoPersona(message4);
						out.println("Ingrese su email");
						message4 = in.nextLine();
						pet.setEmailPersona(message4);
						out.println("¿Algún comentario?");
						message4 = in.nextLine();
						pet.setComentariPersona(message4);
						Date fechaHoy1 = new Date();
						pet.setFecha(String.valueOf(fechaHoy1));
						petsList.add(pet);
						archivo.escribirArchivo(petsList);
						out.println("El caso ha sido creado");
						break;

					case "3":
						pet.setCaso("Abandono");
						out.println("Ingrese la especie");
						var message5 = in.nextLine();
						pet.setEspecie(message5);
						out.println("Ingrese el tamaño");
						message5 = in.nextLine();
						pet.setTamaño(message5);
						out.println("Ingrese la dirección");
						message5 = in.nextLine();
						pet.setDireccion(message5);
						out.println("Ingrese la localidad");
						message5 = in.nextLine();
						pet.setLocalidad(message5);
						out.println("Ingrese su nombre");
						message5 = in.nextLine();
						pet.setNombrePersona(message5);
						out.println("Ingrese su teléfono");
						message5 = in.nextLine();
						pet.setTelefonoPersona(message5);
						out.println("Ingrese su email");
						message5 = in.nextLine();
						pet.setEmailPersona(message5);
						out.println("¿Algún comentario?");
						message5 = in.nextLine();
						pet.setComentariPersona(message5);
						Date fechaHoy2 = new Date();
						pet.setFecha(String.valueOf(fechaHoy2));
						petsList.add(pet);
						archivo.escribirArchivo(petsList);
						out.println("El caso ha sido creado");
						break;

					case "4":
						pet.setCaso("Animal Peligroso");
						out.println("Ingrese la especie");
						var message6 = in.nextLine();
						pet.setEspecie(message6);
						out.println("Ingrese el tamaño");
						message6 = in.nextLine();
						pet.setTamaño(message6);
						out.println("Ingrese la dirección");
						message6 = in.nextLine();
						pet.setDireccion(message6);
						out.println("Ingrese la localidad");
						message6 = in.nextLine();
						pet.setLocalidad(message6);
						out.println("Ingrese su nombre");
						message6 = in.nextLine();
						pet.setNombrePersona(message6);
						out.println("Ingrese su teléfono");
						message6 = in.nextLine();
						pet.setTelefonoPersona(message6);
						out.println("Ingrese su email");
						message6 = in.nextLine();
						pet.setEmailPersona(message6);
						out.println("¿Algún comentario?");
						message6 = in.nextLine();
						pet.setComentariPersona(message6);
						Date fechaHoy3 = new Date();
						pet.setFecha(String.valueOf(fechaHoy3));
						petsList.add(pet);
						archivo.escribirArchivo(petsList);
						out.println("El caso ha sido creado");
						break;

					case "5":
						pet.setCaso("Manejo indebido en vía pública");
						out.println("Ingrese la especie");
						var message7 = in.nextLine();
						pet.setEspecie(message7);
						out.println("Ingrese el tamaño");
						message7 = in.nextLine();
						pet.setTamaño(message7);
						out.println("Ingrese la dirección");
						message7 = in.nextLine();
						pet.setDireccion(message7);
						out.println("Ingrese la localidad");
						message7 = in.nextLine();
						pet.setLocalidad(message7);
						out.println("Ingrese su nombre");
						message7 = in.nextLine();
						pet.setNombrePersona(message7);
						out.println("Ingrese su teléfono");
						message7 = in.nextLine();
						pet.setTelefonoPersona(message7);
						out.println("Ingrese su email");
						message7 = in.nextLine();
						pet.setEmailPersona(message7);
						out.println("¿Algún comentario?");
						message7 = in.nextLine();
						pet.setComentariPersona(message7);
						Date fechaHoy4 = new Date();
						pet.setFecha(String.valueOf(fechaHoy4));
						petsList.add(pet);
						archivo.escribirArchivo(petsList);
						out.println("El caso ha sido creado");
						break;

					default:
						out.println("La opción es incorrecta");
					}
				}
				
				if (message1.equals("2")) {
					out.println("En momento conectaremos con el asesor");
					outA.println("1. Aceptar - 2. Denegar");
					var message2 = inA.nextLine();
					if (message2.equals("1")) {
						out.println("El agente ha aceptado tu solicitud, ya puedes enviar mensajes");
						while (in.hasNextLine()) {
							var message = in.nextLine();
							outA.println("Cliente: " + message);
							var message3 = inA.nextLine();
							out.println("Asesor: " + message3);
						}
					}

				} else {
					out.println("Escoja un número correcto - 1. Crear caso - 2. Hablar con agente");
				}

			}

		} catch (Exception e) {
			safePrintln("Error:" + socket);
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
			}
			safePrintln("Closed: " + socket);
		}
	}

	public void safePrintln(String s) {
		synchronized (System.out) {
			System.out.println(s);
		}
	}

}