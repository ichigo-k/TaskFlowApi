package com.kephas.taskflowapi.Servicies;

import com.kephas.taskflowapi.Entities.Task;
import com.kephas.taskflowapi.Repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }


    public String insertTask(Task task) {
        taskRepository.save(task);
        return "Task added successfully ...";
    }

    public Task getOneService (UUID id){
        return taskRepository.getTaskById(id);
    }

    public String updateTask(UUID id, Task task) {
        Task existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setPriority(task.getPriority());
        existingTask.setStatus(task.getStatus());
        existingTask.setTags(task.getTags());

        taskRepository.save(existingTask);

        return "Update was successfully ...";
    }

    public String deleteTask(UUID id) {
        taskRepository.deleteById(id);
        return "Task deleted successfully ...";
    }
}
