/*
 *
 *  SecureCodeBox (SCB)
 *  Copyright 2015-2018 iteratec GmbH
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */

package io.securecodebox.model.findings;

/**
 * Representation of the OSI-Layer-Model.
 * Further informations: {@link https://en.wikipedia.org/wiki/OSI_model}
 *
 * @author Rüdiger Heins - iteratec GmbH
 * @since 08.03.18
 */
public enum OsiLayer {
    /**
     * APPLICATION ORIENTED:
     */
    APPLICATION, PRESENTATION, SESSION, /**
     * TRANSPORT ORIENTED:
     **/
    TRANSPORT, NETWORK, DATA_LINK, /**
     * PHYSICAL
     */
    PHYSICAL, NOT_APPLICABLE;
}
