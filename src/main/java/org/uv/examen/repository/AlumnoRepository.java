/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.examen.repository;

/**
 *
 * @author carte
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.uv.examen.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String>{

}

