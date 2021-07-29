package com.zekeriyafince.SpringHibernateTask.dto;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 29.07.2021 08:12:42
 */
@Data
public class TaskUpdateDto implements Serializable {

    private String description;

    private Long priority;
}
