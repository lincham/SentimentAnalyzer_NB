package com.sa.train;

import java.util.Map;

public interface SentimentAnalyzerContextGenerator {
	
	String[] getContext(String text, Map<String, Object> extraInformation);
}
