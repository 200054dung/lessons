import javafx.animation.Animation;
  import javafx.animation.TranslateTransition;
  import javafx.util.Duration;
  import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.shape.Rectangle;
  import javafx.scene.shape.Circle;
  import javafx.scene.paint.Color;
  import javafx.animation.ScaleTransition;

  public class Animation1 extends Application{

  	public static void main(String[] args) {
  		launch(args);
  	}

  	@Override
  	public void start(Stage primaryStage) {
  		View v = new View();
  		Scene scene = new Scene(v, 400, 400);
  		primaryStage.setScene(scene);
  		primaryStage.show();
  	}
  }


  class View extends Group{
  	public View() {
  		Rectangle rect = new Rectangle(0,0,50,50);
      rect.setFill(Color.GREEN);
      Circle circle= new Circle(0,0,20);
      circle.setFill(Color.RED);
  		TranslateTransition animation = new TranslateTransition(Duration.seconds(2), rect);
      TranslateTransition animation1 = new TranslateTransition(Duration.seconds(2), circle);
  		animation.setFromX(0);
  		animation.setFromY(0);
  		animation.setToX(350);
  		animation.setToY(250);

      animation1.setFromX(350);
      animation1.setFromY(250);
      animation1.setToX(1);
      animation1.setToY(1);

  		animation.setCycleCount( Animation.INDEFINITE );
  		animation.setCycleCount(100);
      animation.setAutoReverse(true);
  		animation.play();
      animation.setCycleCount( Animation.INDEFINITE );   
      animation1.setCycleCount(100);
      animation1.setAutoReverse(true);
      animation1.play();
      ScaleTransition animation3 = new ScaleTransition( Duration.seconds( 2), rect );
      animation3.setFromX( 1 );
      animation3.setFromY( 1 );
      animation3.setToX( 2 );
      animation3.setToY( 2 );

      ScaleTransition animation4= new ScaleTransition( Duration.seconds( 2), circle );
      animation4.setFromX( 1 );
      animation4.setFromY( 1 );
      animation4.setToX( 2);
      animation4.setToY( 2);


      // cyclecount
      animation3.setCycleCount( Animation.INDEFINITE );
       animation4.setCycleCount( Animation.INDEFINITE );
      // play, add
      animation3.play();
      animation4.play();

  		getChildren().add(rect);
      getChildren().add(circle);
  	}
  }