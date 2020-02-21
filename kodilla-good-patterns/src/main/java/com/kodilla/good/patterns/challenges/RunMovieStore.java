package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class RunMovieStore {
    public static void main(String[] args) {

        String result = MovieStore.getMovies().entrySet().stream()
                .flatMap(map -> map.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(result);
    }
}
