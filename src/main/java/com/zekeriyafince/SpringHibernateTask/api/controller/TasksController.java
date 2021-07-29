package com.zekeriyafince.SpringHibernateTask.api.controller;

import com.zekeriyafince.SpringHibernateTask.dto.TaskUpdateDto;
import com.zekeriyafince.SpringHibernateTask.dto.TaskViewDto;
import com.zekeriyafince.SpringHibernateTask.service.abstracts.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 28.07.2021 21:53
 */
@RestController
@RequestMapping("/api")
public class TasksController {

    private final TaskService taskService;

    @Autowired
    public TasksController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PutMapping("tasks/{id}")
    public ResponseEntity<TaskViewDto> updateUser(@PathVariable("id") Long id, @RequestBody TaskUpdateDto taskUpdateDto) {
        final TaskViewDto task = taskService.updateTask(id, taskUpdateDto);
        return ResponseEntity.ok(task);
    }

}
