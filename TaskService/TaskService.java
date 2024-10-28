/*****************************************************
 * Name: 	Sean Born
 * Course: 	CS 320 
 * Date: 	9/29/2024
 * Description: Maintains task information (updates, deletes, and adds)
 *****************************************************/

package Task;

import java.util.ArrayList;

public class TaskService {
	// Start with an ArrayList of contacts to hold the list of tasks
	public ArrayList<Task> taskList = new ArrayList<Task>();

	// Display full list of contacts
	public void displayTaskList() {
		for (int counter = 0; counter < taskList.size(); counter++) {
			System.out.println("\t Task ID: " + taskList.get(counter).getTaskID());
			System.out.println("\t Task Name: " + taskList.get(counter).getTaskName());
			System.out.println("\t Task Description: " + taskList.get(counter).getTaskDesc());
		}
	}

	// Adds new task using the Task constructor
	public void addTask(String taskName, String taskDesc) {
		// Create new task
		Task task = new Task(taskName, taskDesc);
		taskList.add(task);
	}

	// Using Task ID, return task object
	// If Task ID is not found, return task object with default values
	public Task getTask(String taskID) {
		Task task = new Task(null, null);
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().contentEquals(taskID)) {
				task = taskList.get(counter);
			}
		}
		return task;
	}

	// Delete task
	public void deleteTask(String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.remove(counter);
				break;
			}
			if (counter == taskList.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
	}

	// Update task name
	public void updateTaskName(String updatedString, String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.get(counter).setTaskName(updatedString);
				break;
			}
			if (counter == taskList.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
	}

	// Update task description.
	public void updateTaskDesc(String updatedString, String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.get(counter).setTaskDesc(updatedString);
				break;
			}
			if (counter == taskList.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
	}
}
