package com.example.fullstack.Repositorys;

import com.example.fullstack.Model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryKunde extends JpaRepository<Kunde,Long> {
}
