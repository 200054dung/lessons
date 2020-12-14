import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Test1211 extends Application{
	public static void main (String []args){
		launch(args);
	}
		@Override
		 public void start( Stage stage ) throws Exception {
			Group root = new  Group();
			Scene scene = new Scene(root,350,350);
			Rectangle rect01 = new Rectangle(150,150,10,10);
			rect01.setFill(Color.RED);
			Circle circle = new Circle(222,222,20);
            circle.setFill(Color.BLUE);
			root.getChildren().add(rect01);
			root.getChildren().add(circle);

			// ParallelCamera cam = new  ParallelCamera();
   //          scene.setCamera(cam);

            stage.setScene(scene);
            stage.show();
		}
	}
