package co.edu.unbosque.workshop3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Data implements Runnable {

	private Socket socket;

	public Data(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		safePrintln("Connected: " + socket);

		try {

			var in = new Scanner(socket.getInputStream());
			var out = new PrintWriter(socket.getOutputStream(), true);
			out.println("Cidadano de 4 patas - 1.Crear caso - 2.Hablar con agente");

			while (in.hasNextLine()) {
				var message1 = in.nextLine();
				System.out.println(message1);
				if (message1.equals("1")) {
					out.println(
							"Escaja el caso - 1.Perdida - 2.Robo - 3.Abandono - 4.Animal Peligroso - 5.Manejo indevido en vía pública");
					var message2 = in.nextLine();
						switch (message2) {
						case "1":
							out.println("Ingrese la especie");
							var message3 = in.nextLine();
							out.println("Ingrese el tamaño");
							message3 = in.nextLine();
							out.println("Ingrese la dirección");
							message3 = in.nextLine();
							out.println("Ingrese su nombre");
							message3 = in.nextLine();
							out.println("Ingrese su telefono");
							message3 = in.nextLine();
							out.println("Ingrese su email");
							message3 = in.nextLine();
							out.println("¿Algún comentario?");
							message3 = in.nextLine();
							out.println("El caso ha sido creado");
							break;
						case "2":
							out.println("Ingrese la especie");
							var message4 = in.nextLine();
							out.println("Ingrese el tamaño");
							message4 = in.nextLine();
							out.println("Ingrese la dirección");
							message4 = in.nextLine();
							out.println("Ingrese su nombre");
							message4 = in.nextLine();
							out.println("Ingrese su telefono");
							message4 = in.nextLine();
							out.println("Ingrese su email");
							message4 = in.nextLine();
							out.println("¿Algún comentario?");
							message4 = in.nextLine();
							out.println("El caso ha sido creado");
							break;
						case "3":
							out.println("Ingrese la especie");
							var message5 = in.nextLine();
							out.println("Ingrese el tamaño");
							message5 = in.nextLine();
							out.println("Ingrese la dirección");
							message5 = in.nextLine();
							out.println("Ingrese su nombre");
							message5 = in.nextLine();
							out.println("Ingrese su telefono");
							message5 = in.nextLine();
							out.println("Ingrese su email");
							message5 = in.nextLine();
							out.println("¿Algún comentario?");
							out.println("El caso ha sido creado");
							message5 = in.nextLine();
							break;
						case "4":
							out.println("Ingrese la especie");
							var message6 = in.nextLine();
							out.println("Ingrese el tamaño");
							message6 = in.nextLine();
							out.println("Ingrese la dirección");
							message6 = in.nextLine();
							out.println("Ingrese su nombre");
							message6 = in.nextLine();
							out.println("Ingrese su telefono");
							message6 = in.nextLine();
							out.println("Ingrese su email");
							message6 = in.nextLine();
							out.println("¿Algún comentario?");
							message6 = in.nextLine();
							out.println("El caso ha sido creado");
							break;
						case "5":
							out.println("Ingrese la especie");
							var message7 = in.nextLine();
							out.println("Ingrese el tamaño");
							message7 = in.nextLine();
							out.println("Ingrese la dirección");
							message7 = in.nextLine();
							out.println("Ingrese su nombre");
							message7 = in.nextLine();
							out.println("Ingrese su telefono");
							message7 = in.nextLine();
							out.println("Ingrese su email");
							message7 = in.nextLine();
							out.println("¿Algún comentario?");
							message7 = in.nextLine();
							out.println("El caso ha sido creado");
							break;
						default:
	                        out.println("La opción es incorrecta");
						}
				} else {
					out.println("Escoja un número correcto - 1.Crear caso - 2.Hablar con agente");
				}

			}

			while (in.hasNextLine()) {
				var message = in.nextLine();
				System.out.println(message);
				safePrintln("The message received is: " + message);
				var newMessage = message.toUpperCase();
				safePrintln("The message to be returned is: " + newMessage);
				out.println(newMessage);
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