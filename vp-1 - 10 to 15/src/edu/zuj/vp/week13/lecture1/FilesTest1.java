package edu.zuj.vp.week13.lecture1;

import java.io.*;

public class FilesTest1 {

    public static void main(String[] args) throws IOException {
        //FilesTest1.writeToFile("data.txt", "Hello from uncle Jalal");
        String content=FilesTest1.readFile("data.txt");
        System.out.println(content);
    }

    public static void writeToFile(String name, String data) throws IOException {
        FileWriter w = new FileWriter(name, true);
        w.append(data);
        w.close();
    }

    public static String readFile(String name) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(name);
        BufferedReader bufferedReader = new BufferedReader(fileReader);        
        String msg;
        String result="";
        while ((msg = bufferedReader.readLine()) != null) {
            result+=msg+"\n";
        }
        bufferedReader.close();
        return result;
    }
}
