package com.LR_1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            new Connection(clientSocket).run();
        }
    }
}