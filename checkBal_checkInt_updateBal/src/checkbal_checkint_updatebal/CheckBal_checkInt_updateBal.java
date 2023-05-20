/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkbal_checkint_updatebal;

/**
 *
 * @author Le Bronn
 */
public class CheckBal_checkInt_updateBal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckBalance checkBal = new CheckBalance();
        CheckInterest checkInt = new CheckInterest();
        UpdateBalance updateBal = new UpdateBalance();
        
        checkBal.show();
        checkBal.setLocationRelativeTo(null);
        checkInt.setLocationRelativeTo(null);
        updateBal.setLocationRelativeTo(null);
    }
    
}
