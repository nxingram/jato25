package alimenti.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import alimenti.entities.Alimento;
/**
 * https://github.com/maboglia/CorsoJava/blob/master/appunti/070_spring_core_boot.md
 * ->> Annotazioni
 */
public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {
	
	List<Alimento> findByCategoria(String categoria); 

}
