/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duckproject;

/**
 *
 * @author joice
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
    
}

public abstract void display();

    /**
     *
     */
    public void performFly(){
    flyBehavior.fly();
}

public void performQuack(){
    quackBehavior.quack();
}

public void swim() {
   System.out.println("All ducks float, even decoys!");
}
}