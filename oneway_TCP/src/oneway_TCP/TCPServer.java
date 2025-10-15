package oneway_TCP;
import java.io.*;
import java.net.*;
import java.util.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("Current Date & Time: " + new Date());
        out.close();
        s.close();
        ss.close();
    }
}
