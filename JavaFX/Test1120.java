import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;




public class Test1120  extends Application{
	 public static void main (String[] args){
	 launch( args);
	}
	@Override
	public void start( Stage stage ) throws Exception{
		Label hi = new Label("Hello,Javafx");
		Label hello =new Label("ズンです !");
		Label hii = new  Label("IG12");
		BorderPane pane = new BorderPane();
		pane.setTop(hi);
		pane.setCenter(hello);
		pane.setBottom(hii);
		Scene scene = new Scene(pane,300,200);
		stage.setScene(scene);
	stage.show();
  }
}
