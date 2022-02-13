package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
class DemoApplicationTests
{
	Calculator calculator = new Calculator();

	@Test
	@DisplayName("Test should add two numbers (a + b)")
	public void itshouldAddNumbers()
	{

		/*
		Behavior-driven development is a testing practice that follows the idea of specification by example (e.g., Test-Driven Development [TDD]). The idea is to describe how the application should behave in a very simple user/business-focused language.  BDD’s business-focused perspective on application behavior allows teams to create living documentation that is easy to maintain and can be consumed by all team members, including testers, developers, and product owners.

        With BDD, tests are created using the gherkin Given-When-Then language.

        given (some context)
        when (something happens)
        then (outcome)

        For example:
        Given I am signing up for a free trial
        When I submit the required details
        Then I receive a link to the download
		 */

		//given
		int a = 50;
		int b = 50;

        //when
		int result = calculator.add(a,b);

		//then
		int expected = 100;
		assertThat(result).isEqualTo(expected);
	}


	static class Calculator
	{
		public int add(int a, int b)
		{
			return a + b;
		}
	}

}

