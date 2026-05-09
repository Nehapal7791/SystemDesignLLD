package Basics.StructuralDesignPattern.CompositePattern.Solution;

import Basics.StructuralDesignPattern.CompositePattern.Problem.File;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    Folder(String name){
        this.name=name;
    }
    private List<Basics.StructuralDesignPattern.CompositePattern.Problem.File> files= new ArrayList<>();
    public void addFile(File file){
        files.add(file);
    }
    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for(File file:files){
            file.showDetails();
        }
    }
}
