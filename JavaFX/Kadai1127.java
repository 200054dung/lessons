import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class Kadai1127 extends Application{
	public static void main (String[]args){
		launch(args);
	}
	@Override
	public void start (Stage stage) throws Exception{
		Label msg = new Label("hello,javaFX");
		Label name = new  Label("dung");
		Label classCode =new Label("IG12");
		BorderPane pane = new BorderPane();
		pane.setTop(msg);
		pane.setCenter(name);
		pane.setBottom(classCode);
		Scene scene = new Scene (pane,400,300);
		stage.setScene(scene);
		stage.show();

	}
}