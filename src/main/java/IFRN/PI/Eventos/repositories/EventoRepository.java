package IFRN.PI.Eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import IFRN.PI.Eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
