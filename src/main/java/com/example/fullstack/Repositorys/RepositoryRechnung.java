package com.example.fullstack.Repositorys;

import com.example.fullstack.Model.Rechnung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RepositoryRechnung extends JpaRepository<Rechnung, Long> {

    int insertRechnung(UUID id, Rechnung rechnung);

    default int insertRechnung(Rechnung rechnung)

    {
        UUID id = UUID.randomUUID();

        return insertRechnung(id, rechnung);
    }

    List<Rechnung> selectAllRechnung();
    Optional<Rechnung> selectRechnungById();

    int deleteById(UUID id);

}
