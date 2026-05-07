package Basics.StructuralDesignPattern.ProxyPattern.Solution;


public class Client {
    static void main() {
       Image img1 = new RealImage("dog.png");
        Image img2 = new RealImage("cat.png");
        //Here, the RealImage is loaded every time we create it,
        // which can be inefficient if the image is not always required.
        img1.display();
        img1.display();
    }
}