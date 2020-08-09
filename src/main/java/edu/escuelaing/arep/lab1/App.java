package edu.escuelaing.arep.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class that reads from a txt file and calculates mean and standard deviation
 * @author Carlos Gomez
 */
public class App {
    /**
     * Main methot that reads a txt file and calculates mean and standard deviation
     * @param args Args
     */
    public static void main( String[] args ) {
        try {
            File myObj = new File("number.txt");
            Scanner myReader = new Scanner(myObj);
            List lista= new List();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lista.addNode(Integer.parseInt(data));
            }
            myReader.close();
            System.out.println("The mean is " + mean(lista));
            System.out.println("The standard deviation is " + deviation(lista));

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Calculate the mean of a set of numbers
     * @param list Linked list that contains the set of numbers
     * @return mean's value
     */
    public static double mean(List list){
        Node head= list.getHead();
        Node node= head.getPriorN();
        double sum=0;
        int count= 0;
        if(node == null){
            return 0;
        }else{
            while(node!= null){
                sum+= node.getNumber();
                node= list.nextNode(node);
                count+=1;
            }
            return sum/count;
        }
    }

    /**
     * Calculate the standard deviation of a set of numbers
     * @param list Linked list that contains the set of numbers
     * @return The standard deviation's value
     */
    public static double deviation(List list){
        Node node= list.getHead().getPriorN();
        double sum=0;
        int count= 0;
        if(node == null){
            return 0;
        }else{
            double mean= mean(list);
            while(node!= null){
                sum+= Math.pow((node.getNumber() - mean),2);
                node= list.nextNode(node);
                count+=1;
            }
            return Math.sqrt((sum/(count-1)));
        }
    }

}
