package br.co.devfamilia.jogos.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.co.devfamilia.jogos.entity.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Integer>{

}
