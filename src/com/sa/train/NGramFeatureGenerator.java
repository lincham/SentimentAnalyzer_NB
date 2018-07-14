package com.sa.train;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class NGramFeatureGenerator implements FeatureGenerator {
	private int n;
	private boolean tokenizeFlag;//是否进行分词
	
	public NGramFeatureGenerator() {
		this.n = 2;
		this.tokenizeFlag = false;
	}
	
	public NGramFeatureGenerator(int n) {
		this.n= n;
		this.tokenizeFlag  = false;
	}
	
	public NGramFeatureGenerator(int n,boolean tokenize) {
		this.n = n;
		this.tokenizeFlag = tokenize;
	}
	

	@Override
	public Collection<String> extractFeatures(String text, Map<String, Object> extraInformation) {
		Collection<String> features = new ArrayList<String>();
		
		String[] tokens = null;
		if(tokenizeFlag) {
			tokens = tokenize(text);
		}else {
			tokens = text.split("");
		}
		
		for(int i = 0;i<tokens.length;i++) {
			
			StringBuilder sb = new StringBuilder("ng=");
			
			for (int j = 0;i+j<tokens.length && j<n;j++) {
				sb.append(":");
				sb.append(tokens[i+j]);
				int gramCount = j+1;
				if (gramCount == n) {					
					features.add(sb.toString());
				}
			}
		}
		return features;
	}
	
	/**
	 * 对文本进行分词
	 * @param text
	 * @return
	 */
	private String[] tokenize(String text) {
		return null;
	}

}
