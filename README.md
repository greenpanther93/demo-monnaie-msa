# demo-monnaie-msa
Demo pour le cours HMIN210 - Architecture distribuees 

This repo contains 3 sub-projects :

- disco-serveur : the eureka server
- service-converteur-monnaie: the exchange rate service which holds an in-memory database (H2) to return the exchange rate betweeen two currencies.
- service-echange-monnaie: the edge service that calculate the exchange rate based on two type of currencies and a quantity. It uses OpenFeign to interact with the service-converteur-monnaie service.

