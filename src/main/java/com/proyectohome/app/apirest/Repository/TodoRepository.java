package com.proyectohome.app.apirest.Repository;

import com.proyectohome.app.apirest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {

}
