/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.el.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author Jacob Hookom [jacob@hookom.net]
 */
public final class MessageFactory {

    static final ResourceBundle bundle = ResourceBundle.getBundle("org.apache.el.LocalStrings");

    public MessageFactory() {
        super();
    }

    public static String get(final String key) {
        try {
            return bundle.getString(key);
        } catch (MissingResourceException e) {
            return key;
        }
    }

    public static String get(final String key, final Object... args) {
        String value = get(key);

        // Convert all Number arguments to String else MessageFormat may try to
        // format them in unexpected ways.
        if (args != null) {
        	for (int i = 0; i < args.length; i++) {
        		if (args[i] instanceof Number) {
        			args[i] = args[i].toString();
        		}
        	}
        }
        
        MessageFormat mf = new MessageFormat(value);
        return mf.format(args, new StringBuffer(), null).toString();
    }
}
