package com.codemanship.refactoring.legacycode;

import java.io.IOException;

public interface OrderService {
    Order getOrder(int orderId) throws IOException, InterruptedException;
}
