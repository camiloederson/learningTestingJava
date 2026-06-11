package miKdev.paymentGateway;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PaymentProcessorTest {

    @Mock
    PaymentGateway paymentGateway;

    @InjectMocks
    PaymentProcessor paymentProcessor;

    @Test
    void ShouldReturnTrueForPaymentRequest() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    void ShouldReturnFalseForPaymentRequest() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(1000));
    }

}