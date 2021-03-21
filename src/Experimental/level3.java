
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
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;


public class level3<ae>{

    private ArrayList<ImageView> stoneList, block, obstacle, life;
    public ImageView Thor, Time, Hulk, Hero;
    public ImageView Thanos, Ultron, Loki;
    boolean goUp, goDown, goRight, goLeft;
    public Rectangle2D r, r1;
    private AnchorPane pane;
    private Stage stage;
    private final Text t5;
    private final Text t6;
    private int s = 1200;
    public ImageView Block13;
    public double currX, currY;
    private static int j = 0, m = 0;
    private static Assets assets;
    private static ArrayList<ImageView> enemy;
    protected static final double pos_x = 81;
    protected static final double pos_y = 81;

    level3() {


        assets = new Assets();
        enemy = new ArrayList<>();
        stoneList = new ArrayList<>();
        block = new ArrayList<>();
        obstacle = new ArrayList<>();
        life = new ArrayList<>();


        //MOVEMENT OF OBSTACLE 1
        Image o1 = new Image("/pics/Tressaract.jpg");
        ImageView Obs1 = new ImageView(o1);
        obstacle.add(Obs1);
        Obs1.setFitHeight(22);
        Obs1.setFitWidth(22);
        Obs1.setX(33);
        Obs1.setY(53);

        Path pathB1 = new Path();
        pathB1.getElements().add(new MoveTo(33, 23));
        pathB1.getElements().add(new HLineTo(1209));

        PathTransition forB1 = new PathTransition(Duration.seconds(1.2), pathB1, Obs1);
        forB1.setCycleCount(PathTransition.INDEFINITE);
        forB1.setAutoReverse(true);
        forB1.play();


        //MOVEMENT OF OBSTACLE 2
        Image o2 = new Image("/pics/Tressaract.jpg");
        ImageView Obs2 = new ImageView(o2);
        obstacle.add(Obs1);
        Obs2.setFitHeight(22);
        Obs2.setFitWidth(22);
        Obs2.setX(33);
        Obs2.setY(123);

        Path pathB2 = new Path();
        pathB2.getElements().add(new MoveTo(33, 100));
        pathB2.getElements().add(new HLineTo(1220));

        PathTransition forB2 = new PathTransition(Duration.seconds(1.5), pathB2, Obs2);
        forB2.setCycleCount(PathTransition.INDEFINITE);
        forB2.setAutoReverse(true);
        forB2.play();


        //MOVEMENT OF OBSTACLE 3
        Image o3 = new Image("/pics/Tressaract.jpg");
        ImageView Obs3 = new ImageView(o3);
        obstacle.add(Obs3);
        Obs3.setFitHeight(22);
        Obs3.setFitWidth(22);
        Obs3.setX(33);
        Obs3.setY(253);

        Path pathB3 = new Path();
        pathB3.getElements().add(new MoveTo(33, 253));
        pathB3.getElements().add(new HLineTo(1235));

        PathTransition forB3 = new PathTransition(Duration.seconds(1.8), pathB3, Obs3);
        forB3.setCycleCount(PathTransition.INDEFINITE);
        forB3.setAutoReverse(true);
        forB3.play();


        //MOVEMENT OF OBSTACLE 4
        Image o4 = new Image("/pics/Tressaract.jpg");
        ImageView Obs4 = new ImageView(o4);
        obstacle.add(Obs4);
        Obs4.setFitHeight(22);
        Obs4.setFitWidth(22);
        Obs4.setX(33);
        Obs4.setY(523);

        Path pathB4 = new Path();
        pathB4.getElements().add(new MoveTo(33, 423));
        pathB4.getElements().add(new HLineTo(1209));

        PathTransition forB4 = new PathTransition(Duration.seconds(1.4), pathB4, Obs4);
        forB4.setCycleCount(PathTransition.INDEFINITE);
        forB4.setAutoReverse(true);
        forB4.play();


        //MOVEMENT OF OBSTACLE 5
        Image o5 = new Image("/pics/Tressaract.jpg");
        ImageView Obs5 = new ImageView(o5);
        obstacle.add(Obs5);
        Obs5.setFitHeight(22);
        Obs5.setFitWidth(22);
        Obs5.setX(33);
        Obs5.setY(623);

        Path pathB5 = new Path();
        pathB5.getElements().add(new MoveTo(33, 623));
        pathB5.getElements().add(new HLineTo(1200));

        PathTransition forB5 = new PathTransition(Duration.seconds(1.7), pathB5, Obs5);
        forB5.setCycleCount(PathTransition.INDEFINITE);
        forB5.setAutoReverse(true);
        forB5.play();


        //MOVEMENT OF VILLAIN 1 (THANOS)
        Image thanos = new Image("/pics/Thanos.jpg");
        Thanos = new ImageView(thanos);
        enemy.add(Thanos);
        Thanos.setFitHeight(70);
        Thanos.setFitWidth(30);
        Thanos.relocate(65, 700);

        LineTo lineTo = new LineTo(13, -200);
        LineTo lineTo1 = new LineTo(130, -200);
        LineTo lineTo2 = new LineTo(130, 10);
        LineTo lineTo3 = new LineTo(430, 10);

        MoveTo moveTo = new MoveTo(13, -430);

        Path path_Thanos = new Path(moveTo, lineTo , lineTo1 , lineTo2 , lineTo3 /*, lineTo4*/);

        PathTransition forThanos = new PathTransition(Duration.seconds(6), path_Thanos, Thanos);
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

        LineTo lineTo5 = new LineTo(630, -70);
        LineTo lineTo6 = new LineTo(400, -70);
        LineTo lineTo7 = new LineTo(400, -300);
        LineTo lineTo8 = new LineTo(560, -300);
        LineTo lineTo4 = new LineTo(560, -500);

        MoveTo moveTo2 = new MoveTo(630, 150);

        Path path_Ultron = new Path(moveTo2 , lineTo5 , lineTo6 , lineTo7 , lineTo8 , lineTo4);

        PathTransition forUltron = new PathTransition(Duration.seconds(5), path_Ultron, Ultron);
        forUltron.setCycleCount(PathTransition.INDEFINITE);
        forUltron.setAutoReverse(true);
        forUltron.play();


        //MOVEMENT OF VILLAIN 3 (LOKI)
        Image loki = new Image("/pics/Loki.jpg");
        Loki = new ImageView(loki);
        enemy.add(Loki);
        Loki.setFitHeight(70);
        Loki.setFitWidth(30);
        Loki.relocate(58, 542);

        //LineTo lineTo9 = new LineTo(850,100);
        LineTo lineTo10 = new LineTo(770,-330 );
        LineTo lineTo11 = new LineTo(1000, -330);
        LineTo lineTo12 = new LineTo(1000, 0);
        LineTo lineTo13 = new LineTo(1100, -500);

        MoveTo moveTo3 = new MoveTo(770, -60);

        Path path_Loki = new Path(moveTo3, lineTo10 , lineTo11 , lineTo12 /*, lineTo13*/);

        PathTransition forLoki = new PathTransition(Duration.seconds(4), path_Loki, Loki);
        forLoki.setCycleCount(PathTransition.INDEFINITE);
        forLoki.setAutoReverse(true);
        forLoki.play();


        //HBOX BELOW THE WINDOW
        HBox h = new HBox();
        h.setMinHeight(50);
        h.setMinWidth(1300);
        h.setAlignment(Pos.CENTER);
        h.setStyle("-fx-background-color:black");


        //BACKGROUND IMAGE
        Image img = new Image("/pics/l.jpg");
        ImageView BackGround = new ImageView(img);
        BackGround.setFitHeight(750);
        BackGround.setFitWidth(1300);




        //HERE COMES OUR HERO !!!!
        Image thor = new Image("/pics/Thor.png");
        Thor = new ImageView(thor);
        Thor.setFitHeight(60);
        Thor.setFitWidth(25);
        Thor.relocate(1200, 400);




        //SETTING UP THE MAZE\\

        block = new ArrayList<>();

        Image b1 = new Image("/pics/red bricks.png");
        ImageView B1 = new ImageView(b1);
        block.add(B1);
        B1.setFitHeight(150);
        B1.setFitWidth(65);
        B1.setX(38);
        B1.setY(608);

        Image b2 = new Image("/pics/red bricks.png");
        ImageView B2 = new ImageView(b2);
        block.add(B2);
        B2.setFitHeight(150);
        B2.setFitWidth(65);
        B2.setX(171);
        B2.setY(258);

        Image b3 = new Image("/pics/red bricks.png");
        ImageView B3 = new ImageView(b3);
        block.add(B3);
        B3.setFitHeight(150);
        B3.setFitWidth(65);
        B3.setX(223);
        B3.setY(0);

        Image b4 = new Image("/pics/red bricks.png");
        ImageView B4 = new ImageView(b4);
        block.add(B4);
        B4.setFitHeight(150);
        B4.setFitWidth(65);
        B4.setX(359);
        B4.setY(402);

        Image b5 = new Image("/pics/red bricks.png");
        ImageView B5 = new ImageView(b5);
        block.add(B5);
        B5.setFitHeight(150);
        B5.setFitWidth(65);
        B5.setX(559);
        B5.setY(607);

        Image b6 = new Image("/pics/red bricks.png");
        ImageView B6 = new ImageView(b6);
        block.add(B6);
        B6.setFitHeight(150);
        B6.setFitWidth(65);
        B6.setX(463);
        B6.setY(0);

        Image b7 = new Image("/pics/red bricks.png");
        ImageView B7 = new ImageView(b7);
        block.add(B7);
        B7.setFitHeight(150);
        B7.setFitWidth(65);
        B7.setX(650);
        B7.setY(181);

        Image b8 = new Image("/pics/red bricks.png");
        ImageView B8 = new ImageView(b8);
        block.add(B8);
        B8.setFitHeight(150);
        B8.setFitWidth(65);
        B8.setX(828);
        B8.setY(607);

        Image b9 = new Image("/pics/red bricks.png");
        ImageView B9 = new ImageView(b9);
        block.add(B9);
        B9.setFitHeight(150);
        B9.setFitWidth(65);
        B9.setX(880);
        B9.setY(327);

        Image br1 = new Image("/pics/red bricks.png");
        ImageView Br1 = new ImageView(br1);
        block.add(Br1);
        Br1.setFitHeight(150);
        Br1.setFitWidth(65);
        Br1.setX(869);
        Br1.setY(0);

        Image br2 = new Image("/pics/red bricks.png");
        ImageView Br2 = new ImageView(br2);
        block.add(Br2);
        Br2.setFitHeight(150);
        Br2.setFitWidth(65);
        Br2.setX(1101);
        Br2.setY(162);

        Image br3 = new Image("/pics/red bricks.png");
        ImageView Br3 = new ImageView(br3);
        block.add(Br3);
        Br3.setFitHeight(150);
        Br3.setFitWidth(65);
        Br3.setX(1101);
        Br3.setY(500);




        Image s1 = new Image("/pics/red stack.png");
        ImageView S1 = new ImageView(s1);
        block.add(S1);
        S1.setFitHeight(50);
        S1.setFitWidth(65);
        S1.setX(103);
        S1.setY(558);

        Image s2 = new Image("/pics/red stack.png");
        ImageView S2 = new ImageView(s2);
        block.add(S2);
        S2.setFitHeight(50);
        S2.setFitWidth(65);
        S2.setX(112);
        S2.setY(405);

        Image s3 = new Image("/pics/red stack.png");
        ImageView S3 = new ImageView(s3);
        block.add(S3);
        S3.setFitHeight(50);
        S3.setFitWidth(65);
        S3.setX(112);
        S3.setY(208);

        Image s4 = new Image("/pics/red stack.png");
        ImageView S4 = new ImageView(s4);
        block.add(S4);
        S4.setFitHeight(50);
        S4.setFitWidth(65);
        S4.setX(45);
        S4.setY(160);

        Image s5 = new Image("/pics/red stack.png");
        ImageView S5 = new ImageView(s5);
        block.add(S5);
        S5.setFitHeight(50);
        S5.setFitWidth(65);
        S5.setX(0);
        S5.setY(110);

        Image s6 = new Image("/pics/red stack.png");
        ImageView S6 = new ImageView(s6);
        block.add(S6);
        S6.setFitHeight(50);
        S6.setFitWidth(65);
        S6.setX(404);
        S6.setY(146);

        Image s7 = new Image("/pics/red stack.png");
        ImageView S7 = new ImageView(s7);
        block.add(S7);
        S7.setFitHeight(50);
        S7.setFitWidth(65);
        S7.setX(346);
        S7.setY(196);


        Image st1 = new Image("/pics/red stack.png");
        ImageView St1 = new ImageView(st1);
        block.add(St1);
        St1.setFitHeight(50);
        St1.setFitWidth(65);
        St1.setX(301);
        St1.setY(548);

        Image st2 = new Image("/pics/red stack.png");
        ImageView St2 = new ImageView(st2);
        block.add(St2);
        St2.setFitHeight(50);
        St2.setFitWidth(65);
        St2.setX(242);
        St2.setY(598);

        Image st3 = new Image("/pics/red stack.png");
        ImageView St3 = new ImageView(st3);
        block.add(St3);
        St3.setFitHeight(50);
        St3.setFitWidth(65);
        St3.setX(591);
        St3.setY(327);

        Image st4 = new Image("/pics/red stack.png");
        ImageView St4 = new ImageView(st4);
        block.add(St4);
        St4.setFitHeight(50);
        St4.setFitWidth(65);
        St4.setX(532);
        St4.setY(375);

        Image st5 = new Image("/pics/red stack.png");
        ImageView St5 = new ImageView(st5);
        block.add(St5);
        St5.setFitHeight(50);
        St5.setFitWidth(65);
        St5.setX(500);
        St5.setY(558);

        Image st6 = new Image("/pics/red stack.png");
        ImageView St6 = new ImageView(st6);
        block.add(St6);
        St6.setFitHeight(50);
        St6.setFitWidth(65);
        St6.setX(769);
        St6.setY(558);

        Image st7 = new Image("/pics/red stack.png");
        ImageView St7 = new ImageView(st7);
        block.add(St7);
        St7.setFitHeight(50);
        St7.setFitWidth(65);
        St7.setX(710);
        St7.setY(508);

        Image st8 = new Image("/pics/red stack.png");
        ImageView St8 = new ImageView(st8);
        block.add(St8);
        St8.setFitHeight(50);
        St8.setFitWidth(65);
        St8.setX(715);
        St8.setY(129);

        Image st9 = new Image("/pics/red stack.png");
        ImageView St9 = new ImageView(st9);
        block.add(St9);
        St9.setFitHeight(50);
        St9.setFitWidth(65);
        St9.setX(715);
        St9.setY(327);

        Image stk1 = new Image("/pics/red stack.png");
        ImageView Stk1 = new ImageView(stk1);
        block.add(Stk1);
        Stk1.setFitHeight(50);
        Stk1.setFitWidth(65);
        Stk1.setX(945);
        Stk1.setY(277);

        Image stk2 = new Image("/pics/red stack.png");
        ImageView Stk2 = new ImageView(stk2);
        block.add(Stk2);
        Stk2.setFitHeight(50);
        Stk2.setFitWidth(65);
        Stk2.setX(945);
        Stk2.setY(475);

        Image stk3 = new Image("/pics/red stack.png");
        ImageView Stk3 = new ImageView(stk3);
        block.add(Stk3);
        Stk3.setFitHeight(50);
        Stk3.setFitWidth(65);
        Stk3.setX(1042);
        Stk3.setY(112);

        Image stk4 = new Image("/pics/red stack.png");
        ImageView Stk4 = new ImageView(stk4);
        block.add(Stk4);
        Stk4.setFitHeight(50);
        Stk4.setFitWidth(65);
        Stk4.setX(1042);
        Stk4.setY(646);



        //SETTING UP STONES\\
        Image soulStone = new Image("/pics/SoulStone.png");
        ImageView Soul = new ImageView(soulStone);
        stoneList.add(Soul);
        Soul.setFitHeight(30);
        Soul.setFitWidth(30);
        Soul.setX(126);
        Soul.setY(293);

        Image powerStone = new Image("/pics/PowerStone.png");
        ImageView Power = new ImageView(powerStone);
        stoneList.add(Power);
        Power.setFitHeight(30);
        Power.setFitWidth(30);
        Power.setX(117);
        Power.setY(633);

        Image realityStone = new Image("/pics/RealityStone.png");
        ImageView Reality = new ImageView(realityStone);
        stoneList.add(Reality);
        Reality.setFitHeight(30);
        Reality.setFitWidth(30);
        Reality.setX(418);
        Reality.setY(97);

        Image spaceStone = new Image("/pics/SpaceStone.png");
        ImageView Space = new ImageView(spaceStone);
        stoneList.add(Space);
        Space.setFitHeight(30);
        Space.setFitWidth(30);
        Space.setX(544);
        Space.setY(327);

        Image mindStone = new Image("/pics/MindStone.png");
        ImageView Mind = new ImageView(mindStone);
        stoneList.add(Mind);
        Mind.setFitHeight(30);
        Mind.setFitWidth(30);
        Mind.setX(724);
        Mind.setY(597);

        Image timeStone = new Image("/pics/Timestone.png");
        ImageView Time = new ImageView(timeStone);
        stoneList.add(Time);
        Time.setFitHeight(30);
        Time.setFitWidth(30);
        Time.setX(959);
        Time.setY(370);


        //THOR collecting stones\\
        thor = new Image("/pics/Thor.png");
        Thor = new ImageView(thor);
        Thor.setFitHeight(60);
        Thor.setFitWidth(25);
        Thor.relocate(1200, 350);
        Image hulk = new Image("/pics/Hulk.jpg");
        Hulk = new ImageView(hulk);
        Hulk.setFitHeight(60);
        Hulk.setFitWidth(25);
        Hulk.relocate(1200, 350);
        t5 = new Text();
        t5.setText("Score:");
        t5.setFont(new Font("Italic", 34));
        t5.setFill(Color.CYAN);
        t5.setX(50);
        t5.setY(35);

        t6 = new Text();
        t6.setText("1200");
        t6.setFill(Color.CYAN);
        t6.setFont(new Font("Italic", 34));
        t6.setX(150);
        t6.setY(38);





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
        l1.setX(300);
        l1.setY(451);


        Image life2 = new Image("/pics/life1.png");
        ImageView l2 = new ImageView(life2);
        life.add(l2);
        l2.setFitHeight(45);
        l2.setFitWidth(40);
        l2.setX(691);
        l2.setY(60);

        Image life3 = new Image("/pics/life3.png");
        ImageView l3 = new ImageView(life3);
        life.add(l3);
        l3.setFitHeight(35);
        l3.setFitWidth(30);
        l3.setX(950);
        l3.setY(681);


        //ADDING ALL THE ELEMENTS TO OUR ANCHORPANE\\
        pane = new AnchorPane(h);
        pane.setMinHeight(800);
        pane.setMinWidth(1300);
        pane.setMaxHeight(800);
        pane.setMaxWidth(1300);
        pane.setStyle("-fx-background-color: Black");
        pane.setBottomAnchor(h, 0.0);
        pane.getChildren().addAll(BackGround, Thor, Thanos, Ultron, Loki,
                Soul, Reality, Time, Mind, Space, Power,
                Obs2, Obs3, Obs4, Obs5,
                B1, B2, B3, B4, B5, B6, B7, B8, B9,
                Br1, Br2, Br3,
                S1, S2, S3, S4, S5, S6, S7,
                St1, St2, St3, St4, St5, St6, St7, St8, St9,
                Stk1, Stk2, Stk3, Stk4,
                t5, t6, l1, l2, l3
        );




        //SHOWING THE SCENE\\
        Scene scene = new Scene(pane);
        scene.getRoot().requestFocus();
        stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        //music();





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

  /*  public level2(Text t5, Text t6) {
        this.t5 = t5;
        this.t6 = t6;
    }*/


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
                t6.setText("" + s);
                stoneList.remove(e);
                pane.getChildren().remove(e);
                break;
            }
            if(s==1800){
                ImageIcon icon = new ImageIcon("FinalWin.jpg");
                JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, icon);
                System.exit(0);
            }

        }
    }






    //Collision with Block\\
    public void checkBlock() {
        for (ImageView b : obstacle) {
            if (Thor.getBoundsInParent().intersects(b.getBoundsInParent()) && j < 5 && m == 0) {
                j++;
                Thor.setImage(assets.getHero());
                Thor.relocate(1200, 350);
                break;

            } else if (j == 5 && m == 0) {
                ImageIcon icon = new ImageIcon("Game_over.jpg");
                JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE, icon);
                System.exit(0);
            } else if (Thor.getBoundsInParent().intersects(b.getBoundsInParent()) && j < 5 && m > 0) {
                m -= 1;
                Thor.relocate(1200, 350);

            } else if (j == 5 && m > 0) {
                m -= 1;
                Thor.relocate(1200, 350);

            }
        }
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





//Level swap\\

 /*   public void LevelSwap() {
        s = 0;
        ImageIcon icon = new ImageIcon("win.jpg");
        int k = JOptionPane.showConfirmDialog(null, "", "", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, icon);
        if (k == JOptionPane.YES_OPTION) {
            stage.close();
            Help box = new Help();
        } else System.exit(0);
    }*/
}

