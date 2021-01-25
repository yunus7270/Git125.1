Feature: Application login homepage

Scenario: Application verification

Given WebPage "https://secure.education.mn.gov/cas/login?service=https%3a%2f%2fsecure.education.mn.gov%2ftestwes%2findex.faces" on this side
When logging into this page with credentials "yunusbey_" and "200112345" username and password
Then verification of the landing "Test Web Edit System".
And success "true".