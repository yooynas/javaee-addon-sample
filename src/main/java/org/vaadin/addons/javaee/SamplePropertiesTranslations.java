/*******************************************************************************
 * Copyright 2012 Thomas Letsch
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *******************************************************************************/
package org.vaadin.addons.javaee;

import org.vaadin.addons.javaee.i18n.ResourceBundleTranslations;

public class SamplePropertiesTranslations extends ResourceBundleTranslations {

    private static final long serialVersionUID = 1L;

    private static final String SAMPLE_BUNDLE_NAME = "Sample";

    @Override
    protected String getBundleName() {
        return SAMPLE_BUNDLE_NAME;
    }
}
