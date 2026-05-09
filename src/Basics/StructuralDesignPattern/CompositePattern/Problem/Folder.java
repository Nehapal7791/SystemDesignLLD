package Basics.StructuralDesignPattern.CompositePattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    Folder(String name){
        this.name=name;
    }
    private List<File> files= new ArrayList<>();
    public void addFile(File file){
        files.add(file);
    }
    public void showDetails(){
        System.out.println("Folder: " + name);
        for(File file:files){
            file.showDetails();
        }
    }
}
