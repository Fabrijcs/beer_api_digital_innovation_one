package one.digitalinnovation.beerstock.controller;

import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.dto.QuantityDTO;
import one.digitalinnovation.beerstock.exception.BeerAlreadyRegisteredException;
import one.digitalinnovation.beerstock.exception.BeerNotFoundException;
import one.digitalinnovation.beerstock.exception.BeerStockExceededException;
import java.util.List;

public interface BeerControllerDocs {

    BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;

    BeerDTO findByName(String name) throws BeerNotFoundException;

    List<BeerDTO> listBeers();

    void deleteById(Long id) throws BeerNotFoundException;

    BeerDTO increment(Long id, QuantityDTO quantityDTO) throws BeerNotFoundException, BeerStockExceededException;

    BeerDTO decrement(Long id, QuantityDTO quantityDTO) throws BeerNotFoundException, BeerStockExceededException;
}