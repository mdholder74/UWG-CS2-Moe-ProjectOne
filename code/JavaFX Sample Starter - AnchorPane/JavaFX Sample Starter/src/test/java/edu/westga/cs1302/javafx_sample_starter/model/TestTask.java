package edu.westga.cs1302.javafx_sample_starter.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTask {

  @Test
  void testValidTaskCreation() {
    // Arrange
    String name = "Complete Project";
    String description = "Finish the JavaFX project by 9/29/25.";
    String priority = "High";
    
    // Act
    Task task = new Task(name, description, priority);
    
    // Assert
    String actualName = task.getName();
    String actualDescription = task.getDescription();
    String actualPriority = task.getPriority();
    
    assertEquals(name, actualName, "Task name should match the constructor input.");
    assertEquals(description, actualDescription, "Task description should match the constructor input.");
    assertEquals(priority, actualPriority, "Task priority should match the constructor input.");
  }
  
  @Test
  void testNullNameThrowsException() {
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      new Task(null, "Finish the JavaFX project by 9/29/25.", "High");
    });

  }
  
  @Test
  void testEmptyNameThrowsException() {
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      new Task("", "Finish the JavaFX project by 9/29/25.", "High");
    });

  }
  
  @Test
  void testNullDescriptionThrowsException() {
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      new Task("Complete Project", null, "High");
    });
  }
  
  @Test
  void testEmptyDescriptionThrowsException() {
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      new Task("Complete Project", "", "High");
    });
  }
  
  @Test
  void testNullPriorityThrowsException() {
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      new Task("Complete Project", "Finish the JavaFX project by 9/29/25.", null);
    });
  }
  
  @Test
  void testEmptyPriorityThrowsException() {
    // Act & Assert
    assertThrows(IllegalArgumentException.class, () -> {
      new Task("Complete Project", "Finish the JavaFX project by 9/29/25.", "");
    });
  }
  
  @Test
  void testToString() {
    fail("Not yet implemented");
  }

  @Test
  void testSetDescription() {
    fail("Not yet implemented");
  }

}
