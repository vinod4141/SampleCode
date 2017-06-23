package com.vinod.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
    	Thread t = new MyThread();
    		
    	t.start();
    	for (int i = 0; i < 5; i++)
            System.out.println ("i = " + i + ", i * i = " + i * i);

    }
}
