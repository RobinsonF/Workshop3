package co.edu.unbosque.workshop3;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class DataClient {

    public static void main(String[] args) throws Exception {

        try (var socket = new Socket("127.0.0.1", 59897)) {

            System.out.println("Connected: " + socket);
//            System.out.println("Enter the message to be capitalized...");

            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
           
            System.out.println(in.nextLine());
            
            String mensaje = "";
            while (scanner.hasNextLine()) {
            	mensaje = scanner.nextLine();
                out.println(mensaje);
                System.out.println(in.nextLine());
            }

        }

    }

}