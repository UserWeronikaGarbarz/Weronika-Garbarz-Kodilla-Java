package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        BigDecimal milkPrice = new BigDecimal(6);
        BigDecimal eggsPrice = new BigDecimal(7);
        BigDecimal sugarPrice = new BigDecimal(4);
        BigDecimal breadPrice = new BigDecimal(2);

        int milkQuantity = 100000000;
        int eggsQuantity = 200000000;
        int sugarQuantity = 300000000;
        int breadQuantity = 400000000;

        Product milkProduct = new Product("Milk");
        Product eggProduct = new Product("Eggs");
        Product sugarProduct = new Product("Sugar");
        Product breadProduct = new Product("Bread");

        Item milk = new Item(milkProduct, milkPrice, milkQuantity, milkPrice.multiply(BigDecimal.valueOf(milkQuantity)));
        Item eggs = new Item(eggProduct, eggsPrice, eggsQuantity, eggsPrice.multiply(BigDecimal.valueOf(eggsQuantity)));
        Item sugar = new Item(sugarProduct, sugarPrice, sugarQuantity, sugarPrice.multiply(BigDecimal.valueOf(sugarQuantity)));
        Item bread = new Item(breadProduct, breadPrice, breadQuantity, breadPrice.multiply(BigDecimal.valueOf(breadQuantity)));

        milk.setProduct(milkProduct);
        eggs.setProduct(eggProduct);
        sugar.setProduct(sugarProduct);
        bread.setProduct(breadProduct);

        Invoice invoice = new Invoice("NS/22/100");
        invoice.getItems().add(milk);
        invoice.getItems().add(eggs);
        invoice.getItems().add(sugar);
        invoice.getItems().add(bread);

        milk.setInvoice(invoice);
        eggs.setInvoice(invoice);
        sugar.setInvoice(invoice);
        bread.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
