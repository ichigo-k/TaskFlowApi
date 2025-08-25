package com.kephas.taskflowapi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.UUID;

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "task_id", nullable=false, insertable = false)
    private UUID id;

    @Column(nullable = true)
    private String description;

    private String Title;

    private TaskStatus status = TaskStatus.PENDING;

    private TaskPriority priority;


    private List<String> tags;


    public Task() {
    }

    public Task(String title, String description, TaskPriority priority, List<String> tags) {
        Title = title;
        this.description = description;
        this.priority = priority;
        this.tags = tags;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public List<String> getTag() {
        return tags;
    }

    public void setTag(List<String> tag) {
        this.tags = tag;
    }
}
