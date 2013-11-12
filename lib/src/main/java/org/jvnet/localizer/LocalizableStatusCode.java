package org.jvnet.localizer;

import java.util.Locale;

public class LocalizableStatusCode implements StatusCode {

    private Localizable localizable;

    public LocalizableStatusCode(Localizable localizable) {
        this.localizable = localizable;
    }

    public String getName() {
        return this.localizable.getKey();
    }

    public String getMessage() {
        return this.localizable.toString();
    }

    public String getMessage(Locale locale) {
        return this.localizable.toString(locale);
    }



}
