package com.example.fullstack.Repositorys;

import com.example.fullstack.Model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RepositoryKunde extends JpaRepository<Kunde,Long> {
    int insertKunde(UUID id, Kunde kunde);
    default int insertKunde(Kunde kunde)
    {
    UUID id =UUID.randomUUID();
    return insertKunde(id, kunde);
    }

    List<Kunde> selectAllKunde();
    Optional<Kunde> selectKundeById();

    int deleteById(UUID id);

    int updateRechnungById(UUID id, Kunde kundeToUpdate);
}
