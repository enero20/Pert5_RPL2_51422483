/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_51422483.repository;

import com.mycompany.pert5_51422483.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rozin
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long>{
    
}
