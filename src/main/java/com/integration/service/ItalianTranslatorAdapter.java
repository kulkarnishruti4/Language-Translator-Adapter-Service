package com.integration.service;

public class ItalianTranslatorAdapter implements LanguageTranslator {

	 private ItalianSpeaker italianSpeaker;

	    public ItalianTranslatorAdapter(ItalianSpeaker italianSpeaker) {
	        this.italianSpeaker = italianSpeaker;
	    }

	    @Override
	    public String translate(String sentence) {
	        // Assuming a simple direct translation for demonstration purposes
	        String translatedSentence = translateToItalian(sentence);
	        return italianSpeaker.parlare(translatedSentence);
	    }

	    private String translateToItalian(String sentence) {
	        // Mock translation logic for demonstration purposes
	        if (sentence.equalsIgnoreCase("Hello")) {
	            return "Ciao";
	        } else if (sentence.equalsIgnoreCase("How are you?")) {
	            return "Come stai?";
	        } else {
	            return "Traduzione non disponibile";
	        }
	    }

}
