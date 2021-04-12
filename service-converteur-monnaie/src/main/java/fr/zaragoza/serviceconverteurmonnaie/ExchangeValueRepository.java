package fr.zaragoza.serviceconverteurmonnaie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long>{

	ExchangeValue findByFromAndTo(String from, String to);
}
