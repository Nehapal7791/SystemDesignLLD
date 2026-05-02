package Basics.CreationPattern.PrototypePattern.Solution;

public interface Prototype<T> {
    T clone() throws CloneNotSupportedException;
}
