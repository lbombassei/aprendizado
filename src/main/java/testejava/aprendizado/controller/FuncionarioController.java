package testejava.aprendizado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import testejava.aprendizado.entity.Funcionario;
import testejava.aprendizado.services.Services;

// import ch.qos.logback.core.net.SyslogOutputStream;
// Pegando a rota FUNCIONARIO para termos uma resposta do servidor
@RequestMapping("/funcionario")
@RestController()
public class FuncionarioController {
    // Definindo que essa classe é um controller!
    @Autowired
    //Importando a classe Services para o controller mandar as informações necessárias para realizar a busca
    Services service;

    // Caso a rota venha vazia depois do /funcionario ele executa esse metodo para retornar um JSON com a lista de funcionarios completa
    @GetMapping()
    public List<Funcionario> getTchau(){
        
        return service.getFuncionarios();
    
    }

    // Caso recebermos um id após o /funcionario, por ex: "/funcionario/99800543", ele fará a busca por ID especificamente, trazendo apenas as infomações referentes aquele ID
    @GetMapping("{id}")
    public Funcionario getClientById(@PathVariable Double id){
        // Retorna o método da classe Service getClientById.
        return service.getClientById(id);

        // return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/error", produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView erro(@RequestParam(name="name", required=false, defaultValue="Erro") String name, Model model){
        ModelAndView a = new ModelAndView("error");
        //  model.addAttribute("name", name);
        a.addObject("name", "erro");

         return a;
    }
}
