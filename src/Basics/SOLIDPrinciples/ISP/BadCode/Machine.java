package Basics.SOLIDPrinciples.ISP.BadCode;


//ISP interface segregation principle
public interface Machine {
    public void print(Document doc);
    public void scan(Document doc);
    public void copy(Document doc);

}
