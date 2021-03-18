package expo2121.v1.expo.dao;

import expo2121.v1.expo.models.Stand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("postgres")
public interface StandRepository extends CrudRepository<Stand,Integer> {
}
