/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seedme;

/**
 *
 * @author Bagus Baradwaja
 */
public class SeedMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SignUp signUp = new SignUp("user123", "user123@example.com", "password123");
        signUp.signUp();

        SignIn signIn = new SignIn("user123", "password123");
        signIn.signIn();

        HomePage homePage = new HomePage("user123", "password123");
        homePage.displayHomePage();

    }
}
