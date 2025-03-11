package Filehendling;

import java.io.File;
import java.io.IOException;

// This class will create a new file in the specified directory
public class CreateaFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("myfile1.text");
            if (myFile.createNewFile()) {
                System.out.println("File created Scussefully: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while creating    ");
            e.printStackTrace();
            // TODO: handle exception
        }

    }

}
