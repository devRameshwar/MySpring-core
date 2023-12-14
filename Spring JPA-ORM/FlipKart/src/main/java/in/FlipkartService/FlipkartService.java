package in.FlipkartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.FlipkartEntity.Flipkart;
import in.FlipkartRepository.FlipkartRepository;

@Component
public class FlipkartService {

	@Autowired
	FlipkartRepository repository;

	// method for save data of flipkart to database
	public Flipkart saveData(Flipkart flipkart) {
		Flipkart save = repository.save(flipkart);
		return save;

	}

}
