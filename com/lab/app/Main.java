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

    /**
     * PACKAGE COMPILE & RUN NOTES:
     *
     * javac -d out com/lab/core/Greeter.java com/lab/app/Main.java
     * -> "-d out" tells the compiler WHERE TO PUT the compiled .class files.
     *    Instead of dumping them next to the .java source, it builds a clean
     *    "out/" folder and recreates the package structure inside it
     *    (out/com/lab/core/Greeter.class, out/com/lab/app/Main.class).
     *    This keeps source code and compiled output separate.
     *
     * java -cp out com.lab.app.Main
     * -> "-cp out" tells the JVM WHERE TO LOOK for compiled classes when running.
     *    It treats "out" as the root folder and walks the package path
     *    (com.lab.app.Main -> out/com/lab/app/Main.class) to find and run it.
     *
     * Rule of thumb: -d is used at COMPILE time (where output goes),
     *                -cp is used at RUN time (where to search for classes).
     * Package name must always match folder path exactly (com.lab.app = com/lab/app/).
     */








}
}
