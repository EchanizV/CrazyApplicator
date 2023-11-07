package application;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class VueVeloController {
    
    private Integer pxColorOpt = 0;
    private Integer pxText;
    private Integer pxCust = 0;
    private Integer pxtot;

    @FXML
    public ImageView velo;
    
    @FXML
    public ColorPicker couleurchoisie;
    
    @FXML
    public Button rouge;
    
    @FXML
    public Button bleu;
    
    @FXML
    public Button vert;
    
    @FXML
    public Button rstPrix;
    
    @FXML
    private ToggleGroup ouinon;
    
    @FXML
    public RadioButton non;
    
    @FXML
    public RadioButton oui;
    
    @FXML
    public TextField perso;
    
    @FXML
    public TextField pxtt;
    
    @FXML
    public Label prix;
    
    @FXML
    public Label custom;
    
    @FXML 
    public Label pxcustom;
    
    @FXML
    private Image selectedImage;

    public void setSelectedImage(Image image) {
        selectedImage = image;
        velo.setImage(image);
    }
    
    
    public void initialize()
    {
	pxtot = Velo.getPrix();
	pxtt.setText(pxtot.toString());
    }
   
    
    public void onClickTextTrue(ActionEvent event) {
	if (pxText == null)
        {
            pxText = 100;
            pxtot = pxtot + pxText;
            pxtt.setText(pxtot.toString());
            pxCust = pxCust + pxText;
            pxcustom.setText(pxCust.toString() + " €");
        }
	else
	{
	    pxtot = pxtot + pxText;
            pxtt.setText(pxtot.toString());
            pxCust = pxCust + pxText;
            pxcustom.setText(pxCust.toString() + " €");
	}
    }
    
    public void onClickTextFalse(ActionEvent event) {
   	if (pxText == null)
           {
   	    pxText = 100;
	       pxtot = pxtot - pxText;
               pxcustom.setText(pxCust.toString() + " €");
               perso.setEditable(false);
           }
   	else
   	{
               pxtt.setText(pxtot.toString());
               pxCust = pxCust - pxText;
               pxtot = pxtot - pxText;
               pxcustom.setText(pxCust.toString() + " €");
               pxtt.setText(pxtot.toString());
               perso.setEditable(false);
   	}
       }
    
    
    public void onClickColorOne(ActionEvent event) {
	String ty = Velo.getType();
	if(ty == "course")
	{
	        File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloCourse\\herd-rouge.png");
	        Image newImage = new Image(file.toURI().toString());
	        velo.setImage(newImage);
	        if (pxColorOpt == null)
	        {
	            pxColorOpt = 200;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());
	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	            
	        }
	        else
	        {
	            pxtot = pxtot - pxColorOpt;
	            pxCust = pxCust - pxColorOpt;
	            pxColorOpt = 200;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());
	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	        }
	}
	else
	{
	    	File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloVille\\red.jpg");
	        Image newImage = new Image(file.toURI().toString());
	        velo.setImage(newImage);
	        if (pxColorOpt == null)
	        {
	            pxColorOpt = 200;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());
	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	            
	        }
	        else
	        {
	            pxtot = pxtot - pxColorOpt;
	            pxCust = pxCust - pxColorOpt;
	            pxColorOpt = 200;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());
	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	        }
	}
    }
    
    public void onClickColorTwo(ActionEvent event) {
	String ty = Velo.getType();
	if(ty == "course")
	{
	    File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloCourse\\canyon-bleu.png");
	    Image newImage = new Image(file.toURI().toString());
	    velo.setImage(newImage);
	    if (pxColorOpt == null)
	        {
	            pxColorOpt = 300;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());

	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	            
	        }
	        else
	        {
	            pxtot = pxtot - pxColorOpt;
	            pxCust = pxCust - pxColorOpt;
	            pxColorOpt = 300;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());

	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	        }
	}
	else
	{
	    File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloVille\\ville_bleu.png");
	        Image newImage = new Image(file.toURI().toString());
	        velo.setImage(newImage);
	        if (pxColorOpt == null)
	        {
	            pxColorOpt = 300;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());
	            
	            pxcustom.setText(pxColorOpt.toString() + " €");
	            
	        }
	        else
	        {
	            pxtot = pxtot - pxColorOpt;
	            pxCust = pxCust - pxColorOpt;
	            pxColorOpt = 300;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());

	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	        }
	}
   }
    
    public void onClickColorThree(ActionEvent event) {
	String ty = Velo.getType();
	if(ty == "course")
	{
	    File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloCourse\\sava-vert.png");
	    Image newImage = new Image(file.toURI().toString());
	    velo.setImage(newImage);
	    if (pxColorOpt == null)
	        {
	            pxColorOpt = 400;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());

	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	            
	        }
	        else
	        {
	            pxtot = pxtot - pxColorOpt;
	            pxCust = pxCust - pxColorOpt;
	            pxColorOpt = 400;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());

	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	        }
	}
	else
	{
	    File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloVille\\vert.jpg");
	    Image newImage = new Image(file.toURI().toString());
	    velo.setImage(newImage);
	    if (pxColorOpt == null)
	        {
	            pxColorOpt = 400;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());

	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	            
	        }
	        else
	        {
	            pxtot = pxtot - pxColorOpt;
	            pxCust = pxCust - pxColorOpt;
	            pxColorOpt = 400;
	            pxtot = pxtot + pxColorOpt;
	            pxtt.setText(pxtot.toString());

	            pxCust = pxCust + pxColorOpt;
	            pxcustom.setText(pxCust.toString() + " €");
	        }
	}
        
   }
    
   public void onClickReset(ActionEvent event)
   {
       pxtot = pxtot - pxColorOpt;
       pxCust = pxCust - pxColorOpt;
       pxtt.setText(pxtot.toString());
       pxColorOpt = 0;
       

       pxcustom.setText(pxCust.toString() + " €");
   }
    
    
      
}