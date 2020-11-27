/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119076.sulthonnaufalakmal;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal AKmal
 * Kelas  : IF2
 * NIM : 10119076
 */
public class QUIZIF210119076SULTHONNAUFALAKMAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new scanner (System.in);
        Customer customer = new Customer();
        System.out.println("=====Program Kasir Rock n Roll Haircut=====");
        System.out.print("Customer Name : ");
        customer.setName(input.nextLine());
        System.out.print("Customer Email : ");
        customer.setEmail(input.nextLine());
    }
    
}
