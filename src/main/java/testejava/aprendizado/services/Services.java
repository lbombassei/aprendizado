package testejava.aprendizado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import testejava.aprendizado.entity.Funcionario;
import testejava.aprendizado.repository.ClientRepository;

@Service
public class Services {
    @Autowired
    ClientRepository repository;

    public List<Funcionario> getFuncionarios(){
        return repository.findAll();
    }
    
    public Funcionario getClientById(Double id) {
        Optional<Funcionario> op = repository.findById(id);

        return op.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found"));

    }
}
