package com.company;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Junit {

    public static void main(String[] args) {

        // create object of Path
        Path path
                = Paths.get("D:/workspace/AmanCV.docx");

        // call getFileSystem()
        // and get FileSystem object
        FileSystem fs = path.getFileSystem();



        // print separator of FileSystem
        System.out.println("Separator used for FileSystem: "
                + fs.getSeparator() + fs.getPath("c:\\hey","hello"));
        ;
	// write your code here
    }


    public static double add(double n1, double n2){

        double sum;

        sum = n1 + n2;

        return sum ;



    }



    public double biggest(double n1, double n2){

        if(n1 > n2){
            return n1;
        }
        else {
            return n2;
        }

    }

}
