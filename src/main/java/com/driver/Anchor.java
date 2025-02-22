package com.driver;

public class Anchor {
	private String name;
    private String languageExpertise;
    private String type; // e.g., wedding, corporate, casual
    private int maxDuration;

    // Constructors
    public Anchor() {
    	// your code goes here
    }

    public Anchor(String name, String languageExpertise, String type, int maxDuration) {
    	// your code goes here
        this.name= name;
        this.languageExpertise = languageExpertise;
        this.type = type;
        this.maxDuration = maxDuration;
    }

    // Getters and Setters
    public String getName() {
    	// your code goes here
        return name;
    }

    public void setName(String name) {
    	// your code goes here
        this.name = name;
    }

    public String getLanguageExpertise() {
    	// your code goes here
        return languageExpertise;
    }

    public void setLanguageExpertise(String languageExpertise) {
    	// your code goes here
        this.languageExpertise = languageExpertise;
    }

    public String getType() {
    	// your code goes here
        return type;
    }

    public void setType(String type) {
    	// your code goes here
        this.type = type;
    }

    public int getMaxDuration() {
    	// your code goes here
        return maxDuration;
    }

    public void setMaxDuration(int maxDuration) {
    	// your code goes here
        this.maxDuration = maxDuration;
    }
}
