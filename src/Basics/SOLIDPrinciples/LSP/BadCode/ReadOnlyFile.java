package Basics.SOLIDPrinciples.LSP.BadCode;

public class ReadOnlyFile extends File{
    @Override
    public void write() {
        throw new UnsupportedOperationException("Can't write to read only file");
    }
}
