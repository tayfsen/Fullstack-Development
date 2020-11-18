package com.example.fullstack.Service;


import com.example.fullstack.Model.Rechnung;
import com.example.fullstack.Repositorys.RepositoryRechnung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RechnungService {
    private RepositoryRechnung repositoryRechnung;


    @Autowired
    public RechnungService(RepositoryRechnung repositoryRechnung)
    {
        this.repositoryRechnung = repositoryRechnung;
    }

    public int addRechnung(Rechnung rechnung)
    {
        return repositoryRechnung.insertRechnung(rechnung);
    }

    public List<Rechnung> getAllRechnung()
    {
        return repositoryRechnung.selectAllRechnung();
    }

    public Optional<Rechnung> getRechnungById(UUID id)
    {
        return repositoryRechnung.selectRechnungById();
    }

    public int deleteRechnung(UUID id)
    {
        return repositoryRechnung.deleteById(id);
    }

    public int updateRechnungById(UUID id, Rechnung rechnungToUpdate) {
        return repositoryRechnung.updateRechnungById(id, rechnungToUpdate);
    }
}
