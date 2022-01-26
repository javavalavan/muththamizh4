package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HelloApplication extends Application {
    private static List<String> uyirList = Arrays.asList(new String[]{"b85","b86","b87","b88","b8a","b8e","b8f","b90","b92","b93","b94"});
    private static List<String> meiList = Arrays.asList(new String[] {"b95","b99","b9a","b9e","b9f", "ba3","ba4", "ba8","baa","bae","baf","bb0","bb2","bb5","bb4","bb3","bb1","ba9"});


    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // Scene scene = new Scene(fxmlLoader.load(), 500, 500);

        TextField input = new TextField();


        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        TextField textField7 = new TextField();
        TextField textField8 = new TextField();
        TextField textField9 = new TextField();
        TextField textField10 = new TextField();
        TextField textField11= new TextField();
        TextField textField12 = new TextField();
        TextField textField13 = new TextField();
        TextField textField14= new TextField();
        TextField textField15 = new TextField();

        textField1.setEditable(false);
        textField2.setEditable(false);
        textField3.setEditable(false);
        textField4.setEditable(false);
        textField5.setEditable(false);
        textField6.setEditable(false);
        textField7.setEditable(false);
        textField8.setEditable(false);
        textField9.setEditable(false);
        textField10.setEditable(false);
        textField11.setEditable(false);
        textField12.setEditable(false);
        textField13.setEditable(false);
        textField14.setEditable(false);
        textField15.setEditable(false);

        textField4.setFocusTraversable(false);
        textField5.setFocusTraversable(false);
        textField6.setFocusTraversable(false);
        textField7.setFocusTraversable(false);
        textField8.setFocusTraversable(false);
        textField9.setFocusTraversable(false);
        textField10.setFocusTraversable(false);
        textField11.setFocusTraversable(false);
        textField12.setFocusTraversable(false);
        textField13.setFocusTraversable(false);
        textField14.setFocusTraversable(false);
        textField15.setFocusTraversable(false);

        Button row1 = new Button("?");
        row1.setPrefWidth(50);


        row1.setVisible(true);


        GridPane gridPane = new GridPane();


        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(input, 0, 0,2,1);
        gridPane.add(row1, 2,0,1,1);

        gridPane.add(textField1, 0, 1, 1, 1);
        gridPane.add(textField2, 1, 1, 1, 1);
        gridPane.add(textField3, 2, 1, 1, 1);


        gridPane.add(textField4, 0, 2, 1, 1);
        gridPane.add(textField5, 1, 2, 1, 1);
        gridPane.add(textField6, 2, 2, 1, 1);


        gridPane.add(textField7, 0, 3, 1, 1);
        gridPane.add(textField8, 1, 3, 1, 1);
        gridPane.add(textField9, 2, 3, 1, 1);


        gridPane.add(textField10, 0, 4, 1, 1);
        gridPane.add(textField11, 1, 4, 1, 1);
        gridPane.add(textField12, 2, 4, 1, 1);


        gridPane.add(textField13, 0, 5, 1, 1);
        gridPane.add(textField14, 1, 5, 1, 1);
        gridPane.add(textField15, 2, 5, 1, 1);


        int rowCount = 6;
        int columnCount = 3;

        RowConstraints rc = new RowConstraints();
        rc.setMaxHeight(50);

        for (int i = 0; i < rowCount; i++) {
            gridPane.getRowConstraints().add(rc);
        }



        ColumnConstraints cc = new ColumnConstraints();
        cc.setMaxWidth(50);

        for (int i = 0; i < columnCount; i++) {
            gridPane.getColumnConstraints().add(cc);
        }




        Scene scene = new Scene(gridPane, 350, 350);
        stage.setTitle("முத்தமிழ்");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();


    }

    private static String escapeNonAscii(String str) {

        StringBuilder retStr = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            int cp = Character.codePointAt(str, i);
            int charCount = Character.charCount(cp);
            if (charCount > 1) {
                i += charCount - 1; // 2.
                if (i >= str.length()) {
                    throw new IllegalArgumentException("truncated unexpectedly");
                }
            }

            if (cp < 128) {
                retStr.appendCodePoint(cp);
            } else {
                if(i==0){
                    retStr.append(String.format("%x", cp));
                }
                else {
                    retStr.append(String.format("u%x", cp));
                }
            }
        }
        return retStr.toString();
    }

    public static void main(String[] args) {
        launch();
    }
}