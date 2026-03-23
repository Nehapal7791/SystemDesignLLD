package Basics.SOLIDPrinciples.ISP.BadCode;

public class SimpleMachine implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("printing...");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan not supported in simple machine... ");
    }

    //not required function need a implementation where functionality is not in simple machine voilation of ISP
    @Override
    public void copy(Document doc ) {
        throw new UnsupportedOperationException("Copy not supported in simple machine... ");
    }
}
