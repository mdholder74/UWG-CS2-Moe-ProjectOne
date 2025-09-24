package edu.westga.cs1302.javafx_sample_starter.views;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import edu.westga.cs1302.javafx_sample_starter.model.Task;
import javafx.event.ActionEvent;

/**
 * Controller class for drawing various things to our canvas window.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class MainWindow {
  
  // Connects the UI components in the FXML file to fields in this class
  @FXML
  private TextArea descriptionTextArea;

  @FXML
  private TextField nameTextField;

  @FXML
  private ComboBox<String> priorityComboBox;

  @FXML
  private ListView<Task> taskListView;

  @FXML
  void addTaskButton(ActionEvent event) {
    String taskName = this.nameTextField.getText();// get the name from the text field
    String taskDescription = this.descriptionTextArea.getText();// get the description from the text area
    String taskPriority = this.priorityComboBox.getValue();// get the priority from the combo box
    
    Task task = new Task(taskName, taskDescription, taskPriority);// create a new task object using the name, description, and priority from the user input
    
    this.taskListView.getItems().add(task);

  }
    
    /**
     * Perform any needed initialization of UI components and underlying objects.
     */
    public void initialize() {
    	
    }
}
