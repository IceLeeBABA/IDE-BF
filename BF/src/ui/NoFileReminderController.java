package ui;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class NoFileReminderController {

private Stage stage;

	public void setStage(Stage s){
		stage = s;
	}

	@FXML
	private void clickonOK(){
		stage.close();
	}
}
