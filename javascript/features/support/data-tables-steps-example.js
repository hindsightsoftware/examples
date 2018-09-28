const { Given, When, Then } = require('cucumber')

Given('I have filled in the following address', function (dataTable) {
    const tableWithKeys = dataTable.hashes();

    console.log(tableWithKeys[0]['house_number']);
    console.log(tableWithKeys[0]['street_name']);
});

When('I select address type', function () {
    // When glue code here
});

Then('I will be presented with three address types', function (dataTable) {
    const listOfRows = dataTable.raw();

    console.log(listOfRows[0][0]);
    console.log(listOfRows[1][0]);
});