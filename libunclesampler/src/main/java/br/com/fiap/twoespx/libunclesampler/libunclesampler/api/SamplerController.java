package br.com.fiap.twoespx.libunclesampler.libunclesampler.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sample")
public class SamplerController {
    
    @GetMapping(path = "/health")
    public String health() {
        return "up";
    }
}
