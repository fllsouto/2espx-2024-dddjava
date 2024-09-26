package br.com.fiap.twoespx.libunclesampler.libunclesampler.api;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.twoespx.libunclesampler.libunclesampler.model.Discoverer;


@RestController
@RequestMapping(path = "/discoverer")
public class DiscovererController {
    
    @GetMapping("/all")
    public List<Discoverer> getAll() {
        return Collections.emptyList();        
    }
}
