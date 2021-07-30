package com.zekeriyafince.SpringHibernateTask.service.abstracts;

import com.zekeriyafince.SpringHibernateTask.core.DataResult;
import com.zekeriyafince.SpringHibernateTask.dto.TaskCreateDto;
import com.zekeriyafince.SpringHibernateTask.dto.TaskUpdateDto;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 28.07.2021 22:01
 */
public interface TaskService {

    DataResult<?> updateTask(Long id, TaskUpdateDto taskUpdateDto);

    DataResult<?> getTaskById(Long id);

    DataResult<?> getTasks();

    DataResult<?> createTask(TaskCreateDto taskCreateDto);
}
