Authorization auth = Authorization.Builder()
    .merchantRefNum("0f8fad5bd9cb469fa16570867728950e")
    .amount(555)
    .card()
        .cardNum("4111111111111111")
        .cvv("123")
        .cardExpiry()
            .month(06)
            .year(2020)
            .Done()
        .Done()
    .billingDetails()
        .zip("M5H 2N2")
        .Done()
    .Build();
 
Authorization response = client.cardPaymentService().authorize(auth);