package com.arthur.crudspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
//@Table(name = "cursos")
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  //@Column(name = "nome")
  @Column(length = 200, nullable = false)
  private String name;

  @Column(length = 10, nullable = false)
  private String category;

}
