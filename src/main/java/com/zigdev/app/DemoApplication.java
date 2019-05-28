package com.zigdev.app;

import com.zigdev.app.entitites.Player;
import com.zigdev.app.entitites.Team;
import com.zigdev.app.repositories.PlayerRepository;
import com.zigdev.app.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner
{
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    TeamRepository teamRepository;
    public static void main(String[] args) {
        SpringApplication.run( DemoApplication.class , args );
    }

    @Override
    public void run(String... args) throws Exception {
        Team fcb=new Team( null,"FCB","FootBall Club of Barcelona",null );
        Player messi = new Player( null,"LEO MESSI","Forward","10", LocalDate.of( 1988,06,24 ),fcb);
        Player suarez = new Player( null,"Luis Suárez","Forward","9", LocalDate.of( 1987,01,24 ),fcb);
        Player dembele = new Player( null,"Ousmane Dembélé","Forward","11", LocalDate.of( 1988,06,24 ),fcb);
        Player coutinho = new Player( null,"Philippe Coutinho","Forward","14", LocalDate.of( 1988,06,24 ),fcb);
        Player pike = new Player( null,"Gerard Pike","Defender","3", LocalDate.of( 1988,06,24 ),fcb);

        teamRepository.save( fcb );
        playerRepository.save( messi );
        playerRepository.save( suarez );
        playerRepository.save( dembele);
        playerRepository.save( coutinho);
        playerRepository.save( pike );

    }
}
