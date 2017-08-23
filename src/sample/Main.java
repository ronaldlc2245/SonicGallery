package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.text.LabelView;


public class Main extends Application {

    // set dimensions for window
    private static int width = 500;
    private static int height = 500;

    private static void addActionHandlers(Button sonicBtn1, Button tailsBtn1, Button knucklesBtn1) {
        sonicBtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sonic");
            }
        });

        tailsBtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Tails");
            }
        });


        knucklesBtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Knuckles");

            }
        });

    }

    private static Button addTailsButton(){
        // Tails Image
        ImageView tailsImg = new ImageView("http://vignette2.wikia.nocookie.net/" +
                "spongebobandfriendsadventures/images/6/6a/Tails.png/revision/latest?cb=20150407151156");
        tailsImg.setFitWidth((width/3)-10);
        tailsImg.setFitHeight(height - 100);

        Button tailsBtn1 = new Button("Tails", tailsImg);
        tailsBtn1.setContentDisplay(ContentDisplay.TOP);
        return tailsBtn1;

    }

    private static Button addKnucklesButton() {
        // Knuckles Image
        ImageView knucklesImg = new ImageView("https://static.comicvine.com/uploads/original/5/53636/" +
                "1010133-advance3_knuckles.png");
        knucklesImg.setFitWidth((width/3) - 10);
        knucklesImg.setFitHeight(height - 100);

        Button knucklesBtn1 = new Button("Knuckles", knucklesImg);
        knucklesBtn1.setContentDisplay(ContentDisplay.TOP);

        return knucklesBtn1;
    }

    private static Button addSonicButton() {
        // Sonic Image
        ImageView sonicImg = new ImageView("https://vignette4.wikia.nocookie.net/" +
                "characters/images/6/67/Sonic_sonicx.png/revision/latest?cb=20130511172510");
        sonicImg.setFitWidth((width/3) -10);
        sonicImg.setFitHeight(height - 100);

        Button sonicBtn1 = new Button("Sonic", sonicImg);
        sonicBtn1.setContentDisplay(ContentDisplay.TOP);
        return sonicBtn1;

    }
    private static void addBackground(GridPane grid1, String url) {
        Image image = new Image(url);
        grid1.setBackground(new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false,
                        true, true))));
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane grid = new GridPane();
        grid.setHgap(10);
        String url = "https://vignette1.wikia.nocookie.net/sonic/images/8/8b/" +
                "Windy_Hill_Background_%28Sonic_Lost_World_Japanese_Website_2%29.jpg/revision/latest?cb=20160113161156";

        addBackground(grid, url);

        // create buttons
        Button sonicBtn = addSonicButton();
        Button tailsBtn = addTailsButton();
        Button knucklesBtn = addKnucklesButton();

        // add action handlers
        addActionHandlers(sonicBtn, tailsBtn, knucklesBtn);



        Label bottomText = new Label("Pick your favorite Sonic Character \nto learn more");
        bottomText.setTextFill(Color.BLACK);
        bottomText.setStyle("-fx-font: 24 arial;");

        grid.getChildren().addAll(sonicBtn, tailsBtn, knucklesBtn,bottomText);
        GridPane.setConstraints(sonicBtn,0,0);
        GridPane.setConstraints(tailsBtn, 1,0);
        GridPane.setConstraints(knucklesBtn,2,0);
        GridPane.setConstraints(bottomText,0,1,3,1,HPos.CENTER, VPos.CENTER);



        primaryStage.setTitle("Sonic Characters");
        primaryStage.setScene(new Scene(grid, width, height));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
