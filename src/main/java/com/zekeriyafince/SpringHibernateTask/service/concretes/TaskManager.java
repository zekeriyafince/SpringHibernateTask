package com.zekeriyafince.SpringHibernateTask.service.concretes;

import com.zekeriyafince.SpringHibernateTask.dto.TaskUpdateDto;
import com.zekeriyafince.SpringHibernateTask.dto.TaskViewDto;
import com.zekeriyafince.SpringHibernateTask.entity.concretes.Task;
import com.zekeriyafince.SpringHibernateTask.repository.abstracts.TaskRepository;
import com.zekeriyafince.SpringHibernateTask.service.abstracts.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 28.07.2021 22:02
 */
@Service
public class TaskManager implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskManager(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    @Transactional
    public TaskViewDto updateTask(Long id, TaskUpdateDto taskUpdateDto) {
        Task task = taskRepository.getById(id);

        task.setDescription(taskUpdateDto.getDescription());
        task.setPriority(taskUpdateDto.getPriority());

        final Task updatedTask = taskRepository.save(task);

        return TaskViewDto.of(updatedTask);
    }

}
