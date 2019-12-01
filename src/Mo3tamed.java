
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Mo3tamed extends Application {
    String  algoName ;
    long startTime;
    long endTime ; 
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        String lText = "Time elapsed :: " ;
        String[] list ={"PlayFair","A" , "B"} ;

        ComboBox<String > cb = new ComboBox<>(FXCollections.observableArrayList(list)) ;
        cb.setValue("Select an Algorthim ");
        cb.setMinWidth(40);

        ImageView iv = new ImageView( new Image("Resources/convert.png"));
        Button bConvet = new Button( ""  ) ;
        bConvet.setDisable(true);
        bConvet.setGraphic(iv); // set a graphic

        TextArea tO = new TextArea() ;
        tO.setEditable(false);
        TextArea tC = new TextArea() ;
        tC.setEditable(false);

        ScrollPane sc1 = new ScrollPane(tO) ;
        ScrollPane sc2 = new ScrollPane(tC) ;

        Label lTime = new Label(  lText) ;
        Label lAlo = new Label(  "") ;
        lAlo.setMinWidth(50);

        //Actions
        cb.valueProperty().addListener(e->{

            algoName  = cb.getValue() ; // get name from cb
            bConvet.setDisable(false); //make button clickable
            lAlo.setText(  algoName +"  is selected  " );
            tO.setEditable(true); // makt ta editable to enter text

        });

        bConvet.setOnAction( e->{
            String input = tO.getText();
            if (!input.isEmpty() ) {
                startTime = System.currentTimeMillis();
                youralgoritmhere(algoName, input); //your code
                tC.setText(input);
                endTime = System.currentTimeMillis();
                lTime.setText(lText + time(endTime - startTime));
            }
            else
            {
                Alert.al("رسالة ليك ");
            }
        });
        GridPane gp = new GridPane() ;
        gp.setPadding(new Insets(20));
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(15);
        gp.setVgap(15);

        gp.addRow(0 , cb , lAlo);
        gp.addRow( 1 , sc1 , bConvet  , sc2 );
        gp.add(lTime ,2 , 2 );

        primaryStage.setScene(new Scene( gp));
        primaryStage.setTitle("Encrption With Mo3tamed ");
        primaryStage.show();
    }

    public static void  youralgoritmhere (String algo  , String input  ) {

        //depend on index
        for (int i = 0; i <200000 ; i++) {
            System.out.println(i);
        }
    }

    public static String  time (long t ){
        long  m ;
        long s ; 
        s= (t/1000) % 60  
        m=s/60 ;
        return   m+" minutes "+s+ " seconds . "  ;
    }
}
