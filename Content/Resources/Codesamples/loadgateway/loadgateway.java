// Set your secret key: remember to change this to your live secret key in production
// See your keys here https://dashboard.stripe.com/account/apikeys
Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";

// Get the credit card details submitted by the form
String token = request.getParameter("stripeToken");

// Create the charge on Stripe's servers - this will charge the user's card
try {
  Map<String, Object> chargeParams = new HashMap<String, Object>();
  chargeParams.put("amount", 1000); // amount in cents, again
  chargeParams.put("currency", "usd");
  chargeParams.put("source", token);
  chargeParams.put("description", "Example charge");

  Charge charge = Charge.create(chargeParams);
} catch (CardException e) {
  // The card has been declined
}