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
    public static void main(String[] args) {
        try {
            InputStream in = System.in;
            if (args.length > 0) in = new FileInputStream(args[0]);
            //in = new FileInputStream("testPrograms/Factorial.java");
            in = new FileInputStream("testPrograms/MoreThan4.java");
            //in = new FileInputStream("testPrograms/BinaryTree.java");


            MiniJavaParser parser = new MiniJavaParser(in);
            //PigletParser pigletParser = new PigletParser(in);
            //piglet.syntaxtree.Goal pigletGoal = pigletParser.Goal();


            Goal root = parser.Goal();
            System.out.println("Parsed successfully");
            TreeBuildingVisitor firstPass = new TreeBuildingVisitor();
            root.accept(firstPass);
            firstPass.printVars();
            TreeCheckingVisitor secondPass = new TreeCheckingVisitor(firstPass.vars);
            root.accept(secondPass);
            //create IR
            //first get list of vars:
            ArrayList<Var> vars = new ArrayList<>();
            firstPass.vars.values().forEach(vars::addAll);
            PigletCreationVisitor piglet = new PigletCreationVisitor(new ArrayList<Var>(vars), firstPass.vars);
            root.accept(piglet);
            //Run the program through the Piglet Interpreter:

            try {
                System.out.println("RESULTS:::");
                Process proc = Runtime.getRuntime().exec(
                        "java -jar \"Piglet-documentatino/Piglet Interpreter/pgi.jar\" < \"Piglet-documentatino/Piglet Programs/Factorial.pg \"");
                //proc.waitFor();
                // Then retreive the process output
                InputStream in2 = proc.getInputStream();
                InputStream err = proc.getErrorStream();

                byte b[] = new byte[in2.available()];
                in2.read(b, 0, b.length);
                System.out.println(new String(b));

                byte c[] = new byte[err.available()];
                err.read(c, 0, c.length);
                System.out.println(new String(c));
            } catch (Exception e) { e.printStackTrace();};
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
