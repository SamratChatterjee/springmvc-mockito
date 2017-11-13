package com.teksystems.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teksystems.model.ToDo;

@Repository("toDoRepository")
@Component
public interface ToDoRepository extends JpaRepository<ToDo, Long>{

}
