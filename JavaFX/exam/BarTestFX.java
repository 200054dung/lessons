import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;

public class BarTestFX extends Application{
	private BreakoutThread breakoutthread;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start (Stage stage){
		Key key =new Key();//キーボード
		stage.setTitle("Ball Test");
		Pane pane = new Pane();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		// set OnKeyPressed();
		scene.setOnKeyPressed(
			new EventHandler<KeyEvent>(){
				public void handle(KeyEvent e){
					key.keyPressed(e);
				}
			}
			);
		scene.setOnKeyReleased(
			new EventHandler<KeyEvent>(){
				public void handle(KeyEvent e){
					key.keyReleased(e);
				}
			}
			);

		Canvas canvas=new Canvas(640,480);
		GraphicsContext gc =canvas.getGraphicsContext2D();
		pane.getChildren().add(canvas);
		breakoutthread = new BreakoutThread(gc,key);
		breakoutthread.start();
		stage.show();
	}
}
class BreakoutThread extends AnimationTimer{
	//data
	private GraphicsContext gc;
	private Ball ball;
	private Bar bar;
	//method
	public BreakoutThread(GraphicsContext gc, Key key){
		this.gc =gc;
		ball=new Ball();
		bar = new Bar(key);

	}
	@Override
	public void handle(long time){
		gc.clearRect(0,0,640,480);
		//表示する
		ball.move();
		ball.draw(gc);
		bar.move();
		bar.draw(gc);
	}
}
class Ball{
	//data
	private int x;
	private int y;
	private int x_speed;
	private int y_speed;
	
	//method
	public Ball(){
		this.x=20;
		this.y=20;
		this.x_speed=5;
		this.y_speed=5;
	}
	public void move(){//ball の場所を計算する
		this.x+=this.x_speed;
		this.y+=this.y_speed;
	}
	public void draw(GraphicsContext gc ){
		gc.setFill(Color.BLUE);
		gc.fillOval(x,y,20,20);//ballを書く
	}
}
class Key{
	private boolean right;
	private boolean left;
	public Key(){
		this.right=false;
		this.left=false;
	}
	public void keyPressed(KeyEvent e){
		switch(e.getCode()){
			case LEFT:
			left=true;
			break;
			case RIGHT:
			right=true;
			break;
			default:
			break;
		}
	}
	public void keyReleased(KeyEvent e){
		switch(e.getCode()){
			case LEFT:
			left =false;
			break;
			case RIGHT:
			right=false;
			break;
			default:
			break;
		}
	}
	public boolean isRightPressed(){
		return right;
	}
	public boolean isLeftPressed(){
		return left;
	}
}
class Bar{
	private int x;
	private int y;
	private int width;
	private int height;
	private Key key;
	private int x_speed;

	public Bar(Key key){
		this.x=180;
		this.y =480;
		this.width=40;
		this.height=5;
		this.key=key;
		this.x_speed=5;
	}
	public void draw (GraphicsContext gc){
		gc.setFill(Color.RED);//色を決める
		gc.fillRect(x,y,width,height);//書く
	}
	public void move(){
		if(key.isRightPressed()==true){
			x+=x_speed;
		}
		if(key.isLeftPressed()==true){
			x-=x_speed;
	}
}
}
