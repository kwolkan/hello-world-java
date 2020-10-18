package com.kwolk.docker_git_hello_world;

/**
 * Hello world!
 *
 */
public class HelloWorldPing 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	for(int i = 0 ; i < 100; i++){
			System.out.println("New version of Hello World Ping " + i );
			Thread.sleep(1000);
		}

    }
}
