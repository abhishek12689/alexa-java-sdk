package com.dwivedi.alexa.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.dwivedi.alexa.handlers.CancelandStopIntentHandler;
import com.dwivedi.alexa.handlers.HelloWorldIntentHandler;
import com.dwivedi.alexa.handlers.HelpIntentHandler;
import com.dwivedi.alexa.handlers.LaunchRequestHandler;
import com.dwivedi.alexa.handlers.SessionEndedRequestHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

	private static Skill getSkill() {
		return Skills.standard().addRequestHandlers(new CancelandStopIntentHandler(), new HelloWorldIntentHandler(),
				new HelpIntentHandler(), new LaunchRequestHandler(), new SessionEndedRequestHandler()).build();
	}

	public HelloWorldStreamHandler() {
		super(getSkill());
	}
}
