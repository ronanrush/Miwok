package com.example.miwok;

public class Word {


    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;


    private int mMiwokImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourseId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourseId = audioResourseId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param miwokImageId is the image id of Miwok Word
     */
    public Word(String defaultTranslation, String miwokTranslation, int miwokImageId, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokImageId = miwokImageId;
        mAudioResourseId = audioResourseId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the Miwok image of the word.
     */
    public int getMiwokImageId() {
        return mMiwokImageId;
    }

    /**
     * Get the Miwok image of the word.
     */
    public int getAudioresourceId() {
        return mAudioResourseId;
    }

    public boolean hasImage(){
        return mMiwokImageId != NO_IMAGE_PROVIDED;
    }

}
