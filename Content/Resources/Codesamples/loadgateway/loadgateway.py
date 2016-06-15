
# Set your secret key: remember to change this to your live secret key in production
# See your keys here https://dashboard.stripe.com/account/apikeys
stripe.api_key = "sk_test_BQokikJOvBiI2HlWgH4olfQ2"

# Get the credit card details submitted by the form
token = request.POST['stripeToken']

# Create the charge on Stripe's servers - this will charge the user's card
try:
  charge = stripe.Charge.create(
      amount=1000, # amount in cents, again
      currency="usd",
      source=token,
      description="Example charge"
  )
except stripe.error.CardError as e:
  # The card has been declined
  pass