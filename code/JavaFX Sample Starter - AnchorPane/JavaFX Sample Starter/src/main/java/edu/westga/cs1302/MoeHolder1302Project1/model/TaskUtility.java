package edu.westga.cs1302.MoeHolder1302Project1.model;

import java.util.ArrayList;

/** Utility class for counting the task priorities.
 * 
 * @author Moe Holder
 * @version Fall 2025
 */

public class TaskUtility {
  
  /** Return the number of tasks in the list based on the priority inserted.
   * 
   * @precondition tasks != null && priority != null && !priority.isEmpty()
   * @postcondition none
   * 
   * @param tasksList the list of tasks to search
   * @param priority the priority to count
   * @return the number of tasks in the list with the given priority
   */
  public static int getPriorityCount(ArrayList<Task> tasksList, String priority) {
    if (tasksList == null) {
      throw new IllegalArgumentException("tasks must not be null.");
    }
    
    if (priority == null || priority.isEmpty()) {
      throw new IllegalArgumentException("priority must not be null or empty.");
    }
    
    int count = 0;
    
    for (Task task : tasksList) {
      if (task.getPriority().equals(priority)) {
        count++;
      }
    }
    return count;
  }

}
