import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Test11272 extends Application{
 public static void main ( String[] args){
	launch(args);
}
@Override
public void start(Stage stage) throws Exception{
	Label left = new  Label("男の子");
	Label right = new  Label("女の子");
	Button button =new Button("変更");
	button.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent e){
		String data1 = left.getText();
		String data2 =	right.getText();
			 right.setText(data2);
			 left.setText(data1);
			String data = left.getText();
			left.setText( right.getText() );
			right.setText(data);
		}
	});
	BorderPane pane = new BorderPane();
	// pane.setTop(hello);
	// pane.setCenter(field);
	pane.setBottom(button);
	pane.setLeft(left);
	pane.setRight(right);
	Scene scene = new Scene(pane,400,300);
	stage.setScene(scene);
	stage.show();

}
}