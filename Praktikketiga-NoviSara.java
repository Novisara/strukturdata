/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostackpopstring;
import java.util.*;
/**
 *
 * @author Novi
 */
public class Demostackpopstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creating an empty Stack
Stack<String> STACK = new Stack<String>();
STACK.push("Minggu");
STACK.push("Senin");
STACK.push("Selasa");
STACK.push("Rabu");
STACK.push("Kamis");
// Displaying the Stack
System.out.println("Stack Awal: " + STACK);
// Removing elements using pop() method
System.out.println("Pop Element: " +
STACK.pop());
System.out.println("Pop Element: " +
STACK.pop());
// Displaying the Stack after pop operation
System.out.println("Update Stack "
+ STACK);
}
}
    