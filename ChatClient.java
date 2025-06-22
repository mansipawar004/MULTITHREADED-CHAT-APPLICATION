package com.chat.client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER = "localhost";
        final int PORT = 4321;

        try (Socket socket = new Socket(SERVER, PORT)) {
            System.out.println("Connected to the chat server");

            new Thread(new ReceiveMessages(socket)).start();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();
            out.println(userName);

            while (true) {
                String message = scanner.nextLine();
                out.println(message);
            }

        } catch (IOException e) {
            System.out.println("Error connecting to the server");
            e.printStackTrace();
        }
    }

    static class ReceiveMessages implements Runnable {
        private Socket socket;

        public ReceiveMessages(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                System.out.println("Disconnected from server");
            }
        }
    }
