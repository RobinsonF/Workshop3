package co.edu.unbosque.workshop3;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.concurrent.Executors;

public class DataServer {

    public static void main(String[] args) throws Exception {

        try (var listener = new ServerSocket(59897)) {
        	
        
            System.out.println("The capitalization server is running...");
          
                      
            var pool = Executors.newFixedThreadPool(20);

            while (true) {
                pool.execute(new Data(listener.accept()));
            }

        }

    }

}
