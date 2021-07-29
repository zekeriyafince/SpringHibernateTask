package com.zekeriyafince.SpringHibernateTask.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 29.07.2021 13:01:35
 */
@Getter
@Setter
@AllArgsConstructor
public class GenericResponse {

    private String message;
    private int status;
}
