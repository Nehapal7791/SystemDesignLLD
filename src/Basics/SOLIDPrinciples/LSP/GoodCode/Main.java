package Basics.SOLIDPrinciples.LSP.GoodCode;

public class Main {
    static void main(String[] args) {
        ReadableFile readableFile= new ReadableFile();
        readableFile.read();
        //readableFile.write(); == not supported
        WriteableFile writeableFile= new WriteableFile();
        writeableFile.write();
        writeableFile.read();
    }
}
