package be.technifutur.deploy.repositories;

import be.technifutur.deploy.entities.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
