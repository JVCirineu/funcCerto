package com.projetoIntegradorFuncio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoIntegradorFuncio.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {

}
