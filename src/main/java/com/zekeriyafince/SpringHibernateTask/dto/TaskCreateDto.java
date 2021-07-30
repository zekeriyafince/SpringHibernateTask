package com.zekeriyafince.SpringHibernateTask.dto;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 30.07.2021 23:36
 */
@Data
public class TaskCreateDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    private Long priority;
}
