package co.edu.unbosque.workshop3;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class DataClient {

    public static void main(String[] args) throws Exception {

        try (var socket = new Socket("127.0.0.1", 59897)) {

            System.out.println("Connected: " + socket);

            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
           
            System.out.println(in.nextLine());

            String mensaje = "";
            while (scanner.hasNextLine()) {
            	mensaje = scanner.nextLine();
            		int k = 0;
            		do {
            			if(mensaje.length() != 0) {
            			k = 1;
            			}else {
            			System.out.println("Por favor ingrese algún valor");
            			mensaje = scanner.nextLine();
            			k = 0;
            			}
            		}while(k == 0);
                out.println(mensaje);
                System.out.println(in.nextLine());
            }

        }

    }

}