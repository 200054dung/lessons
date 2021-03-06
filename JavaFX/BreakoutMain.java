import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;


public class BreakoutMain extends Application{
	private BreakoutThread breakoutthread;

	public static void main (String[] args){
		launch( args);
	}
	@Override
	public void start (Stage stage) {
		stage.setTitle("BREAKOUT");
		Pane pane =new Pane();
		Scene scene=new Scene(pane);
		stage.setScene(scene);
		Canvas canvas = new Canvas(640,480);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		pane.getChildren().add(canvas);
		breakoutthread = new  BreakoutThread(gc);
		breakoutthread.start();
		stage.show();
	}
}
class BreakoutThread extends AnimationTimer{
	private GraphicsContext gc;
	private int count;
	private int ball_x;
	private int ball_y;
	private int x_speed;
	private int y_speed;
	BreakoutThread(GraphicsContext gc){
		this.gc=gc;
		count =0;
		ball_x=0;
		ball_y=0;
		x_speed=1;
		y_speed=1;

	}
	@Override
	public void handle (long time){
		gc.clearRect(0,0,640,480);
		gc.setFill(Color.BLACK);
		gc.fillOval(ball_x-5,ball_y-5,10,10);
		ball_x +=x_speed;
		ball_y +=y_speed;
		gc.fillText("count =" +count,450,450);
		gc.fillText("Time= "+time,450,500);
		count++;
	}
}