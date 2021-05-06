package hw3;

import minijava.syntaxtree.Identifier;
import minijava.syntaxtree.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Var {
    public Identifier identifier; //the name
    public Type type; //either the var type or the method return type
    public ArrayList<Var> parameters;
    public LinkedList<String> objectLocationAlias;


    public Var(Identifier identifier, Type type){
        this.identifier = identifier;
        this.type = type;
        if(type.f0.choice instanceof Identifier){
            objectLocationAlias = new LinkedList<>(Collections.singletonList(((Identifier) type.f0.choice).f0.tokenImage));
        }
    }

    public Var(Identifier identifier, Type type, ArrayList<Var> parameters){
        this.identifier = identifier;
        this.type = type;
        this.parameters = new ArrayList<>(parameters);
        if(type.f0.choice instanceof Identifier){
            objectLocationAlias = new LinkedList<>(Collections.singletonList(((Identifier) type.f0.choice).f0.tokenImage));
        }
    }

    @Override
    public String toString() {
        if(parameters == null)
            return "Var{" +
                    "identifier=" + identifier.f0.toString() +
                    ", type=" + type.f0.choice.toString() +
                    "}";
        else return "Method{" +
                "identifier=" + identifier.f0.toString() +
                ", type=" + type.f0.choice.toString() +
                ", parameter= <\t" + parameters.toString() +
                ">}";
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Var)
            return this.toString().equals(obj.toString());
        else return false;
    }
}
