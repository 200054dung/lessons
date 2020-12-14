import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
public class TestFX extends Application{
	 public static void main(String[] args) {
		launch(args);
	}

@Override
public void start( Stage stage ) throws Exception {
     Label lable = new  Label("HAHAHA");
     BorderPane pane = new  BorderPane();
     pane.setCenter(lable);
     Scene scene = new Scene(pane,320,240);
     stage.setScene(scene);
     stage.show();
 }
}