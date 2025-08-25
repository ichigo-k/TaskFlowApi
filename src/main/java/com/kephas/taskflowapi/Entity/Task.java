package com.kephas.taskflowapi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "task_id", nullable=false, insertable = false)
    private UUID id;

    @Column(nullable = true)
    private String description;

    private TaskStatus status = TaskStatus.PENDING;

    private String tag;


    public Task() {
    }

    public Task(String description, TaskStatus status, String tag) {
        this.description = description;
        this.status = status;
        this.tag = tag;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
