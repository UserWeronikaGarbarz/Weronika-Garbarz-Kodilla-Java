package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        String description = taxiOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        BigDecimal theCost = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        BigDecimal theCost = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(39), theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by MyTaxi Network child seat child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getCost());
        //When
        BigDecimal theCost = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(52), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getDescription());
        //When
        String description = taxiOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by Taxi Network variant VIP child seat", description);
    }
}
