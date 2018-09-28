const { Given, When, Then } = require('cucumber')

Given('I have {string} addresses', function (address) {
    console.log(address);
});

When('I add my {string} address', function (addresses) {
    console.log(addresses);
});

Then('I will have {string} addresses', function (address) {
    console.log(address);
});

Given(/^I have a ([a-z]+)$/, function (fruit) {
    console.log(fruit);
});

When('I take an apple', function () {
    // When glue code here
});

Then(/^I have an ([a-z]+) and a ([a-z]+)$/, function (fruit1, fruit2) {
    console.log(fruit1);
    console.log(fruit2);
});

Given('I have divided the number {int} in half', function (integer) {
    console.log(integer);
});

Then('I will have a result of {float}', function (float) {
    console.log(float);
});