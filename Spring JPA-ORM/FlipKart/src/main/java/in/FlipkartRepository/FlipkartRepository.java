package in.FlipkartRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import in.FlipkartEntity.Flipkart;

@Component
public interface FlipkartRepository extends JpaRepository<Flipkart, Integer> {

}
