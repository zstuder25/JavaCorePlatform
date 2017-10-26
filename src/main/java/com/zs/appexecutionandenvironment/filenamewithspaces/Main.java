package com.zs.appexecutionandenvironment.filenamewithspaces;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    //main method for playing with arguments
    public static void main(String[] args) {
        if(args.length == 0){
            showUsage();
            return;
        }
        //If a file has spaces in it, simply quote the file
        String fileName = args[0];
        if(!Files.exists(Paths.get(fileName))){
            System.out.println("\n File not found: " + fileName);
            return;
        }
        showFileLines(fileName);
    }

    private static void showFileLines(String fileName){
        System.out.println();

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))){
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception ex){
            System.out.println(ex.getClass().getSimpleName() + " - " + ex.getMessage());
        }
    }

    private static void showUsage(){
        System.out.println();
        System.out.println("Please provide the filename to the process command line");
    }
}
