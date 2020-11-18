package com.example.fullstack.Service;

import com.example.fullstack.Model.Kunde;
import com.example.fullstack.Model.Rechnung;
import com.example.fullstack.Repositorys.RepositoryKunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class KundenService {

    private RepositoryKunde repositoryKunde;

    @Autowired
    public KundenService(RepositoryKunde repositoryKunde)
    {
    this.repositoryKunde = repositoryKunde;
    }

    public int addKunde(Kunde kunde)
    {
    return repositoryKunde.insertKunde(kunde);
    }

    public List<Kunde> getAllKunde()
    {
    return repositoryKunde.selectAllKunde();
    }

    public Optional<Kunde> getKundeById(UUID id)
    {
        return repositoryKunde.selectKundeById();
    }

    public int deleteKunde (UUID id)
    {
        return repositoryKunde.deleteById(id);
    }

    public int updateKundeById(UUID id, Kunde kundeToUpdate) {
        return repositoryKunde.updateRechnungById(id, kundeToUpdate);
    }

}
