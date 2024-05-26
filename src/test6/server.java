package test6;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.util.Scanner;
//public class server {
//    private static ArrayList<ClientHandler> clients = new ArrayList<>();
//    private static int clientID = 1;
//
//    public static void main(String[] args) {
//        try {
//            ServerSocket serverSocket = new ServerSocket(12345);
//            System.out.println("Server running on port " + serverSocket.getLocalPort());
//
//            while (true) {
//                Socket clientSocket = serverSocket.accept();
//                System.out.println("Client connected: " + clientSocket);
//                ClientHandler clientHandler = new ClientHandler(clientSocket, clients, clientID);
//                clients.add(clientHandler);
//                clientID++;
//                clientHandler.start();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
//
//class ClientHandler extends Thread {
//    private Socket clientSocket;
//    private ArrayList<ClientHandler> clients;
//    private int clientID;
//
//    public ClientHandler(Socket clientSocket, ArrayList<ClientHandler> clients, int clientID) {
//        this.clientSocket = clientSocket;
//        this.clients = clients;
//        this.clientID = clientID;
//    }
//
//    @Override
//    public void run() {
//        try {
//            InputStream inputStream = clientSocket.getInputStream();
//          //  OutputStream outputStream = clientSocket.getOutputStream();
//            Scanner scanner = new Scanner(inputStream);
//
//            while (true) {
//                String message = scanner.nextLine();
//                System.out.println("Client " + clientID + " says: " + message);
//
//                for (ClientHandler client : clients) {
//                    if (client != this) {
//                        client.sendMessage(message,clientID);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void sendMessage(String message,int clientID) throws IOException {
//        OutputStream outputStream = clientSocket.getOutputStream();
//        outputStream.write(("client " +clientID+":"+message + "\n").getBytes());
//    }
//}
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
public class server {
    private static ArrayList<ClientHandler> clients = new ArrayList<>();
    private static int clientID = 1;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server running on port " + serverSocket.getLocalPort());

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);
                ClientHandler clientHandler = new ClientHandler(clientSocket, clients, clientID);
                clients.add(clientHandler);
                clientID++;
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



class ClientHandler extends Thread {
    private Socket clientSocket;
    private ArrayList<ClientHandler> clients;
    private int clientID;

    public ClientHandler(Socket clientSocket, ArrayList<ClientHandler> clients, int clientID) {
        this.clientSocket = clientSocket;
        this.clients = clients;
        this.clientID = clientID;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            //  OutputStream outputStream = clientSocket.getOutputStream();
            Scanner scanner = new Scanner(inputStream);

            while (true) {
                String message = scanner.nextLine();
                System.out.println("Client " + clientID + " says: " + message);

                for (ClientHandler client : clients) {
                    if (client != this) {
                        client.sendMessage(message,clientID);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message,int clientID) throws IOException {
        OutputStream outputStream = clientSocket.getOutputStream();
        outputStream.write(("client " +clientID+":"+message + "\n").getBytes());
    }
}