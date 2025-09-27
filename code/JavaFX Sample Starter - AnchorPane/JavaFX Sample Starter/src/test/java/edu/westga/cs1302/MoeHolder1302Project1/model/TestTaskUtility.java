package edu.westga.cs1302.MoeHolder1302Project1.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestTaskUtility {

  @Test
  void testPriorityCountValidInput() {
    // Arrange
    ArrayList<Task> tasksList = new ArrayList<Task>();
    tasksList.add(new Task("Task Boxing", "Running", "Low"));
    tasksList.add(new Task("Task Discrete Math", "Truth Table", "Medium"));
    tasksList.add(new Task("Task Exam", "Study", "High"));
    tasksList.add(new Task("Task Project", "Finish It", "High"));
    
    // Act & Assert
    assertEquals(2, TaskUtility.getPriorityCount(tasksList, "High"));
    assertEquals(1, TaskUtility.getPriorityCount(tasksList, "Medium"));
    assertEquals(1, TaskUtility.getPriorityCount(tasksList, "Low"));

    
  }
  
  @Test
  void testPriorityCountTaskListNullListThrowsException() {
    
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      TaskUtility.getPriorityCount(null, "High");
      });
    }
  
  @Test
  void testPriorityCountEmptyListThrowException() {
    // Arrange
    ArrayList<Task> tasksList = new ArrayList<Task>();
    
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      TaskUtility.getPriorityCount(tasksList, "");
      });
    }


  
  @Test
  void testPriorityCountNullListThrowsException() {
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      TaskUtility.getPriorityCount(null, "Low");
      });
    }
   
  

}
