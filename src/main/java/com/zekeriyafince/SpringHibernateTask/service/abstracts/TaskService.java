package com.zekeriyafince.SpringHibernateTask.service.abstracts;

import com.zekeriyafince.SpringHibernateTask.dto.TaskUpdateDto;
import com.zekeriyafince.SpringHibernateTask.dto.TaskViewDto;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 28.07.2021 22:01
 */
public interface TaskService {

    TaskViewDto updateTask(Long id, TaskUpdateDto taskUpdateDto);
}
