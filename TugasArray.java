/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarray;

import java.util.Scanner;

/**
 *
 * @author PRIMUS
 */
public class TugasArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[100];
        int max = -999;
        int min = 999;
        int a = 0;
        do{
            System.out.print("Masukan Data : ");
            x[a] = scanner.nextInt();
            if(x[a] != -1){
                if(x[a] > max)
                    max = x[a];
                if(x[a] < min)
                    min = x[a];
                a++;
            }
        }while(x[a] != -1);
        System.out.println("");
        System.out.println("Nilai Minimal Adalah : " + min);
        System.out.println("Nilai Maksimal Adalah : " + max);
    }
    
}
