package biancabrandao.repositories;

import org.springframework.data.repository.CrudRepository;

import biancabrandao.models.Jogo;

public interface JogoRepository extends CrudRepository<Jogo, Integer> {
    
}