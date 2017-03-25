package edu.infsci2560;

import edu.infsci2560.models.OldNba;

import edu.infsci2560.repositories.NbaRepository;

import edu.infsci2560.models.SlamDunk;
import edu.infsci2560.models.SlamDunk.SlamDunkPlayer;
import edu.infsci2560.repositories.SlamDunkRepository;

import edu.infsci2560.models.Crossover;
import edu.infsci2560.models.Crossover.CrossoverPlayer;
import edu.infsci2560.repositories.CrossoverRepository;

import edu.infsci2560.models.FinalShoot;
import edu.infsci2560.models.FinalShoot.FinalShootPlayer;
import edu.infsci2560.repositories.FinalShootRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        NbaRepository nbaRepository = ctx.getBean(NbaRepository.class);
        nbaRepository.save(new OldNba(1L, "SlamDunk", "Old_NBA_Stars", "URL Links:xxxxxxxxxxxxxx"));
        nbaRepository.save(new OldNba(2L, "Footwork", "Kobe_Bryant_2016", "https://www.youtube.com/watch?v=rDcHUyYhRHM"));
        nbaRepository.save(new OldNba(3L, "Crossover", "Tracy_McGrady_2013", "https://www.youtube.com/watch?v=DHrBXuJuL2w"));
        nbaRepository.save(new OldNba(4L, "Final", "Tracy_McGrady_2013", "https://www.youtube.com/watch?v=nfurCV1FDpM"));
        
        SlamDunkRepository slamDunkRepository = ctx.getBean(SlamDunkRepository.class);
        slamDunkRepository.save(new SlamDunk(1L, SlamDunkPlayer.Kobe_Bryant_2016, "https://www.youtube.com/watch?v=UqVibdD3UqA"));
        slamDunkRepository.save(new SlamDunk(2L, SlamDunkPlayer.Tracy_McGrady_2013, "https://www.youtube.com/watch?v=cWKaCiIhG0w"));
        slamDunkRepository.save(new SlamDunk(3L, SlamDunkPlayer.Shaquille_ONeal_2011, "https://www.youtube.com/watch?v=O_xZyNihY2M"));
        
        
        CrossoverRepository crossOverRepository = ctx.getBean(CrossoverRepository.class);
        crossOverRepository.save(new Crossover(1L, CrossoverPlayer.Allen_Iverson_2011, "https://www.youtube.com/watch?v=afQlPAIfVjc"));
        crossOverRepository.save(new Crossover(2L, CrossoverPlayer.Kobe_Bryant_2016, "https://www.youtube.com/watch?v=rtdFJvGF3UA"));
        crossOverRepository.save(new Crossover(3L, CrossoverPlayer.Tracy_McGrady_2013, "https://www.youtube.com/watch?v=DHrBXuJuL2w"));
        crossOverRepository.save(new Crossover(4L, CrossoverPlayer.Michael_Jordan_2003, "https://www.youtube.com/watch?v=0S6mh7RYcqc"));
        
        FinalShootRepository finalShootRepository = ctx.getBean(FinalShootRepository.class);
        finalShootRepository.save(new FinalShoot(1L, FinalShootPlayer.Michael_Jordan_2003, "https://www.youtube.com/watch?v=8V_1ZxCN3nI"));
        finalShootRepository.save(new FinalShoot(2L, FinalShootPlayer.Kobe_Bryant_2016, "https://www.youtube.com/watch?v=gi8hXrfGsm4"));
        finalShootRepository.save(new FinalShoot(3L, FinalShootPlayer.Tracy_McGrady_2013, "https://www.youtube.com/watch?v=tp6TsTeYJBw"));
        finalShootRepository.save(new FinalShoot(4L, FinalShootPlayer.Allen_Iverson_2011, "https://www.youtube.com/watch?v=KuW-QG2vRtY"));
    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
}