/*
 * PackList is an open-source packing-list for Android
 *
 * Copyright (c) 2016 Nicolas Bossard.
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

package com.nbossard.packlist.gui;

import junit.framework.Assert;
import android.test.ActivityInstrumentationTestCase2;

import com.nbossard.packlist.R;
import com.robotium.solo.Solo;

/**
 * Robotium tests on {@link AboutActivity}
 *
 * @author Nicolas BOSSARD (naub7473)
 *
 */
public class AboutActivityTest extends ActivityInstrumentationTestCase2<AboutActivity>
{

    // ********************** FIELDS ************************************************************************

    /**
     * Solo object ???
     */
    private Solo mSolo;

    // ********************** METHODS ***********************************************************************

    /**
     * Mandatory call.
     */
    public AboutActivityTest()
    {
        super(AboutActivity.class);
    }

    /**
     * Will launch activity to be tested.
     *
     * @throws Exception
     *             if a test has failed.
     */
    public final void setUp() throws Exception
    {
        mSolo = new Solo(getInstrumentation(), getActivity());
    }

    /**
     * Test that the string that should always appear are displayed.
     *
     * @throws Exception
     *             if a test has failed.
     */
    public final void testAlwaysThereStrings() throws Exception
    {
        Assert.assertTrue(mSolo.waitForText(mSolo.getString(R.string.about__main)));
    }

    @Override
    public final void tearDown() throws Exception
    {
        mSolo.finishOpenedActivities();
    }
}