package Basics.SOLIDPrinciples.ISP.GoodCode;

import Basics.SOLIDPrinciples.ISP.BadCode.Document;

public class SimplePrinter implements printer {

    @Override
    public void print(Document doc) {
        System.out.println("Printing...");
    }
}
