package com.javafxpert.carddeckdemo.deck.service;

import com.javafxpert.carddeckdemo.deck.domain.Card;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CardDeckService {

	Flux<Card> generate();

	Flux<Card> parseString(Mono<String> deck);
}
