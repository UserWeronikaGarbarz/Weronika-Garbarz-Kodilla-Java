package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.generations.Millenials;
import com.kodilla.patterns.strategy.social.generations.YGeneration;
import com.kodilla.patterns.strategy.social.generations.ZGeneration;
import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User millenials = new Millenials("Steve");
        User yGeneration = new YGeneration("John");
        User zGeneration = new ZGeneration("Monica");

        //When
        String millenialsPostingOn = millenials.sharePost();
        System.out.println("Millenials: " + millenialsPostingOn);
        String yGenerationPostingOn = yGeneration.sharePost();
        System.out.println("YGeneration: " + yGenerationPostingOn);
        String zGenerationPostingOn = zGeneration.sharePost();
        System.out.println("ZGeneration: " + zGenerationPostingOn);

        //Then
        Assert.assertEquals("Sharing post on Facebook.", millenialsPostingOn);
        Assert.assertEquals("Sending message on Snapchat.", yGenerationPostingOn);
        Assert.assertEquals("Sharing post on Twitter.", zGenerationPostingOn);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User millenials = new Millenials("Steve");

        //When
        String millenialsPostingOn = millenials.sharePost();
        System.out.println("Millenials: " + millenialsPostingOn);
        millenials.changingPreferences(new SnapchatPublisher());
        millenialsPostingOn = millenials.sharePost();
        System.out.println("New Millenials: " + millenialsPostingOn);

        //Then
        Assert.assertEquals("Sending message on Snapchat.", millenialsPostingOn);
    }
}
