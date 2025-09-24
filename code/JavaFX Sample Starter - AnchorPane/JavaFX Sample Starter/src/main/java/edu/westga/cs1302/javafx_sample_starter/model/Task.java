package edu.westga.cs1302.javafx_sample_starter.model;

/** Stores information for creating a task.
 * 
 * @author Moe Holder
 * @version Fall 2025
 */

public class Task {
  
  private final String name;
  
  private String description;
  
  private final String priority;
  
/** Create a new task with the provided name, description, and priority.
 * @precondition name != null && description != null && priority != null
 * @postcondition getName() == name && getDescription() == description && getPriority() == priority
 * @param name
 * @param description
 * @param priority
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
  
  public void setDescription(String description) {
    if (description == null || description.isEmpty()) {
        throw new IllegalArgumentException("description must not be null or empty.");
    }
        this.description = description;
    }

}
