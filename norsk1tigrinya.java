<section id="premium">
    <h2>Premium Lessons</h2>
    <p>Access more important phrases and vocabulary for just a small fee!</p>
    <div id="paypal-button-container"></div>
</section>
<script src="https://www.paypal.com/sdk/js?client-id=YOUR_CLIENT_ID"></script>
<script>
    paypal.Buttons({
        createOrder: function(data, actions) {
            return actions.order.create({
                purchase_units: [{
                    amount: { value: '5.00' } // set price here
                }]
            });
        },
        onApprove: function(data, actions) {
            return actions.order.capture().then(function(details) {
                alert('Thank you, ' + details.payer.name.given_name + '! Access granted.');
                // Redirect or unlock premium content
            });
        }
    }).render('#paypal-button-container');
</script>
