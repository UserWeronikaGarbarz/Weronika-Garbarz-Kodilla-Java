package com.kodilla.patterns.strategy.social.generations;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.media.TwitterPublisher;

public class ZGeneration extends User {
    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
