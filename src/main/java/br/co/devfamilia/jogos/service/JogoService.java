package br.co.devfamilia.jogos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.co.devfamilia.jogos.entity.Jogo;
import br.co.devfamilia.jogos.reporsitory.JogoRepository;

@Service
public class JogoService {
	
	@Autowired
	private JogoRepository jogoRepository;
	
	public Jogo createJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	public List<Jogo> getAll(){
		return jogoRepository.findAll();
	}
	
	public Jogo getById(Integer id){
		return jogoRepository.findById(id).get();
	}
	
	public Jogo updateJogo(Jogo jogo) {
		Jogo jogoBd = jogoRepository.getById(jogo.getId());
		jogoBd.setNome(jogo.getNome());
		jogoBd.setConsole(jogo.getConsole());
		jogoBd.setDescricao(jogo.getDescricao());
		return jogoRepository.save(jogoBd);
	}
	
	public void deleteById(Integer id) {
		jogoRepository.deleteById(id);
	}

}
