import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class Alert {

public static  void al (String title ){

    Stage st = new Stage() ;

    Label l = new Label() ;
    StringBuilder sb = new StringBuilder();
    sb.append( "يا خي حس على دمك يعنى انا ريحت دماغي وخليت الزار مخفي لحد ما تضغط ")  ;
    sb.append("\n") ;
    sb.append("على اختيار الطريقة كمان " ) ;
    sb.append('\n') ;
    sb.append("اكتب نص الاول عشان اشفرهيا عسل ^^^^ ") ;
    l.setText(sb.toString());
    l.setMinWidth(70 );

    HBox h = new HBox();
    h.setPadding(new Insets(25));
    h.setAlignment(Pos.CENTER );
    h.getChildren().add(l) ;

    st.setScene(new Scene( h));
    st.setTitle(title);
    st.showAndWait();





}
}
