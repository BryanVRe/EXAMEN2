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

import org.uv.examen.entity.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, String>{

}