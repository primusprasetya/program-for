/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkgfor;

/**
 *
 * @author PRIMUS
 */
public class ProgramFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
            if(i<10)
                System.out.println(i + "   x   8  =  " + (i*8));
            else
                System.out.println(i + "  x   8  =  " + (i*8));
            
    }
    
}
