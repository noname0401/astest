package test6;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class client {
//    public static void main(String[] args) {
//        try {
//            Socket socket = new Socket("localhost", 12345);
//            System.out.println("Connected to server: " + socket);
//
//            InputStream inputStream = socket.getInputStream();
//            OutputStream outputStream = socket.getOutputStream();
//            Scanner scanner = new Scanner(System.in);
//
//            Thread receiver = new Thread(() -> {
//                while (true) {
//                    try {
//                        byte[] buffer = new byte[2048];
//                        int length = inputStream.read(buffer);
//                        String message = new String(buffer, 0, length);
//                       // int clientID = new int(buffer, 0, length);
//                        System.out.println(message);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                        break;
//                    }
//                }
//            });
//
//            receiver.start();
//
//            while (true) {
//                String message = scanner.nextLine();
//                outputStream.write((message + "\n").getBytes());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to server: " + socket);

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);

            Thread receiver = new Thread(() -> {
                while (true) {
                    try {
                        byte[] buffer = new byte[2048];
                        int length = inputStream.read(buffer);
                        String message = new String(buffer, 0, length);
                        System.out.println(message);
                    } catch (IOException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            });

            receiver.start();

            while (true) {
                String message = scanner.nextLine();
                outputStream.write((message + "\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}