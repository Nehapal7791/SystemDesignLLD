package Basics.SOLIDPrinciples.ISP.GoodCode;

import Basics.SOLIDPrinciples.ISP.BadCode.Document;

public class MultipurposeMachine implements printer,Scanner,Copier{

    @Override
    public void copy(Document doc) {
        System.out.println("copying...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning...");
    }

    @Override
    public void print(Document doc) {
        System.out.println("Printing....");
    }
}
