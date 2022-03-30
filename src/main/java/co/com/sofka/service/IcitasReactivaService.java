package co.com.sofka.service;

//import com.yoandypv.reactivestack.messages.domain.Message;
import co.com.sofka.domain.citasDTOReactiva;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface IcitasReactivaService {
    Mono<citasDTOReactiva> save(citasDTOReactiva citasDTOReactiva);

    Mono<citasDTOReactiva> delete(String id);

    Mono<citasDTOReactiva> update(String id, citasDTOReactiva citasDTOReactiva);

    Flux<citasDTOReactiva> findByIdPaciente(String idPaciente);

    Flux<citasDTOReactiva> findAll();

    Mono<citasDTOReactiva> findById(String id);

    Flux<citasDTOReactiva> cancelCita(String id);

    Flux<citasDTOReactiva> agendCita(String id);

    Flux<citasDTOReactiva> consultaCitaPorFechaYHora(LocalDate fecha, String hora);

    Flux<citasDTOReactiva> consultaMedico(String id);

    Flux<citasDTOReactiva> consultaPYT(String id);
}
