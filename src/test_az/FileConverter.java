package test_az;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.io.*;
import java.util.*;

public class FileConverter {
    public static void main(String[] args) {
        // 指定文件路径
        String filePath = "D:\\设计模式作业\\Scala.txt";

        // 读取文件并处理内容
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<String> attributes = new ArrayList<>();
            List<String> methods = new ArrayList<>();
            String className = "";

            // 逐行读取文件内容
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0) {
                    // 解析每一行的内容
                    String type = parts[0];
                    if (type.equals("className")) {
                        className = parts[1];
                    } else if (type.equals("attribute")) {
                        String attribute = "    ";
                        attribute += parts[3] + " " + parts[2] + " " + parts[1] + ";";
//                        if (!parts[4].equals("")) {
//                            attribute += " // 默认值：" + parts[4];
//                        }
                        attributes.add(attribute);
                    } else if (type.equals("method")) {
                        String method = "    ";
                        method += parts[3] + " " + parts[1] + "(";
                        for (int i = 4; i < parts.length; i += 2) {
                            method += parts[i] + " " + parts[i + 1];
                            if (i < parts.length - 2) {
                                method += ", ";
                            }
                        }
                        method += ") {";
                        methods.add(method);
                        methods.add("        // 实现方法逻辑");
                        methods.add("    }");
                    }
                }
            }

            // 将解析后的内容写入到.java文件中
            String outputFileName = className + ".java";
            try (PrintWriter writer = new PrintWriter(outputFileName)) {
                // 写入包名和导入语句
                writer.println("import java.util.Date;");
                writer.println();
                // 写入类定义
                writer.println("public class " + className + " {");
                // 写入属性
                for (String attribute : attributes) {
                    writer.println(attribute);
                }
                writer.println();
                // 写入方法
                for (String method : methods) {
                    writer.println(method);
                }
                // 写入类结束符
                writer.println("}");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println("Java文件已生成: " + outputFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

