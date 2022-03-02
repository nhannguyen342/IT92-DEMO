package com.ntn.bmiapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtWeight;
    @FXML private TextField txtHeight;
    @FXML private Label lbResult;
    
    public void bmiHandler(ActionEvent event)
    {
        Double height = Double.parseDouble(this.txtHeight.getText());
        Double weight = Double.parseDouble(this.txtWeight.getText());
        Double bmi = weight / Math.pow(height, 2);
        
        if (bmi >= 18.5)
        {
            this.lbResult.setText("Gầy");
        }else if (bmi < 25)
                {
                    this.lbResult.setText("Bình Thường");
                }    
            else
            {
                this.lbResult.setText("Béo");
            }
        
    }
    

}
