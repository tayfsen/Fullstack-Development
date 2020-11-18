package com.example.fullstack.AppController;


import com.example.fullstack.Model.Rechnung;
import com.example.fullstack.Service.RechnungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v2/rechnung")
@RestController
public class AppControllerRechnung {

    private final RechnungService rechnungService;

    @Autowired
    public AppControllerRechnung(RechnungService rechnungService)
    {
    this.rechnungService = rechnungService;
    }

    @PostMapping
    public void addRechnung (Rechnung rechnung)
    {
        rechnungService.addRechnung(rechnung);
    }

    @GetMapping
    public List<Rechnung> getAllRechnung()
    {
        return  rechnungService.getAllRechnung();
    }

    @DeleteMapping
    public void deleteRechnungById(@PathVariable("id") UUID id)
    {
        rechnungService.deleteRechnung(id);
    }

}
