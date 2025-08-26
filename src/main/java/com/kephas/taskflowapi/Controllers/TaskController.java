package com.kephas.taskflowapi.Controllers;

import com.kephas.taskflowapi.Entities.Task;
import com.kephas.taskflowapi.Servicies.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks (){
        return taskService.getAllTasks() ;
    }

    @PostMapping("/tasks")
    public String createTask(@RequestBody Task task){
        return taskService.insertTask(task);
    }

    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable UUID id){
        return taskService.getOneService(id);
    }

    @PutMapping("/tasks/{id}")
    public String updateTask(@PathVariable UUID id, @RequestBody Task task){
        return taskService.updateTask(id, task );
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable UUID id){
        return taskService.deleteTask(id);
    }
}
