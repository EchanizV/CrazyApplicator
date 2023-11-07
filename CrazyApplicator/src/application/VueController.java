package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VueController {
	
    
    @FXML
    public ImageView veloC;
    
    @FXML
    public ImageView veloV;
    
    @FXML
    public Label essai;
    
    
    public void clickMeCourse(MouseEvent e) throws IOException
    {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("VueVelo.fxml"));
	Velo v = new Velo(400, 140, "blanc", "???", "course");
	Parent vueVeloCourse = loader.load();
	
	VueVeloController detailController = loader.getController();
        detailController.setSelectedImage(veloC.getImage());
	
        Scene scene2 = new Scene(vueVeloCourse);
	Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	stage.setScene(scene2);
	stage.show();
    }
    
    public void clickMeVille(MouseEvent e) throws IOException
    {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("VueVelo.fxml"));
	Velo v = new Velo(200, 140, "blanc", "???", "Ville");
	Parent vueVeloVille = loader.load();
	
	VueVeloController detailController = loader.getController();
        detailController.setSelectedImage(veloV.getImage());
	
        Scene scene2 = new Scene(vueVeloVille);
	Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	stage.setScene(scene2);
	stage.show();
    }

}
