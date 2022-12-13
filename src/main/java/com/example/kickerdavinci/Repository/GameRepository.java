package com.example.kickerdavinci.Repository;
import com.example.kickerdavinci.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByCompetition(long id);
}


