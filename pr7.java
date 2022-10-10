/*
Write a method public static int readInFile(String line, File file) that returns the
position number of a line in the file filename or −1 if there is no such line or file.
Assume that this file contains names of people with a name per line. Names (and
hence lines) are listed in ascending alphabetical order in the file. We can not find the
same line twice.
name:kaumil patni
ID:21ce108
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class pr7 {
    File readInFile = new File("javap.txt");

    int readFileme(String line, File file) {
        if (readInFile.exists()) {
            return line.length();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        String str = "File Handling in Java using " +
                " FileWriter and FileReader";

        // attach a file to FileWriter
        FileWriter writeInFile = new FileWriter("javap.txt");
        
        for (int i = 0; i < str.length(); i++)
            writeInFile.write(str.charAt(i));

        System.out.println("Writing successful");
        // close the file
        writeInFile.close();

        // reader
        int ch;
        // check if File exists or not
        FileReader readInFile = new FileReader("javap.txt");
        System.out.println("File created SucessFully");
        
        System.out.println("File is found");
        // read from FileReader till the end of file
        while ((ch = readInFile.read()) != -1)
            System.out.print((char) ch);

        // close the file
        readInFile.close();
    }
}
