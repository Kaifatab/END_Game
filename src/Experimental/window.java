
package Experimental;

import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;


public class window<ae> {

    private ArrayList<ImageView> stoneList, block, obstacle, life;
    public ImageView Thor, Time, Hulk, Hero;
    public ImageView Thanos, Ultron, Loki;
    boolean goUp, goDown, goRight, goLeft;
    public Rectangle2D r, r1;
    private AnchorPane pane;
    private Stage stage;
    private final Text t1;
    private final Text t2;
    private int s = 0;
    public ImageView Block13;
    public double currX, currY;
    private static int j = 0,m=0;
    private static Assets assets;
    private static ArrayList<ImageView> enemy;


    window() {


        assets = new Assets();
        enemy = new ArrayList<>();
        stoneList = new ArrayList<>();
        block = new ArrayList<>();
        obstacle = new ArrayList<>();
        life = new ArrayList<>();


        //MOVEMENT OF OBSTACLE 1\\
        Image o1 = new Image("/pics/Tressaract.jpg");
        ImageView Obs1 = new ImageView(o1);
        obstacle.add(Obs1);
        Obs1.setFitHeight(22);
        Obs1.setFitWidth(22);
        Obs1.setX(33);
        Obs1.setY(23);

        Path pathB1 = new Path();
        pathB1.getElements().add(new MoveTo(33, 23));
        pathB1.getElements().add(new VLineTo(709));

        PathTransition forB1 = new PathTransition(Duration.seconds(1.5), pathB1, Obs1);
        forB1.setCycleCount(PathTransition.INDEFINITE);
        forB1.setAutoReverse(true);
        forB1.play();


        //MOVEMENT OF OBSTACLE 2\\
        Image o2 = new Image("/pics/Tressaract.jpg");
        ImageView Obs2 = new ImageView(o2);
        obstacle.add(Obs2);
        Obs2.setFitHeight(22);
        Obs2.setFitWidth(22);
        Obs2.setX(33);
        Obs2.setY(23);

        Path pathB2 = new Path();
        pathB2.getElements().add(new MoveTo(529, 111));
        pathB2.getElements().add(new VLineTo(650));

        PathTransition forB2 = new PathTransition(Duration.seconds(2), pathB2, Obs2);
        forB2.setCycleCount(PathTransition.INDEFINITE);
        forB2.setAutoReverse(true);
        forB2.play();


        //MOVEMENT OF OBSTACLE 3\\
        Image o3 = new Image("/pics/Tressaract.jpg");
        ImageView Obs3 = new ImageView(o3);
        obstacle.add(Obs3);
        Obs3.setFitHeight(22);
        Obs3.setFitWidth(22);
        Obs3.setX(33);
        Obs3.setY(23);

        Path pathB3 = new Path();
        pathB3.getElements().add(new MoveTo(770, 143));
        pathB3.getElements().add(new VLineTo(739));

        PathTransition forB3 = new PathTransition(Duration.seconds(2), pathB3, Obs3);
        forB3.setCycleCount(PathTransition.INDEFINITE);
        forB3.setAutoReverse(true);
        forB3.play();


        //MOVEMENT OF OBSTACLE 4\\
        Image o4 = new Image("/pics/Tressaract.jpg");
        ImageView Obs4 = new ImageView(o4);
        obstacle.add(Obs4);
        Obs4.setFitHeight(22);
        Obs4.setFitWidth(22);
        Obs4.setX(33);
        Obs4.setY(23);

        Path pathB4 = new Path();
        pathB4.getElements().add(new MoveTo(1217, 58));
        pathB4.getElements().add(new VLineTo(659));

        PathTransition forB4 = new PathTransition(Duration.seconds(2), pathB4, Obs4);
        forB4.setCycleCount(PathTransition.INDEFINITE);
        forB4.setAutoReverse(true);
        forB4.play();


        //MOVEMENT OF OBSTACLE 5\\
        Image o5 = new Image("/pics/Tressaract.jpg");
        ImageView Obs5 = new ImageView(o5);
        obstacle.add(Obs5);
        Obs5.setFitHeight(22);
        Obs5.setFitWidth(22);
        Obs5.setX(33);
        Obs5.setY(23);

        Path pathB5 = new Path();
        pathB5.getElements().add(new MoveTo(230, 25));
        pathB5.getElements().add(new VLineTo(600));

        PathTransition forB5 = new PathTransition(Duration.seconds(2), pathB5, Obs5);
        forB5.setCycleCount(PathTransition.INDEFINITE);
        forB5.setAutoReverse(true);
        forB5.play();


        //MOVEMENT OF VILLAIN 1 (THANOS)
        Image thanos = new Image("/pics/Thanos.jpg");
        Thanos = new ImageView(thanos);
        enemy.add(Thanos);
        Thanos.setFitHeight(70);
        Thanos.setFitWidth(30);
        Thanos.relocate(58, 542);

        LineTo lineTo = new LineTo(50, -300);
        LineTo lineTo1 = new LineTo(350, -300);
        LineTo lineTo2 = new LineTo(350, -500);
        LineTo lineTo3 = new LineTo(675, -500);
        LineTo lineTo4 = new LineTo(675, 100);

        MoveTo moveTo = new MoveTo(50, 100);

        Path path_Thanos = new Path(moveTo, lineTo, lineTo1, lineTo2, lineTo3, lineTo4);

        PathTransition forThanos = new PathTransition(Duration.seconds(10), path_Thanos, Thanos);
        forThanos.setCycleCount(PathTransition.INDEFINITE);
        forThanos.setAutoReverse(true);
        forThanos.play();


        //MOVEMENT OF VILLAIN 2 (ULTRON)
        Image ultron = new Image("/pics/Ultron.jpg");
        Ultron = new ImageView(ultron);
        enemy.add(Ultron);
        Ultron.setFitHeight(70);
        Ultron.setFitWidth(30);
        Ultron.relocate(58, 542);

        LineTo lineTo5 = new LineTo(900, -200);
        LineTo lineTo6 = new LineTo(1150, -200);
        LineTo lineTo7 = new LineTo(1150, -480);
        LineTo lineTo8 = new LineTo(900, -480);

        MoveTo moveTo2 = new MoveTo(900, 50);

        Path path_Ultron = new Path(moveTo2, lineTo5, lineTo6, lineTo7, lineTo8);

        PathTransition forUltron = new PathTransition(Duration.seconds(8), path_Ultron, Ultron);
        forUltron.setCycleCount(PathTransition.INDEFINITE);
        forUltron.setAutoReverse(true);
        forUltron.play();


        //MOVEMENT OF VILLAIN 3 (LOKI)
        Image loki = new Image("/pics/Loki.jpg");
        Loki = new ImageView(loki);
        enemy.add(Loki);
        Loki.setFitHeight(80);
        Loki.setFitWidth(30);
        Loki.relocate(58, 542);

        //LineTo lineTo9 = new LineTo(850,100);
        LineTo lineTo10 = new LineTo(850, -50);
        LineTo lineTo11 = new LineTo(600, -50);
        LineTo lineTo12 = new LineTo(600, 150);
        LineTo lineTo13 = new LineTo(450, 150);
        LineTo lineTo14 = new LineTo(450, -20);
        LineTo lineTo15 = new LineTo(350, -20);

        MoveTo moveTo3 = new MoveTo(850, 100);

        Path path_Loki = new Path(moveTo3, lineTo10, lineTo11, lineTo12, lineTo13, lineTo14, lineTo15);

        PathTransition forLoki = new PathTransition(Duration.seconds(7), path_Loki, Loki);
        forLoki.setCycleCount(PathTransition.INDEFINITE);
        forLoki.setAutoReverse(true);
        forLoki.play();


        //HBOX BELOW THE WINDOW\\
        HBox h = new HBox();
        h.setMinHeight(50);
        h.setMinWidth(1300);
        h.setAlignment(Pos.CENTER);
        h.setStyle("-fx-background-color:black");


        //BACKGROUND IMAGE\\
        Image img = new Image("/pics/m.jpg");
        ImageView BackGround = new ImageView(img);
        BackGround.setFitHeight(750);
        BackGround.setFitWidth(1300);




        //HERE COMES OUR HERO !!!!\\
        Image thor = new Image("/pics/Thor.png");
        Thor = new ImageView(thor);
        Thor.setFitHeight(60);
        Thor.setFitWidth(25);
        Thor.relocate(1100, 300);




        //SETTING UP THE MAZE\\

        block = new ArrayList<>();

        Image b1 = new Image("/pics/red bricks.png");
        ImageView B1 = new ImageView(b1);
        block.add(B1);
        B1.setFitHeight(150);
        B1.setFitWidth(65);
        B1.setX(256);
        B1.setY(600);

        Image b2 = new Image("/pics/red bricks.png");
        ImageView B2 = new ImageView(b2);
        block.add(B2);
        B2.setFitHeight(150);
        B2.setFitWidth(65);
        B2.setX(256);
        B2.setY(450);

        Image b3 = new Image("/pics/red bricks.png");
        ImageView B3 = new ImageView(b3);
        block.add(B3);
        B3.setFitHeight(150);
        B3.setFitWidth(65);
        B3.setX(256);
        B3.setY(300);


        Image s1 = new Image("/pics/red stack.png");
        ImageView S1 = new ImageView(s1);
        block.add(S1);
        S1.setFitHeight(50);
        S1.setFitWidth(65);
        S1.setX(0);
        S1.setY(570);

        Image s2 = new Image("/pics/red stack.png");
        ImageView S2 = new ImageView(s2);
        block.add(S2);
        S2.setFitHeight(50);
        S2.setFitWidth(65);
        S2.setX(0);
        S2.setY(142);

        Image s3 = new Image("/pics/red stack.png");
        ImageView S3 = new ImageView(s3);
        block.add(S3);
        S3.setFitHeight(50);
        S3.setFitWidth(65);
        S3.setX(65);
        S3.setY(142);

        Image s4 = new Image("/pics/red stack.png");
        ImageView S4 = new ImageView(s4);
        block.add(S4);
        S4.setFitHeight(50);
        S4.setFitWidth(65);
        S4.setX(248);
        S4.setY(0);

        Image s5 = new Image("/pics/red stack.png");
        ImageView S5 = new ImageView(s5);
        block.add(S5);
        S5.setFitHeight(50);
        S5.setFitWidth(65);
        S5.setX(248);
        S5.setY(50);

        Image s6 = new Image("/pics/red stack.png");
        ImageView S6 = new ImageView(s6);
        block.add(S6);
        S6.setFitHeight(50);
        S6.setFitWidth(65);
        S6.setX(194);
        S6.setY(390);

        Image s7 = new Image("/pics/red stack.png");
        ImageView S7 = new ImageView(s7);
        block.add(S7);
        S7.setFitHeight(50);
        S7.setFitWidth(65);
        S7.setX(132);
        S7.setY(390);


        Image st1 = new Image("/pics/red stack.png");
        ImageView St1 = new ImageView(st1);
        block.add(St1);
        St1.setFitHeight(50);
        St1.setFitWidth(65);
        St1.setX(321);
        St1.setY(629);

        Image st2 = new Image("/pics/red stack.png");
        ImageView St2 = new ImageView(st2);
        block.add(St2);
        St2.setFitHeight(50);
        St2.setFitWidth(65);
        St2.setX(374);
        St2.setY(629);

        Image st3 = new Image("/pics/red stack.png");
        ImageView St3 = new ImageView(st3);
        block.add(St3);
        St3.setFitHeight(50);
        St3.setFitWidth(65);
        St3.setX(321);
        St3.setY(375);

        Image st4 = new Image("/pics/red stack.png");
        ImageView St4 = new ImageView(st4);
        block.add(St4);
        St4.setFitHeight(50);
        St4.setFitWidth(65);
        St4.setX(385);
        St4.setY(375);

        Image st5 = new Image("/pics/red stack.png");
        ImageView St5 = new ImageView(st5);
        block.add(St5);
        St5.setFitHeight(50);
        St5.setFitWidth(65);
        St5.setX(443);
        St5.setY(375);

        Image st6 = new Image("/pics/red stack.png");
        ImageView St6 = new ImageView(st6);
        block.add(St6);
        St6.setFitHeight(50);
        St6.setFitWidth(65);
        St6.setX(505);
        St6.setY(375);

        Image b4 = new Image("/pics/red bricks.png");
        ImageView B4 = new ImageView(b4);
        block.add(B4);
        B4.setFitHeight(150);
        B4.setFitWidth(65);
        B4.setX(567);
        B4.setY(278);

        Image b5 = new Image("/pics/red bricks.png");
        ImageView B5 = new ImageView(b5);
        block.add(B5);
        B5.setFitHeight(150);
        B5.setFitWidth(65);
        B5.setX(567);
        B5.setY(428);

        Image b6 = new Image("/pics/red bricks.png");
        ImageView B6 = new ImageView(b6);
        block.add(B6);
        B6.setFitHeight(150);
        B6.setFitWidth(65);
        B6.setX(567);
        B6.setY(140);

        Image st7 = new Image("/pics/red stack.png");
        ImageView St7 = new ImageView(st7);
        block.add(St7);
        St7.setFitHeight(50);
        St7.setFitWidth(65);
        St7.setX(632);
        St7.setY(279);

        Image st8 = new Image("/pics/red stack.png");
        ImageView St8 = new ImageView(st8);
        block.add(St8);
        St8.setFitHeight(50);
        St8.setFitWidth(65);
        St8.setX(503);
        St8.setY(140);

        Image st9 = new Image("/pics/red stack.png");
        ImageView St9 = new ImageView(st9);
        block.add(St9);
        St9.setFitHeight(50);
        St9.setFitWidth(65);
        St9.setX(443);
        St9.setY(140);


        Image br1 = new Image("/pics/red bricks.png");
        ImageView Br1 = new ImageView(br1);
        block.add(Br1);
        Br1.setFitHeight(150);
        Br1.setFitWidth(65);
        Br1.setX(765);
        Br1.setY(600);

        Image br2 = new Image("/pics/red bricks.png");
        ImageView Br2 = new ImageView(br2);
        block.add(Br2);
        Br2.setFitHeight(150);
        Br2.setFitWidth(65);
        Br2.setX(829);
        Br2.setY(300);

        Image br3 = new Image("/pics/red bricks.png");
        ImageView Br3 = new ImageView(br3);
        block.add(Br3);
        Br3.setFitHeight(150);
        Br3.setFitWidth(65);
        Br3.setX(829);
        Br3.setY(150);

        Image br4 = new Image("/pics/red bricks.png");
        ImageView Br4 = new ImageView(br4);
        block.add(Br4);
        Br4.setFitHeight(150);
        Br4.setFitWidth(65);
        Br4.setX(829);
        Br4.setY(0);

        Image stk1 = new Image("/pics/red stack.png");
        ImageView Stk1 = new ImageView(stk1);
        block.add(Stk1);
        Stk1.setFitHeight(50);
        Stk1.setFitWidth(65);
        Stk1.setX(765);
        Stk1.setY(120);

        Image stk2 = new Image("/pics/red stack.png");
        ImageView Stk2 = new ImageView(stk2);
        block.add(Stk2);
        Stk2.setFitHeight(50);
        Stk2.setFitWidth(65);
        Stk2.setX(894);
        Stk2.setY(177);

        Image stk3 = new Image("/pics/red stack.png");
        ImageView Stk3 = new ImageView(stk3);
        block.add(Stk3);
        Stk3.setFitHeight(50);
        Stk3.setFitWidth(65);
        Stk3.setX(958);
        Stk3.setY(177);

        Image stk4 = new Image("/pics/red stack.png");
        ImageView Stk4 = new ImageView(stk4);
        block.add(Stk4);
        Stk4.setFitHeight(50);
        Stk4.setFitWidth(65);
        Stk4.setX(1020);
        Stk4.setY(177);

        Image stk5 = new Image("/pics/red stack.png");
        ImageView Stk5 = new ImageView(stk5);
        block.add(Stk5);
        Stk5.setFitHeight(50);
        Stk5.setFitWidth(65);
        Stk5.setX(1235);
        Stk5.setY(424);

        Image stk6 = new Image("/pics/red stack.png");
        ImageView Stk6 = new ImageView(stk6);
        block.add(Stk6);
        Stk6.setFitHeight(50);
        Stk6.setFitWidth(65);
        Stk6.setX(1176);
        Stk6.setY(424);

        Image stk7 = new Image("/pics/red stack.png");
        ImageView Stk7 = new ImageView(stk7);
        block.add(Stk7);
        Stk7.setFitHeight(50);
        Stk7.setFitWidth(65);
        Stk7.setX(1115);
        Stk7.setY(424);

        Image br5 = new Image("/pics/red bricks.png");
        ImageView Br5 = new ImageView(br5);
        block.add(Br5);
        Br5.setFitHeight(150);
        Br5.setFitWidth(65);
        Br5.setX(1080);
        Br5.setY(142);

        Image br6 = new Image("/pics/red bricks.png");
        ImageView Br6 = new ImageView(br6);
        block.add(Br6);
        Br6.setFitHeight(150);
        Br6.setFitWidth(65);
        Br6.setX(1050);
        Br6.setY(470);




        //SETTING UP STONES\\
        Image soulStone = new Image("/pics/SoulStone.png");
        ImageView Soul = new ImageView(soulStone);
        stoneList.add(Soul);
        Soul.setFitHeight(30);
        Soul.setFitWidth(30);
        Soul.setX(800);
        Soul.setY(180);

        Image powerStone = new Image("/pics/PowerStone.png");
        ImageView Power = new ImageView(powerStone);
        stoneList.add(Power);
        Power.setFitHeight(30);
        Power.setFitWidth(30);
        Power.setX(14);
        Power.setY(675);

        Image realityStone = new Image("/pics/RealityStone.png");
        ImageView Reality = new ImageView(realityStone);
        stoneList.add(Reality);
        Reality.setFitHeight(30);
        Reality.setFitWidth(30);
        Reality.setX(342);
        Reality.setY(577);

        Image spaceStone = new Image("/pics/SpaceStone.png");
        ImageView Space = new ImageView(spaceStone);
        stoneList.add(Space);
        Space.setFitHeight(30);
        Space.setFitWidth(30);
        Space.setX(915);
        Space.setY(112);

        Image mindStone = new Image("/pics/MindStone.png");
        ImageView Mind = new ImageView(mindStone);
        stoneList.add(Mind);
        Mind.setFitHeight(30);
        Mind.setFitWidth(30);
        Mind.setX(1130);
        Mind.setY(490);

        Image timeStone = new Image("/pics/Timestone.png");
        ImageView Time = new ImageView(timeStone);
        stoneList.add(Time);
        Time.setFitHeight(30);
        Time.setFitWidth(30);
        Time.setX(491);
        Time.setY(320);





        //THOR collecting stones\\
        thor = new Image("/pics/Thor.png");
        Thor = new ImageView(thor);
        Thor.setFitHeight(60);
        Thor.setFitWidth(25);
        Thor.relocate(1065, 400);
        Image hulk = new Image("/pics/Hulk.jpg");
        Hulk = new ImageView(hulk);
        Hulk.setFitHeight(60);
        Hulk.setFitWidth(25);
        Hulk.relocate(1065, 400);
        t1 = new Text();
        t1.setText("Score:");
        t1.setFont(new Font("Italic", 34));
        t1.setFill(Color.CYAN);
        t1.setX(50);
        t1.setY(35);

        t2 = new Text();
        t2.setText("0");
        t2.setFill(Color.CYAN);
        t2.setFont(new Font("Italic", 34));
        t2.setX(150);
        t2.setY(38);





        //EXIT BUTTON AND ACTION\\
        Button btn = new Button("EXIT");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        h.getChildren().addAll(btn);





        //Adding life\\

        Image life1 = new Image("/pics/safegurd.png");
        ImageView l1 = new ImageView(life1);
        life.add(l1);
        l1.setFitHeight(45);
        l1.setFitWidth(40);
        l1.setX(8);
        l1.setY(85);


        Image life2 = new Image("/pics/life1.png");
        ImageView l2 = new ImageView(life2);
        life.add(l2);
        l2.setFitHeight(45);
        l2.setFitWidth(40);
        l2.setX(220);
        l2.setY(440);

        Image life3 = new Image("/pics/life3.png");
        ImageView l3 = new ImageView(life3);
        life.add(l3);
        l3.setFitHeight(35);
        l3.setFitWidth(30);
        l3.setX(525);
        l3.setY(195);





        //ADDING ALL THE ELEMENTS TO OUR ANCHORPANE\\
        pane = new AnchorPane(h);
        pane.setMinHeight(800);
        pane.setMinWidth(1300);
        pane.setMaxHeight(800);
        pane.setMaxWidth(1300);
        pane.setStyle("-fx-background-color: Black");
        pane.setBottomAnchor(h, 0.0);
        pane.getChildren().addAll(BackGround, Thor, Thanos, Ultron, Loki,
                Soul, Reality, Time, Mind, Space, Power,l1,l2,l3,
                Obs1, Obs2, Obs3, Obs4, Obs5,
                B1, B2, B3, S1, S2, S3, S4, S5, S6, S7, St1,
                St2, St3, St4, St5, St6, B4, B5, B6, St7, St8, St9, Br1, Br2, Br3, Br4, Stk1, Stk2,
                Stk3, Stk4, Stk5, Stk6, Stk7, Br5, Br6, t1, t2);





        //SHOWING THE SCENE\\
        Scene scene = new Scene(pane);
        scene.getRoot().requestFocus();
        stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        music();






        //MOVING OUR HERO THROUGH KEYBOARD\\
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        goUp = true;
                        break;
                    case DOWN:
                        goDown = true;
                        break;
                    case LEFT:
                        goLeft = true;
                        break;
                    case RIGHT:
                        goRight = true;
                        break;
                }
            }
        });


        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        goUp = false;
                        break;
                    case DOWN:
                        goDown = false;
                        break;
                    case LEFT:
                        goLeft = false;
                        break;
                    case RIGHT:
                        goRight = false;
                        break;
                }
            }
        });


        AnimationTimer timer = new AnimationTimer() {
            double delta = 4;

            @Override
            public void handle(long now) {
                checkEnemy();
                checkBlock();
                currX = Thor.getLayoutX();
                currY = Thor.getLayoutY();

                if (goUp) {
                    currY -= delta;
                    checkCollision();
                    CheckLife();
                }
                if (goDown) {
                    currY += delta;
                    checkCollision();
                    CheckLife();
                }
                if (goLeft) {
                    currX -= delta;
                    checkCollision();
                    CheckLife();

                }
                if (goRight) {
                    currX += delta;
                    checkCollision();
                    CheckLife();

                }
                SetBoundaries();
                if (!checkBlock(currX, currY))
                    Thor.relocate(currX, currY);

            }
        };
        timer.start();
    }


    //Setting Boundary so the character don't go outside\\

    public static double RightBoundary = 1280;
    public static double LeftBoundary = 0;
    public static double BottomBoundary = 690;
    public static double TopBoundary = 0;


    public void SetBoundaries() {
        if (currX >= RightBoundary)
        {
            currX = RightBoundary;
        }
        else if (currX <= LeftBoundary)
        {
            currX = LeftBoundary;
        }
        else if (currY >= BottomBoundary)
        {
            currY = BottomBoundary;
        }
        else if (currY <= TopBoundary)
        {
            currY = TopBoundary;
        }

    }






    //Collision with Enemy\\
    public void checkEnemy() {
        for (ImageView f : enemy) {
            if (Thor.getBoundsInParent().intersects(f.getBoundsInParent())) {

                ImageIcon icon = new ImageIcon("Game_over.jpg");
                JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, icon);
                System.exit(0);

            }
        }
    }






    //Maze as barrier\\
    public boolean checkBlock(double x, double y) {
        for (ImageView b : block) {
            if (b.intersects(x, y, 25, 60))
                return true;

        }
        return false;
    }





    //For Background Music\\
    public void start(Stage s) throws Exception {
        //leave empty
    }


    MediaPlayer mediaplayer;

    public void music() {
        String s = "E:\\Java_Project\\src\\music\\music.mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        mediaplayer = new MediaPlayer(h);
        mediaplayer.play();
    }






    //FOR Earning Scores\\
    private void checkCollision() {
        for (ImageView e : stoneList) {
            if (e.getBoundsInParent().intersects(Thor.getBoundsInParent())) {
                s += 100;
                t2.setText("" + s);
                stoneList.remove(e);
                pane.getChildren().remove(e);
                break;
            }
            if (s == 600) {
                LevelSwap();
            }
        }
    }






    //Collision with Block\\
    public void checkBlock() {
        for (ImageView b : obstacle) {
            if (Thor.getBoundsInParent().intersects(b.getBoundsInParent()) && j < 5 && m==0) {
                j++;
                Thor.setImage(assets.getHero());
                Thor.relocate(1065, 400);
                break;

            } else if (j == 5 && m==0) {
                ImageIcon icon = new ImageIcon("Game_over.jpg");
                JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, icon);
                System.exit(0);
            }
            else if (Thor.getBoundsInParent().intersects(b.getBoundsInParent()) && j < 5 && m>0) {
                m-=1;
                Thor.relocate(1065, 400);

            }
            else if (j == 5 && m>0) {
                m-=1;
                Thor.relocate(1065, 400);

            }
        }
    }






    //LEVEL SWAP\\
    public void LevelSwap() {
        s = 0;
        ImageIcon icon = new ImageIcon("win.jpg");
        int k = JOptionPane.showConfirmDialog(null, "", "", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, icon);
        if (k == JOptionPane.YES_OPTION) {
            stage.close();
            level2 box = new level2();
        } else System.exit(0);
    }







    //FOR GETTING NEW LIFE\\
    private void CheckLife() {
        for (ImageView k : life) {
            if (k.getBoundsInParent().intersects(Thor.getBoundsInParent())) {
                m++;
                life.remove(k);
                pane.getChildren().remove(k);
                break;
            }
        }
    }

    //TIMER\\


}