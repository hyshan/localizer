package org.jvnet.localizer;

import java.util.Locale;

public interface StatusCode {

    String getName();

    String getMessage();

    String getMessage(Locale locale);

}
