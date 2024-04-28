package user;

import java.io.Serializable;

public class User implements Serializable {
  private String username;
  private String password;

  // Constructor
  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // Getters
  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  // Setters
  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  // Methods
  public boolean authenticate(String inputUsername, String inputPassword) {
    if (username.equals(inputUsername) && password.equals(inputPassword)) {
      System.out.println("User authenticated.");
      return true;
    } else {
      System.out.println("User not found.");
      return false;
    }
  }

  public void changePass(String newPassword) {
    this.password = newPassword;
    System.out.println("Password changed to: " + newPassword);
  }

  public void resetPass() {
    this.password = "default_password";
    System.out.println("Password reset to: " + "default_password");
  }
}
