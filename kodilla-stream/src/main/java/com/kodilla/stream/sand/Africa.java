package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Africa implements SandStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("99999997467674647777");
        return sandQuantity;
    }
}
