package com.example.fullstack.AppController;


import com.example.fullstack.Model.Kunde;
import com.example.fullstack.Service.KundenService;
import com.example.fullstack.Service.RechnungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/Kunde")
@RestController
public class AppControllerKunde {

    private final KundenService kundenService;



    public AppControllerKunde(KundenService kundenService)
    {
    this.kundenService = kundenService;
    }

    @PostMapping
    public void addKunde (Kunde kunde)
    {
        kundenService.addKunde(kunde);
    }

    @GetMapping
    public List<Kunde> getAllKunden()
    {
    return kundenService.getAllKunde();
    }

    @DeleteMapping
    public void deleteKundeById(@PathVariable("id")UUID id)
    {
        kundenService.deleteKunde(id);
    }

}
