import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
public class Test1127 extends Application{
	public static void main(String []args){
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception{
		Label rasengan =new Label("naruto");
		 BorderPane pane = new  BorderPane();
		 pane.setCenter(rasengan);
		Scene scene = new Scene(pane,300,200);
		stage.setScene(scene);
		stage.show();

	}
}