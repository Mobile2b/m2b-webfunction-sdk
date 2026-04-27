package com.mobile2b.webfunction;

public enum Type {
    STRING,
    NUMBER,
    BOOLEAN,
    DATE,
    TIME,
    TIMESTAMP,
    USER,
    GROUP,
    BUSINESS_OBJECT,
    DOCUMENT,
    FILE,
    TABLE,
    LOCATION,
    DICTIONARY,
    /** A fixed set of selectable values. Use together with {@link WebFunctionInputParameter#getOptions()}. */
    SELECT
}
