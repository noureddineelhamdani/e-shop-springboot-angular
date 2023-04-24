package com.elhamdani.ecommerce.service;

import com.elhamdani.ecommerce.dto.PaymentInfo;
import com.elhamdani.ecommerce.dto.Purchase;
import com.elhamdani.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
