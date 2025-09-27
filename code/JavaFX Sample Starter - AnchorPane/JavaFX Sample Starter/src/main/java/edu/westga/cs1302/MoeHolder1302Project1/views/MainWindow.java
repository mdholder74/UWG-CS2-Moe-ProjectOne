package edu.westga.cs1302.MoeHolder1302Project1.views;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import edu.westga.cs1302.MoeHolder1302Project1.model.Task;
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
  private Label highCountLabel;

  @FXML
  private Label lowCountLabel;

  @FXML
  private Label mediumCountLabel;

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
   * It creates a new Task object using the information entered by the user.
   * 
   * @precondition none
   * @postcondition a new Task is added to the ListView and input fields are cleared
   * 
   * @param event the ActionEvent that triggered this method when the button is clicked
   */
  @FXML
  void addTaskButton(ActionEvent event) {
    String taskName = this.nameTextField.getText();
    String taskDescription = this.descriptionTextArea.getText();
    String taskPriority = this.priorityComboBox.getValue();
    
    Task task = new Task(taskName, taskDescription, taskPriority);
    
    this.taskListView.getItems().add(task);
    this.nameTextField.clear();
    this.descriptionTextArea.clear();
    this.priorityComboBox.getSelectionModel().clearSelection();

  }
  
  /**
   * This method is called when the user selects a task in the ListView.
   * 
   * @precondition none
   * @postcondition the selectedTaskTextArea displays the description of the selected task 
   *               the selectedPriorityTextField displays the priority of the selected task 
   *               the fields are cleared if no task is selected
   * 
   * @param event the MouseEvent once the user clicks on a task in the ListView it
   * triggers this method
   */
  @FXML
  void taskSelection(MouseEvent event) {
    Task selectedTask = this.taskListView.getSelectionModel().getSelectedItem();
    
    if (selectedTask != null) {
      this.selectedTaskTextArea.setText(selectedTask.getDescription());
      this.selectedPriorityTextField.setText(selectedTask.getPriority());
    } else {
      this.selectedTaskTextArea.clear();
      this.selectedPriorityTextField.clear();
    }

  }
  
  /**
   * This method is called when the user clicks the "Update Description" button.
   * 
   * @precondition none
   * @postcondition the description of the selected task is updated in the ListView from the
   *              text entered in the selectedTaskTextArea
   * 
   * @param event the ActionEvent that triggered this method when the button is clicked
   */
  @FXML
  void updateDescriptionButton(ActionEvent event) {
    
    Task selectedTask = this.taskListView.getSelectionModel().getSelectedItem();
    String updatedDescription = this.selectedTaskTextArea.getText();

    if (selectedTask == null) {
        throw new IllegalArgumentException("Invalid: No task selected");
    }

    selectedTask.setDescription(updatedDescription);
    this.taskListView.refresh();

  }
  
  /**
   * This method is called when the user clicks the "Remove Task" button.
   * 
   * @precondition none
   * @postcondition the selected task is removed from the ListView
   * 
   * @param event the ActionEvent that triggered this method when the button is clicked
   */
  @FXML
  void removeTaskButton(ActionEvent event) {
    Task selectedTask = this.taskListView.getSelectionModel().getSelectedItem();
    
    if (selectedTask == null) {
      throw new IllegalArgumentException("Invalid: No task selected");
  }

    this.taskListView.getItems().remove(selectedTask);

  }
  
  /**
   * This method is called when the user clicks the "Priority Counts" button.
   * 
   * @precondition none
   * @postcondition the lowCountLabel, mediumCountLabel, and highCountLabel are updated
   *               to show the number of tasks for each priority level
   * 
   * @param event the ActionEvent that triggered this method when the button is clicked
   */
  @FXML
  void priorityCountsButton(ActionEvent event) {
    int lowCount = 0;
    int mediumCount = 0;
    int highCount = 0;

    for (Task task : this.taskListView.getItems()) {
      switch (task.getPriority()) {
      case "Low":
          lowCount++;
          break;
      case "Medium":
          mediumCount++;
          break;
      case "High":
          highCount++;
          break;
          default: break;
          
      }
    }
    
    this.lowCountLabel.setText("Low: " + lowCount);
    this.mediumCountLabel.setText("Medium: " + mediumCount);
    this.highCountLabel.setText("High: " + highCount);

  }
  
    /**
     * This method is called to initialize the controller and set up the UI components.
     *
     * @precondition none
     * @postcondition the priorityComboBox is populated with priority options ("Low", "Medium", "High")
     */
    @FXML
    public void initialize() {
      this.priorityComboBox.getItems().addAll("Low", "Medium", "High");
    	
    } 
}
