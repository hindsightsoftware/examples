const { Given, When, Then } = require('cucumber')

Given('I have filled in the address details form', function () {
    // Given glue code here
});

When('I submit the form', function () {
    // When glue code here
});


Then('the address is processed and I receive the message', function (docString) {
    console.log(docString);
});