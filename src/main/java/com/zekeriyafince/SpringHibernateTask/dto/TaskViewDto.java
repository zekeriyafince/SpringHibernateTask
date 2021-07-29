package com.zekeriyafince.SpringHibernateTask.dto;

import com.zekeriyafince.SpringHibernateTask.entity.concretes.Task;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 29.07.2021 08:11:42
 */
@Getter
@AllArgsConstructor
public final class TaskViewDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String description;

    private final Long priority;

    public static TaskViewDto of(Task task) {
        return new TaskViewDto(task.getDescription(), task.getPriority());
    }

}
