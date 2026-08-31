package com.lab.app;

import com.lab.core.Greeter;

public class Main {
public static void main (String[] args){

    Greeter g = new Greeter();
    g.Greet("Keshav");

    /** as  Greet is a static  function we need not to make object and call it we can directly call it
     through class  Because static methods belong to the class itself rather than to any specific object instance, you
     do not need to instantiate the class (create an object) to use them*/
    Greeter.Greet("Shrishty");

}
}
