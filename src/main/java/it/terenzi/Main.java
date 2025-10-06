package it.terenzi;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello world!");
        ServerSocket ss = new ServerSocket(3000);
        Socket mySocket = ss.accept();//istruzione bloccante fino a un collegamento alla port
        System.out.println("client si è connesso");

    }
}