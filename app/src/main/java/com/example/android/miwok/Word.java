package com.example.android.miwok;

/**
 * Created by rlfon on 7/16/2017.
 */

public class Word {

    private String miwokTranslation, defaultTranslation;

    public Word(String miwokTranslation, String defaultTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
