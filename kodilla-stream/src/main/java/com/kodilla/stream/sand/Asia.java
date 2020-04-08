package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Asia implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("27276448839999333");
        return sandQuantity;
    }
}
