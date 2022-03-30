package co.com.sofka.repository;

//import com.yoandypv.reactivestack.messages.domain.Message;
import co.com.sofka.domain.citasDTOReactiva;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.time.LocalDate;

public interface IcitasReactivaRepository extends ReactiveMongoRepository<citasDTOReactiva, String> {
    Flux<citasDTOReactiva> findByIdPaciente(String idPaciente);
    Flux<citasDTOReactiva> findByFechaReservaCita(LocalDate fecha);
}
