package twoway_TCP;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 8080);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String msg;
        while (true) {
            System.out.print("Client: ");
            out.println(br.readLine());
            msg = in.readLine();
            System.out.println("Server: " + msg);
            if (msg.equalsIgnoreCase("bye")) break;
        }

        s.close();
    }
}