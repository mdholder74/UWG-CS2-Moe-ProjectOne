package edu.westga.cs1302.javafx_sample_starter.model;

/** Stores information for creating a task.
 * 
 * 
 * @author Moe Holder
 * @version Fall 2025
 */
public class Task {
  
  private final String name;
  
  private String description;
  
  private final String priority;
  
  /** Create a new task with the name, description, and priority.
   * 
   * @precondition name != null && !name.isEmpty() && description != null && !description.isEmpty() &&
   *               priority != null && !priority.is Empty() 
   * @postcondition getName() == name && getDescription() == description && getPriority() == priority
   * 
   * @param name the name of the task
   * @param description the description of the task
   * @param priority the priority of the task
   */
  public Task(String name, String description, String priority) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("name must not be null or empty.");
    }
    
    if (description == null || description.isEmpty()) {
      throw new IllegalArgumentException("description must not be null or empty.");
    }
    
    if (priority == null || priority.isEmpty()) {
      throw new IllegalArgumentException("priority must not be null or empty.");
    }
    
    this.name = name;
    this.description = description;
    this.priority = priority;
  }

  /** Return the name of the task.
   * @precondition none
   * @postcondition none
   * 
   * @return the name of the task
   */
  public String getName() {
    return this.name;
  }
  
  /** Return the description of the task.
   * @precondition none
   * @postcondition none
   * 
   * @return the description of the task
   */
  public String getDescription() {
    return this.description;
  }
  
  /** Return the priority of the task.
   * @precondition none
   * @postcondition none
   * 
   * @return the priority of the task
   */
  public String getPriority() {
    return this.priority;
  }
  
  /** Return a string representation of the task name.
   * @precondition none
   * @postcondition none
   * 
   * @return a string representation of the task name
   */
  @Override
  public String toString() {
    return this.name;
  }
  
  /** Set the description of the task.
   * 
   * @precondition description != null && !description.isEmpty()
   * @postcondition getDescription() == description
   * 
   * @param description the new description of the task
   */
  public void setDescription(String description) {
    if (description == null || description.isEmpty()) {
        throw new IllegalArgumentException("description must not be null or empty.");
    }
        this.description = description;
    }

}
