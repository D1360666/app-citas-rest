package co.com.sofka;

import co.com.sofka.domain.citasDTOReactiva;
import co.com.sofka.service.citasReactivaServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class ApplicationTests {
	@Autowired
	citasReactivaServiceImpl citasReactivaService;

	@Test
	void contextLoads() {
		Mono<String> a = citasReactivaService.buscarUno();
			StepVerifier.create(a).expectNext("Pedro").verifyComplete();

	}
	@Test
	void testFindAll(){
		Flux<citasDTOReactiva> a =citasReactivaService.findAll();
		StepVerifier.create(a).expectComplete();
	}
	@Test
	void testFindById(){
		Mono<citasDTOReactiva> a =citasReactivaService.findById("20");
		StepVerifier.create(a).expectComplete();
	}

}
