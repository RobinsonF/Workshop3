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
				int j = 0;
				do {
					if (message1.equals("1") || message1.equals("2")) {
						j = 1;
					} else {
						out.println("Ingrese un dato correcto <1/2>");
						message1 = in.nextLine();
						j = 0;
					}
				} while (j == 0);
				int j1 = 0;

				if (message1.equals("1")) {
					do {
						PetDTO pet = new PetDTO();
						out.println(
								"Escoja el caso - 1. Perdida - 2. Robo - 3. Abandono - 4. Animal peligroso - 5. Manejo indebido en vía pública");
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
							SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
							Date fechaHoy = new Date();
							pet.setFecha(String.valueOf(formatter.format(fechaHoy)));
							petsList.add(pet);
							archivo.escribirArchivo(petsList);
							out.println("El caso ha sido creado - " + String.valueOf(formatter.format(fechaHoy))
									+ " - Desea registrar otro caso <s/n>");
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
							SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
							Date fechaHoy1 = new Date();
							pet.setFecha(String.valueOf(formatter1.format(fechaHoy1)));
							petsList.add(pet);
							archivo.escribirArchivo(petsList);
							out.println("El caso ha sido creado - " + String.valueOf(formatter1.format(fechaHoy1))
									+ " - Desea registrar otro caso <s/n>");
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
							SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
							Date fechaHoy2 = new Date();
							pet.setFecha(String.valueOf(formatter2.format(fechaHoy2)));
							petsList.add(pet);
							archivo.escribirArchivo(petsList);
							out.println("El caso ha sido creado - " + String.valueOf(formatter2.format(fechaHoy2))
									+ " - Desea registrar otro caso <s/n>");
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
							SimpleDateFormat formatter3 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
							Date fechaHoy3 = new Date();
							pet.setFecha(String.valueOf(formatter3.format(fechaHoy3)));
							petsList.add(pet);
							archivo.escribirArchivo(petsList);
							out.println("El caso ha sido creado - " + String.valueOf(formatter3.format(fechaHoy3))
									+ " - Desea registrar otro caso <s/n>");
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
							SimpleDateFormat formatter4 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
							Date fechaHoy4 = new Date();
							pet.setFecha(String.valueOf(formatter4.format(fechaHoy4)));
							petsList.add(pet);
							archivo.escribirArchivo(petsList);
							out.println("El caso ha sido creado - " + String.valueOf(formatter4.format(fechaHoy4))
									+ " - Desea registrar otro caso <s/n>");
							break;

						default:
							out.println("La opción es incorrecta - Desea registrar un nuevo caso <s/n>");
							break;
						}
						var message0 = in.nextLine();
						System.out.println(message0);
						if (message0.toUpperCase().equals("S")) {
							j1 = 0;
						} else if (message0.toUpperCase().equals("N")) {
							j1 = 1;
						} else {
							int k = 0;
							do {
								if (message0.toUpperCase().equals("S") || message0.toUpperCase().equals("N")) {
									k = 1;
								} else {
									out.println("Escoja un dato valido <s/n>");
									message0 = in.nextLine();
									k = 0;
								}

							} while (k == 0);
						}
					} while (j1 == 0);
					out.println("Gracias... Programa finalizado");
				}else if (message1.equals("2")) {
					out.println("En momento conectaremos con el asesor");
					outA.println("1. Aceptar - 2. Denegar");
					var message2 = inA.nextLine();
					if (message2.equals("1")) {
						out.println("El agente ha aceptado tu solicitud, ya puedes enviar mensajes");
						while (true) {
							var message = in.nextLine();
							outA.println("Cliente: " + message);
							var message3 = inA.nextLine();
							out.println("Asesor: " + message3);
						}
					}
					if (message2.equals("2")) {
						out.println("El agente no está disponible");
					}
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