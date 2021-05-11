package hw4;

import hw3.TreeBuildingVisitor;
import hw3.TreeCheckingVisitor;
import hw3.TypeError;
import hw3.Var;
import minijava.parser.MiniJavaParser;
import minijava.parser.ParseException;
import minijava.syntaxtree.Goal;
import minijava.visitor.Visitor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import piglet.parser.PigletParser;
import piglet.syntaxtree.*;

public class Driver {
    public static final boolean debug = false;
    public static void main(String[] args) {
        try {
            InputStream in = System.in;
            if (args.length > 0) in = new FileInputStream(args[0]);
            int toTest = 6;
            if(toTest == 0) in = new FileInputStream("testPrograms/BinaryTree.java");
            else if (toTest ==1 )in = new FileInputStream("testPrograms/BubbleSort.java");
            else if (toTest ==2 )in = new FileInputStream("testPrograms/Factorial.java");
            else if (toTest ==3 )in = new FileInputStream("testPrograms/LinearSearch.java");
            else if (toTest ==4 )in = new FileInputStream("testPrograms/LinkedList.java");
            else if (toTest ==5 )in = new FileInputStream("testPrograms/MoreThan4.java");
            else if (toTest ==6 )in = new FileInputStream("testPrograms/QuickSort.java");
            else if (toTest ==7 )in = new FileInputStream("testPrograms/TreeVisitor.java");
            else { /* Use standard in*/};


            MiniJavaParser parser = new MiniJavaParser(in);
            Goal root = parser.Goal();
            if(debug) System.out.println("Parsed successfully");
            TreeBuildingVisitor firstPass = new TreeBuildingVisitor();
            root.accept(firstPass);
            if(debug) firstPass.printVars();
            TreeCheckingVisitor secondPass = new TreeCheckingVisitor(firstPass.vars);
            root.accept(secondPass);
            //create IR
            //first get list of vars:
            ArrayList<Var> vars = new ArrayList<>();
            firstPass.vars.values().forEach(vars::addAll);
            PigletCreationVisitor piglet = new PigletCreationVisitor(new ArrayList<Var>(vars), firstPass.vars);
            root.accept(piglet);
        }
        catch (ParseException pe) {
            System.out.println("Parse error: " + pe.getMessage());
        }
        catch (TypeError te) {
            System.out.println("Type error: " + te.getMessage());
        }
        catch (FileNotFoundException e) {
            System.out.println("IO error: " + e.getMessage());
        } /* catch (piglet.parser.ParseException e) {
            e.printStackTrace();
        } */
    }
}
