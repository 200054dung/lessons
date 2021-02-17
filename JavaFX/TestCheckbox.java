import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
 public class TestCheckbox extends Application{
 	public static void main(String[]args){
 		launch(args);
 	}
 	@Override
 	public void start(Stage stage)throws Exception{
 		CheckBox check = new CheckBox("checkbox");

 		check.setOnAction(new EventHandler<ActionEvent>(){
 			@Override
 			public void handle(ActionEvent e){
 				System.out.println("選択");
 			
 			if(check.isSelected()){
 				System.out.println("選択");
 			}else{
 			 System.out.println("選択しない");
           }
 			}
 		});
 		BorderPane pane = new BorderPane();
 		pane.setCenter(check);
 		Scene scene = new Scene(pane,400,300);
 		stage.setScene(scene);
 		stage.show();
 	}
 }