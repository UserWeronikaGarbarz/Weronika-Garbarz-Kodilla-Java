package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Europe implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("12722872192292182928282");
        return sandQuantity;
    }
}
