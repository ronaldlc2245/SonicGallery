package sample;


import javafx.application.Application;
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
import javafx.stage.Stage;

import javax.swing.text.LabelView;


public class Main extends Application {

    // set dimensions for window
    private static int width = 500;
    private static int height = 500;

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

        // Sonic Image
        ImageView sonicImg = new ImageView("https://vignette4.wikia.nocookie.net/" +
                "characters/images/6/67/Sonic_sonicx.png/revision/latest?cb=20130511172510");
        sonicImg.setFitWidth((width/3) -10);
        sonicImg.setFitHeight(height - 100);

        // Tails Image
        ImageView tailsImg = new ImageView("http://vignette2.wikia.nocookie.net/" +
                "spongebobandfriendsadventures/images/6/6a/Tails.png/revision/latest?cb=20150407151156");
        tailsImg.setFitWidth((width/3)-10);
        tailsImg.setFitHeight(height - 100);

        // Knuckles Image
        ImageView knucklesImg = new ImageView("https://static.comicvine.com/uploads/original/5/53636/" +
                "1010133-advance3_knuckles.png");
        knucklesImg.setFitWidth((width/3) - 10);
        knucklesImg.setFitHeight(height - 100);

        Button sonicBtn = new Button("Sonic", sonicImg);
        sonicBtn.setContentDisplay(ContentDisplay.TOP);

        Button tailsBtn = new Button("Tails", tailsImg);
        tailsBtn.setContentDisplay(ContentDisplay.TOP);

        Button knucklesBtn = new Button("Knuckles", knucklesImg);
        knucklesBtn.setContentDisplay(ContentDisplay.TOP);

        //grid.setGridLinesVisible(true);

        grid.getChildren().addAll(sonicBtn, tailsBtn, knucklesBtn);
        GridPane.setConstraints(sonicBtn,0,0);
        GridPane.setConstraints(tailsBtn, 1,0);
        GridPane.setConstraints(knucklesBtn,2,0);

        //GridPane.setConstraints(tailsBtn,,0);




        primaryStage.setTitle("Sonic Characters");
        primaryStage.setScene(new Scene(grid, width, height));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
