package twoway_TCP;

import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String msg;
        while (true) {
            msg = in.readLine();
            System.out.println("Client: " + msg);
            if (msg.equalsIgnoreCase("bye")) break;
            System.out.print("Server: ");
            out.println(br.readLine());
        }

        s.close();
        ss.close();
    }
}