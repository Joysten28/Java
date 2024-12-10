/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
package pkg2;
class DivByZeroException extends Exception{
    public DivByZeroException(String message){
        super(message);
        
    }
}
public class LAB9 {
    public static void main(String[] args){
        System.out.println("Exception");
        int nr=10;
        int dr=0;
        int result;
        try {
            if(dr==0) {
                throw new DivByZeroException("division by zero not allowed");
            }
            result=nr/dr;
            System.out.println(result);
        }
        catch(DivByZeroException e1){
            System.out.println("Error"+ " "+e1.getMessage());
        }
        catch(ArithmeticException e2){
            System.out.println(e2.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
    
}