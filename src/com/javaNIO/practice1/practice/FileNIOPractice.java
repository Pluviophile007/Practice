package com.javaNIO.practice1.practice;


import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;

public class FileNIOPractice {
    public static void main(String[] args) throws IOException {
        System.out.println("FileOPerations are started");
        // create Directory
        System.out.println("Dir Creations started");

        Path path = createDirectory();
        System.out.println("Dir Creations Ended");
        //Create File
        System.out.println("File Creations started");
        createFile(path);

        System.out.println("File Creations Ended");
        // Read File
        System.out.println("Read  File started");
        readFile();

        System.out.println("Read  File Ended");

        // Write File
        System.out.println("Write File started");
        writeFile();

        System.out.println("Write File  Ended");

        // Append File
        System.out.println("Append File  started");
        appendFile();
        System.out.println("Append File  Ended");

        // Copy File
        System.out.println("Copy File started");
        copyFiles();

        System.out.println("Copy File Ended");

        // Move File
        System.out.println("Move File started");

        moveFiles();
        System.out.println("Move File Ended");

    }

    private static void writeFile() {
        Path path2 =  Paths.get("C:\\Users\\maanm\\IdeaProjects\\Practice\\src\\com\\javaNIO\\practice1\\Files\\mayank.txt");

        try {
            while(true) {
                String str = "Hi I am a good boy";
                path2 = Files.write(path2, Collections.singleton(str), StandardOpenOption.APPEND);
            }
        } catch (FileAlreadyExistsException e) {
            System.out.println("File Already Exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File has been created = "+path2);
    }
    private static void appendFile() {
    }

    private static void copyFiles() {
    }
    private static void moveFiles() {
    }
    private static void readFile() {

        Path path2 =  Paths.get("C:\\Users\\maanm\\IdeaProjects\\Practice\\src\\com\\javaNIO\\practice1\\Files\\mayank.txt");

        try {
            String str = "Hi I am a good boy";
            List<String> list  = Files.readAllLines(path2);
            list.forEach(System.out::println);
        } catch (FileAlreadyExistsException e) {
            System.out.println("File Already Exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File has been read = "+path2);
    }

    private static void createFile(Path path) {
        Path path2 =  Paths.get("C:\\Users\\maanm\\IdeaProjects\\Practice\\src\\com\\javaNIO\\practice1\\Files\\mayank.txt");

        try {
            path2 = Files.createFile(path2);
        } catch (FileAlreadyExistsException e) {
            System.out.println("File Already Exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File has been created = "+path2);
    }

    private static Path createDirectory() throws IOException {

      Path path =   Paths.get("C:\\Users\\maanm\\IdeaProjects\\Practice\\src\\com\\javaNIO\\practice1\\Files");
      try {
          System.out.println("Directory has been created in  = " + Files.createDirectory(path));
      }
      catch (FileAlreadyExistsException existsException)
      {
          System.out.println("Directory already exists");
      }
      return path;

    }
}
