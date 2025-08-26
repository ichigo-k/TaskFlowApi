package com.kephas.taskflowapi.Repositories;

import com.kephas.taskflowapi.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    Task getTaskById(UUID id);

//    void updateTaskById(UUID id, Task task);
}
