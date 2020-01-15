Feature: Open a browser with the provided html page and run a
selenium test on the provided feilds

Scenario: Opens the File in Chrome 
	Given The user opened the file in a browser
	Then Verify the title
	When No data is entered
	And Submit is clicked
	Then Close alert for title
	When Title form has correct data
	Then Click submit with no ownername
	And Close ownername alert
	Then Enter valid ownername
	And Click submit with ownername
	Then Close alert for gender
	When Valid gender is clicked
	And Submit is clicked with valid gender
	Then Close alert for Address
	When Valid address is entered
	And Submit is clicked with valid address
	Then Close alert for City
	When Valid city is entered
	And Submit is clicked with valid City
	Then Close alert for state
	When Valid state is entered
	And Submit is clicked with valid state
	Then Close alert for country
	 When Valid country is clicked
	 And Submit is clicked with valid country
	 Then Close alert for zip
	When Valid zip is entered
	And Submit is clicked with valid ZIP
	Then Close alert for VehicalType
	When Valid vehicalType is clicked
	And Submit is clicked with valid Vehical
	Then Close alert for fuelTypes
	When Valid fuelType is clicked
	And Submit is clicked with valid fuel
	Then Close alert for MFG
	When Valid mfg is clicked
	And Submit is clicked with valid mfg
	Then Close alert for Success
	

	
