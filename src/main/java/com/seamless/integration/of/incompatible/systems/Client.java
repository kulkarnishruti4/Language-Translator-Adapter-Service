package com.seamless.integration.of.incompatible.systems;

import com.integration.service.ItalianSpeaker;
import com.integration.service.ItalianTranslatorAdapter;
import com.integration.service.LanguageTranslator;

public class Client {
	
	
	public static void main(String[] args) {
        ItalianSpeaker italianSpeaker = new ItalianSpeaker();
        
        LanguageTranslator translator = new ItalianTranslatorAdapter(italianSpeaker);

        String englishSentence = "Hello";
        String translatedSentence = translator.translate(englishSentence);
        System.out.println(translatedSentence);

        englishSentence = "How are you?";
        translatedSentence = translator.translate(englishSentence);
        System.out.println(translatedSentence);

        englishSentence = "Goodbye";
        translatedSentence = translator.translate(englishSentence);
        System.out.println(translatedSentence);
    }
	

}
