package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private Button buttonEnter;
    @FXML
    private Button buttonClear;

    @FXML
    private TextField txtLogin;
    @FXML
    private TextField txtPass;

    @FXML
    private Label labelText;
    @FXML
    private Label labelLogin;
    @FXML
    private Label labelPass;

    @FXML
    private void Clear(ActionEvent eventOne) {
        txtLogin.setText("");
        txtPass.setText("");
    }

    @FXML
    private void Enter(ActionEvent eventTwo) {
        if(txtLogin.getText().equals("admin") && txtPass.getText().equals("pass")){
            labelText.setText("Hello Admin!");
        }else{
            labelText.setText("Ошибка авторизации");
        }
    }
}
