package Basics.StructuralDesignPattern.CompositePattern.Solution;

public class FileSystemApp {
    static void main() {
        FileSystemComponent file1 = new File("file1");
        FileSystemComponent file2 = new File("file2");
        Folder folder = new Folder("Document");
        folder.addComponents(file1);
        folder.addComponents(file2);

        //Subfolder
        Folder subfolder = new Folder("Subfolder");
        FileSystemComponent file3 = new File("File3.txt");

        subfolder.addComponents(file3);
        folder.addComponents(subfolder);

        folder.showDetails();
    }
}
