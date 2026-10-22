/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btt2;
import java.util.Scanner;
/**
 *
 * @author Phạm Bá Cường
 */
public class BTT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên của bạn: ");
        String name = scanner.nextLine();

        System.out.println("Xin chào, họ và tên của tôi là: " + name);
        scanner.close();
    }
    
}
