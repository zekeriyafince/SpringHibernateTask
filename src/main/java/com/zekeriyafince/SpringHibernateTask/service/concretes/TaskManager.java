package com.zekeriyafince.SpringHibernateTask.service.concretes;

import com.zekeriyafince.SpringHibernateTask.core.DataResult;
import com.zekeriyafince.SpringHibernateTask.core.GenericResponse;
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
    public DataResult<?> updateTask(Long id, TaskUpdateDto taskUpdateDto) {
        boolean isExistTask = this.taskRepository.existsById(id);
        if (!isExistTask) {
            return new DataResult<GenericResponse>(new GenericResponse("Cannot find task with given id", 404));
        }

        if (taskUpdateDto.getDescription() == null || taskUpdateDto.getPriority() == null) {
            return new DataResult<GenericResponse>(new GenericResponse("Task description is required", 400));
        }
        Task task = taskRepository.getById(id);

        task.setDescription(taskUpdateDto.getDescription());
        task.setPriority(taskUpdateDto.getPriority());

        final Task updatedTask = taskRepository.save(task);

        return new DataResult<TaskViewDto>(TaskViewDto.of(updatedTask));
    }

    @Override
    public DataResult<?> getTaskById(Long id) {
        boolean isExistTask = this.taskRepository.existsById(id);
        if (!isExistTask) {
            return new DataResult<GenericResponse>(new GenericResponse("Cannot find task with given id", 404));
        }
        Task task = taskRepository.getById(id);

        return new DataResult<TaskViewDto>(TaskViewDto.of(task));
    }

}
