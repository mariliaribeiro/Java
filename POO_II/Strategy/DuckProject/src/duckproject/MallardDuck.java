/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duckproject;

/**
 *
 * @author joice
 */
public class MallardDuck extends Duck {
    
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
public void display(){
    System.out.println("I'm a real Mallard duc");
}
    
}
