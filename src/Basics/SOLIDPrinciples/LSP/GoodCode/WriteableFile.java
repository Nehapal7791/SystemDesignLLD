package Basics.SOLIDPrinciples.LSP.GoodCode;

public class WriteableFile extends ReadableFile implements Writeable{
    @Override
    public void write() {
        System.out.println("Performing write operation in writeableFile...");
    }
}
