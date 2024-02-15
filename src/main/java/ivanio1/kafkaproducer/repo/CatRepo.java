package ivanio1.kafkaproducer.repo;

import ivanio1.kafkaproducer.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepo extends JpaRepository<Cat,Integer> {


}
