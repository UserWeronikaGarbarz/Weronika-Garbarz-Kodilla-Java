package com.kodilla.patterns.strategy.social.generations;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.media.FacebookPublisher;

public class Millenials extends User {
    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
