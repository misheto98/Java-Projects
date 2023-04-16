import javax.swing.JOptionPane;

public class SaveData {

    public static void SaveToDB(){
        try{
            if((new String(RegisterForm.passwordField.getPassword()).equals(new String(RegisterForm.confirmPasswordField.getPassword())))) {
                RegisterForm.insertData("INSERT INTO Users(FirstName, SecondName, LastName, Address, PhoneNum, Email, Password) " +
                        "VALUES ('" + RegisterForm.firstNameTextField.getText() + "'," +
                        " '" + RegisterForm.secondNameTextField.getText() + "'," +
                        " '" + RegisterForm.lastNameTextField.getText() + "'," +
                        " '" + RegisterForm.addressTextField.getText() + "'," +
                        " '" + RegisterForm.phoneTextField.getText() + "'," +
                        " '" + RegisterForm.emailTextField.getText() + "'," +
                        " '" + RegisterForm.passwordField.getText() + "')");

            }else{
                JOptionPane.showMessageDialog(null, "Passwords do not match!");
            }

        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }

}