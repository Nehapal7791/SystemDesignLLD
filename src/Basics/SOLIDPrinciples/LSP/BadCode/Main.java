package Basics.SOLIDPrinciples.LSP.BadCode;

public class Main {
    public static void main() {
        File file= new ReadOnlyFile();
        file.read();//works fine
        file.write();//throw exception which, which violation of lsp , method which is not supported why to write.

        //No client should be force to depend on method it doesn't use. Split Large Interfaces into smaller even more specific.
    }
}
