import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

public class TestBall2 extends Application{
	private BreakoutThread breakoutthread;
	public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage stage){
		stage.setTitle("Aloha");
		Pane pane = new Pane();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		Canvas canvas = new Canvas(640,480);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		pane.getChildren().add(canvas);
		breakoutthread = new BreakoutThread(gc);
		breakoutthread.start();
		stage.show();
	
	}
}
class BreakoutThread extends AnimationTimer{
	private GraphicsContext gc;
	private Ball ball;
	public BreakoutThread(GraphicsContext gc){
		this.gc =gc;
		ball =new Ball();
	}
	@Override
	public void handle(long time){
		
		gc.clearRect(0,0,640,480);
		ball.draw(gc);
		ball.move();
	}
}
class Ball{
	private int x;
	private int y;
	private int x_speed;
	private int y_speed;
	private int size;

	public Ball(){
		this.x =0;
		this.y =0;
		this.x_speed=5;
		this.y_speed=5;
		this.size=20;
	}
	public void draw(GraphicsContext gc){
		gc.setFill(Color.RED);
		gc.fillOval(x,y,size,size);
	}
	public void move(){
		x +=x_speed;
		y +=y_speed;

		if(x>640-size){
			x_speed*=-1;
		}
		if(y<0){
			y_speed*=-1;
		}
		if(x<0){
			x_speed*=-1;
		}
		if(y>480-size){
			y_speed*=-1;
		}

	} 
}