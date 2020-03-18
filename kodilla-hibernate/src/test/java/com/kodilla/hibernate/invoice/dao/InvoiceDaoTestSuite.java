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
        Product laptopProduct = new Product("Laptop");
        Product tvProduct = new Product("TV");
        Item macbook = new Item(laptopProduct, new BigDecimal(6000), 1, new BigDecimal(6000));
        Item asus = new Item(laptopProduct, new BigDecimal(3000), 2, new BigDecimal(6000));
        Item lg = new Item(tvProduct, new BigDecimal(3000), 3, new BigDecimal(9000));

        macbook.setProduct(laptopProduct);
        asus.setProduct(laptopProduct);
        lg.setProduct(tvProduct);
        laptopProduct.getItem().add(macbook);
        laptopProduct.getItem().add(asus);
        tvProduct.getItem().add(lg);

        Invoice invoice22 = new Invoice("NS/22/100");
        Invoice invoice23 = new Invoice("NS/23/100");
        invoice22.getItems().add(macbook);
        invoice22.getItems().add(lg);
        invoice23.getItems().add(asus);
        macbook.setInvoice(invoice22);
        lg.setInvoice(invoice22);
        asus.setInvoice(invoice23);

        //When
        invoiceDao.save(invoice22);
        invoiceDao.save(invoice23);
        int id22 = invoice22.getId();
        int id23 = invoice23.getId();

        //Then
        Assert.assertNotEquals(0, id22);
        Assert.assertNotEquals(0, id23);

        //CleanUp
        try {
            invoiceDao.deleteById(id22);
            invoiceDao.deleteById(id23);
        } catch (Exception e) {
            //do nothing
        }
    }
}