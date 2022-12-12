package com.mobile2b.webfunction;

import java.util.LinkedHashMap;

public class I18nString extends LinkedHashMap<String, String> {

    private static final String FALLBACK_LANGUAGE = "en";

    public I18nString() {
    }

    public I18nString(String lang, String string) {
        put(lang, string);
    }

    public static I18nString en(String enString) {
        return new I18nString("en", enString);
    }

    public String getLocalizedString(String lang) {
        try {
            // Try to get string in requested language
            if (Utils.isNotEmpty(get(lang))) {
                return get(lang);
            }
            // If not available, try to use fallback language (English)
            if (Utils.isNotEmpty(get(FALLBACK_LANGUAGE))) {
                return get(FALLBACK_LANGUAGE);
            }
            // If also not available, use first available string
            for (String key : keySet()) {
                if (Utils.isNotEmpty(get(key))) {
                    return get(key);
                }
            }
        } catch (ClassCastException e) {
            return "Invalid string";
        }
        return null;
    }

}
