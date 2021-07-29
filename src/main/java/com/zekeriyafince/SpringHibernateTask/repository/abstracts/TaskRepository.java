package com.zekeriyafince.SpringHibernateTask.repository.abstracts;

import com.zekeriyafince.SpringHibernateTask.entity.concretes.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 28.07.2021 22:00
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    boolean existsByDescription(String description);
}
