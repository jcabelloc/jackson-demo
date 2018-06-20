package edu.tamu.jcabelloc.jackson_demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Jackson Demo
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	ObjectMapper mapper = new ObjectMapper();
        	
        	Student myStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
        	
        	System.out.println("First Name: " + myStudent.getFirstName());
        	System.out.println("Last Name: " + myStudent.getLastName());
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
    	
    }
}
