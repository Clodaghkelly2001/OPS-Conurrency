package ie.aie.serversingle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WorkerThread extends Thread
{

    Socket s;

    WorkerThread(Socket s)
    {
        this.s=s;
    }

    public void run()
    {
        try
        {
            InputStream in = s.getInputStream();
            Scanner sc = new Scanner(in);
            OutputStream o = s.getOutputStream();
            PrintWriter p = new PrintWriter(o);

            String fileName;
            fileName = sc.nextLine();
            System.out.println(getName() + " handling " +fileName);

            FileInputStream fin = new FileInputStream(fileName);
            Scanner f = new Scanner(fin);

            String line;
            while(f.hasNextLine())
            {
                line = f.nextLine();
                p.println(line);
            }
            sleep(15000);
            p.close();
            System.out.println(getName() + " Finished handling " +fileName);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
