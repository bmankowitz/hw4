package hw3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import minijava.parser.*;
import minijava.syntaxtree.*;

public class Typecheck {
    public static void main(String[] args) {
        try {
            InputStream in = System.in;
            if (args.length > 0) in = new FileInputStream(args[0]);
            in = new FileInputStream("testPrograms/Factorial.java");
            //TODO: OBJECTS!
            //TODO BinaryTree, LinkedList, TreeVisitor

	        MiniJavaParser parser = new MiniJavaParser(in);
		    Goal root = parser.Goal();
		    System.out.println("Parsed successfully");
		    TreeBuildingVisitor firstPass = new TreeBuildingVisitor();
		    root.accept(firstPass);
		    firstPass.printVars();
		    TreeCheckingVisitor secondPass = new TreeCheckingVisitor(firstPass.vars);
		    root.accept(secondPass);
		    System.out.println("Program ok");
        }
        catch (ParseException pe) {
            System.out.println("Parse error: " + pe.getMessage());
        }
        catch (TypeError te) {
            System.out.println("Type error: " + te.getMessage());
        }
        catch (FileNotFoundException e) {
            System.out.println("IO error: " + e.getMessage());
        }

    }

}
