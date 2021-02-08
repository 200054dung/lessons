import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Test0122 extends Application {        
	public static void main ( String[] args ) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception{
		Group root =new Group();
		Scene scene =new Scene(root,500,400);

		Circle circle= new Circle(200,200,80);
		circle.setFill(Color.RED);
		root.getChildren().add(circle);
		stage.setScene(scene);
		stage.show();
	}
}