package com.proyectohome.app.apirest.Controller;

import com.proyectohome.app.apirest.Model.Task;
import com.proyectohome.app.apirest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping(value = "/")

    public String holaMun(){
        return "Hola Mundo";
    }
    @GetMapping(value = "/tasks")
    public List<Task> getTask(){
        return todoRepository.findAll();
    }
    @PostMapping(value = "/savetasks")
    public String saveTask(@RequestBody Task task){
        todoRepository.save(task);
        return "Saved Task";
    }
    @PutMapping(value = "/update/{id}")
        public String updateTask(@PathVariable long id, @RequestBody Task task){
            Task updatedTask =todoRepository.findById(id).get();
            updatedTask.setTitulo(task.getTitulo());
            updatedTask.setDescripcion(task.getDescripcion());
        todoRepository.save(updatedTask);
        return " Tarea Actualizada";

        }
        @DeleteMapping(value = "/delete/{id}")
        public String deleteTask(@PathVariable long id){
            Task deleteTask = todoRepository.findById(id).get();
            todoRepository.delete(deleteTask);
            return "Tarea Eliminada";

        }


}
