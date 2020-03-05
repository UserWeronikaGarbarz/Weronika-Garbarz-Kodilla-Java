package com.kodilla.patterns.strategy.social.generations;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;

public class YGeneration extends User {
    public YGeneration(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
