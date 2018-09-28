Given("I have {string} addresses") do |address|
    puts address
end

When("I add my {string} address") do |addresses|
    puts addresses
end

Then("I will have {string} addresses") do |address|
    puts address
end

Given(/^I have a ([a-z]+)$/) do |fruit|
    puts fruit
end

When("I take an apple") do
    # When glue code here
end

Then(/^I have an ([a-z]+) and a ([a-z]+)$/) do |fruit1, fruit2|
    puts fruit1
    puts fruit2
end

Given("I have divided the number {int} in half") do |integer|
    puts integer
end

Then("I will have a result of {float}") do |float|
    puts float
end