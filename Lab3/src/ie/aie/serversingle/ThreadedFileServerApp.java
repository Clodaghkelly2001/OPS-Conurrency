package ie.aie.serversingle;

import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedFileServerApp
{

    public static void main(String[] args) throws Exception {

        System.out.println("Server Ready: ");

        ServerSocket ss = new ServerSocket(1472);
        while(true)
        {
            Socket s = ss.accept();
            Thread t = new WorkerThread(s);
            t.start();
        }

    }

}
