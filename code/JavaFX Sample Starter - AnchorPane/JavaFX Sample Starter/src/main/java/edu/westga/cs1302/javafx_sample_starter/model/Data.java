package edu.westga.cs1302.javafx_sample_starter.model;

/** Stores information for creating a task.
 * 
 * @author Moe Holder
 * @version Fall 2025
 */

public class Data {
  
  private final String name;
  
  private String description;
  
  private final String priority;
  
  public Data(String name, String description, String priority) {
    this.name = name;
    this.description = description;
    this.priority = priority;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public String getPriority() {
    return this.priority;
  }
  
  @Override
  public String toString() {
    return this.name;
  }

}
