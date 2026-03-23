package Basics.SOLIDPrinciples.LSP.GoodCode;

public class ReadableFile implements Readable{

    @Override
    public void read() {
        System.out.println("Performing Read in readable class...");
    }
}
