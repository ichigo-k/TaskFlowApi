package com.kephas.taskflowapi.Controllers;

import com.kephas.taskflowapi.Entity.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class TaskController {

    public List<Task> getAllTasks (){

    }
}
