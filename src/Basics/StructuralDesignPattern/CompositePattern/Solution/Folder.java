package Basics.StructuralDesignPattern.CompositePattern.Solution;

import Basics.StructuralDesignPattern.CompositePattern.Problem.File;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    Folder(String name){
        this.name=name;
    }
    private List<FileSystemComponent> components= new ArrayList<>();
    public void addComponents(FileSystemComponent component){
        components.add(component);
    }
    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for(FileSystemComponent file:components){
            file.showDetails();
        }
    }
}
