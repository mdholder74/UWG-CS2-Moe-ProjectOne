package edu.westga.cs1302.javafx_sample_starter.views;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

/**
 * Controller class for drawing various things to our canvas window.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class MainWindow {
  
  @FXML
  private TextArea descriptionTextArea;

  @FXML
  private TextField nameTextField;

  @FXML
  private ComboBox<?> priorityComboBox;

  @FXML
  private ListView<?> taskListView;

  @FXML
  void addTaskButton(ActionEvent event) {

  }
    
    /**
     * Perform any needed initialization of UI components and underlying objects.
     */
    public void initialize() {
    	
    }
}
