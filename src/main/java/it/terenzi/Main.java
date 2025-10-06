package it.terenzi;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world!");
        ServerSocket ss = new ServerSocket(3000);
        Socket mySocket = ss.accept();//istruzione bloccante fino a un collegamento alla port
        System.out.println("connesso");
        
        BufferedReader in =new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
        PrintWriter out =new PrintWriter(mySocket.getOutputStream(), true);

        out.println("welcome | v1.0.0");
        String str =in.readLine();
        str = str.toUpperCase();
        out.println(str);
    }
}