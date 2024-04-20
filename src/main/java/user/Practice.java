/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package user;


/**
 *
 * @author mello
 */
public class Practice {

    public static void main(String[] args)  {
    Buyer b=new Buyer("saad", "123", "123", 15);
      try {
          b.verifyAge();
      } catch (Exception e) {
        e.getMessage();
      }
    }
}
