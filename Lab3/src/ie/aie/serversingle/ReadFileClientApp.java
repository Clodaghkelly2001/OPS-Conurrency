package ie.aie.serversingle;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ReadFileClientApp
{

    public static void main(String[] args) throws Exception
    {

        InetAddress inet = InetAddress.getLocalHost();

        Socket s = new Socket(inet,1472);
        InputStream in = s.getInputStream();
        Scanner sc = new Scanner(in);
        OutputStream o = s.getOutputStream();
        PrintWriter p = new PrintWriter(o);
        p.println("Lab3/src/testing.txt");
        p.flush();

        String line;
        while(sc.hasNextLine())
        {
            line = sc.nextLine();
            System.out.println(line);
        }

    }

}
