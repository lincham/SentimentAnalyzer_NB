package com.sa.eval;

import com.lc.nlp4han.ml.util.EvaluationMonitor;
import com.sa.train.SentimentTextSample;

public class SentimentAnalyzerEvaluationMonitor implements
		EvaluationMonitor<SentimentTextSample>{

	@Override
	public void correctlyClassified(SentimentTextSample reference, SentimentTextSample prediction) {
		
	}

	@Override
	public void missclassified(SentimentTextSample reference, SentimentTextSample prediction) {
		
	}

}
