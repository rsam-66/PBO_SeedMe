/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seedme;

/**
 *
 * @author Bagus Baradwaja
 */
public class HomePage extends SignIn {
    public HomePage(String username, String password) {
        super(username, password);
    }

    public void displayHomePage() {
        System.out.println("Welcome, " + username + "!");
        System.out.println("Ini adalah halaman utama.");
    }
}
