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
  private TextArea selectedTaskTextArea;
  
  @FXML
  private TextField selectedPriorityTextField;
  
  /**
   * This method is called when the user clicks the "Add Task" button.
   * It creates a new Task object using the information entered by the user
   * and adds it to the ListView.
   * 
   * @param event the ActionEvent that triggered this method
   */
  @FXML
  void addTaskButton(ActionEvent event) {
    String taskName = this.nameTextField.getText();// get the name from the text field
    String taskDescription = this.descriptionTextArea.getText();// get the description from the text area
    String taskPriority = this.priorityComboBox.getValue();// get the priority from the combo box
    
    Task task = new Task(taskName, taskDescription, taskPriority);// create a new task object using the name, description, and priority from the user input
    
    this.taskListView.getItems().add(task);

  }
  
  @FXML
  void updateDescriptionButton(ActionEvent event) {
    
    Task selectedTask = this.taskListView.getSelectionModel().getSelectedItem();// gets the currently selected task from the ListView
    String updatedDescription = this.selectedTaskTextArea.getText();// gets the updated description from the TextArea

    if (selectedTask == null) {
        throw new IllegalArgumentException("Invalid: No task selected");
    }

    selectedTask.setDescription(updatedDescription);// updates the description of the selected task with the new description entered by the user
    this.taskListView.refresh();

  }
  
  @FXML
  void removeTaskButton(ActionEvent event) {
    Task selectedTask = this.taskListView.getSelectionModel().getSelectedItem();
    
    if (selectedTask == null) {
      throw new IllegalArgumentException("Invalid: No task selected");
  }

    this.taskListView.getItems().remove(selectedTask);

  }
    
    /**
     * Perform any needed initialization of UI components and underlying objects.
     */
  // This method is automatically called after all @FXML UI components are loaded.
    public void initialize() {
      this.priorityComboBox.getItems().addAll("Low", "Medium", "High");// fills the combo box with priority options the user can select from
      
      this.taskListView.getSelectionModel().selectedItemProperty().addListener((observable, oldTask, newTask) -> {// adds a listener to the ListView that listens for changes in the selected item
        if (newTask != null) {
          this.selectedTaskTextArea.setText(newTask.getDescription() );
          this.selectedPriorityTextField.setText(newTask.getPriority());
        } else {
          this.selectedTaskTextArea.clear();
          this.selectedPriorityTextField.clear();
        }
      });      
    	
    } 
}
