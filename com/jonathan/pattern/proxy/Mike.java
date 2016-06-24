/*
Source: http://www.programcreek.com/2009/10/proxy-design-pattern-in-a-funny-story/
 Java Design Pattern Story for Proxy – A Slutty Lady
 
This work is translated from a foreign website which uses ancient stories to explain design patterns.

1. What is Proxy/Agent pattern?

I’m too busy to response your request, so you go to my proxy. Proxy should know what the delegator can do. That is, they have the same interface. The proxy can not do the job, but the delegator can do. The characters you do not understand can be totally ignored!

2. Proxy pattern story

Here is a funny story I translated from "Water Margin". It may not sounds funny any more after I translate it. But any way, you get the idea of proxy design pattern.

Here is the situation:

Some bad man, for whatever reasons, always wants to sleep with some good man's wife. Among those wives, some want to sleep with those bad men, but others do not. The bad men can not ask directly to those wives. Because they are not sure whether the one being asked would like to do bad things. It would be a very bad situation if he makes a bad judgement. So there should be an agent/proxy to do this kind of business for those bad men.

We have the following roles in this situation.

CheatingWife/SluttyWife: a interface which define what they usually do, such as seduce men and happy with men.
HouseWifeOne: she is a slutty wife at home.
Mike: who wants to sleep with other men’s wives.
Business Agent: do this kind of consulting business.


 */
public class Mike{
	public Mike(){

	}
	public static void main(String[] args) {
		BusinessAgent businessAgent = new BusinessAgent();
		businessAgent.seduceMan();
		businessAgent.happyWithMan();

	}
}