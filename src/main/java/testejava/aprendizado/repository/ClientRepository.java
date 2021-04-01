package testejava.aprendizado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testejava.aprendizado.entity.Funcionario;
@Repository
public interface ClientRepository extends JpaRepository<Funcionario, Double>{
        
}
