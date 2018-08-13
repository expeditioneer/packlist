/*
 * PackList is an open-source packing-list for Android
 *
 * Copyright (c) 2017 Nicolas Bossard and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.nbossard.packlist.gui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.nbossard.packlist.R

/*
@startuml
    class com.nbossard.packlist.gui.HelpThirdPartyActivity {
    }
@enduml
 */

/**
 * Activity displaying third party libraries and their licences.
 *
 * Accessed from About page.
 *
 * @author Nicolas BOSSARD (naub7473)
 */
class HelpThirdPartyActivity : AppCompatActivity() {

    // ********************** CONSTANTS *********************************************************************

    // ********************** INJECTED FIELDS **************************************************************

    // ********************** FIELDS ************************************************************************

    // ********************** METHODS ***********************************************************************

    override fun onCreate(savedInstState: Bundle?) {
        super.onCreate(savedInstState)
        setContentView(R.layout.activity_help_thirdparty)
    }
}
