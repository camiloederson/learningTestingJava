package miKdev.paymentGateway;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
