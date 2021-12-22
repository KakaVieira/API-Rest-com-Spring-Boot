package br.com.desktopdev.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desktopdev.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
