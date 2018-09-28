Given("I have filled in the following address") do |table|
  tableWithKeys = table.hashes

  puts tableWithKeys[0][:house_number]
  puts tableWithKeys[0][:street_name]
end

When("I select address type") do
  # When glue code
end

Then("I will be presented with three address types") do |table|
    listOfRows = table.raw

    puts listOfRows[0][0]
    puts listOfRows[0][1]
end