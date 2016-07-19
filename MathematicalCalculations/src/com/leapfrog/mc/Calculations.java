/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mc;

import com.leapfrog.mc.SideClasses.Main;
import com.leapfrog.mc.SideClasses.MathFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.print("Enter The Location Of the File :");
        String fileName = input.next();
        

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line = "";
                StringBuilder content=new StringBuilder();

                while ((line = reader.readLine()) != null)  {
                    String[] token=line.split(",");
                    if(token.length>=3){
                    double x=Double.parseDouble(token[0]);
                    String Key=token[1];
                    double y=Double.parseDouble(token[2]);
                    
                        Main cmd=MathFactory.get(Key);
                        if(cmd!=null){
                            double solution=cmd.calculate(x, y);
                        System.out.println(solution);
                        content.append(x + Key + y + "="+ solution + "\r\n");
                    }
                        else{
                            System.out.println("The Command is Invalid.");
                        }
                    
                            }
                }
                reader.close();
                
                System.out.print("Enter a file and its Location name for Solution:");
                fileName=input.next();
                
                FileWriter writer=new FileWriter(fileName);
                writer.write(content.toString());
                writer.close();
                
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }

           System.out.println("DO you want to Continue?[Y/N]");

            String ch = input.next();

            if (ch.equalsIgnoreCase("n")) {
                System.out.println("Good Bye");
                System.exit(0);
                break;

            }

        }

    }
}
