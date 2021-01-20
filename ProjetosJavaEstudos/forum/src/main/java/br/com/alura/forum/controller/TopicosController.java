package br.com.alura.forum.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import br.com.alura.forum.controller.dto.DetalhesDoTopicoDto;
import br.com.alura.forum.controller.form.AtualizaoTopicoForm;
import br.com.alura.forum.controller.form.TopicoForm;
import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.repository.TopicoRepository;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	@Autowired
	private TopicoRepository topicoRepository;

	@Autowired
	private CursoRepository cursoRepository;
	@GetMapping
	public List<TopicoDto> lista(String nomeCurso) {
        if(nomeCurso == null){
			List<Topico> topicos = topicoRepository.findAll();

			return TopicoDto.converter(topicos);
		}else {
			List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);

			return TopicoDto.converter(topicos);
		}
	}

	@PostMapping
	@Transactional
	public ResponseEntity<TopicoDto> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder){
            Topico topico = form.converter(cursoRepository);
            topicoRepository.save(topico);

            URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
            return ResponseEntity.created(uri).body(new TopicoDto(topico));
	}

	@GetMapping("/{id}")
	@Transactional
	public ResponseEntity detalhar(@PathVariable Long id){
       Optional<Topico> topico = topicoRepository.findById(id);
       if(topico.isPresent()){
		   return ResponseEntity.ok(new DetalhesDoTopicoDto(topico.get()));
	   }
      return ResponseEntity.notFound().build();
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<TopicoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizaoTopicoForm form, UriComponentsBuilder uriBuilder){
      Topico topico = form.atualizar(id, topicoRepository);
	  return ResponseEntity.ok(new TopicoDto(topico));
	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id){
     topicoRepository.deleteById(id);
      return ResponseEntity.ok().build();
	}

}
