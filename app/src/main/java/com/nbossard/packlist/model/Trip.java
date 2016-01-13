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

package com.nbossard.packlist.model;

/*
@startuml
    class com.nbossard.packlist.model.Trip {
        String mName
        String mStartDate
        String mEndDate
    }
@enduml
 */

/**
 * A trip
 *
 * @author Created by nbossard on 25/12/15.
 */
public class Trip {

// *********************** FIELDS *************************************************************************

    private String mName;
    private String mStartDate;
    private String mEndDate;

    //
// *********************** METHODS **************************************************************************
    public Trip(String parName, String parStartDate, String parEndDate) {
        setName(parName);
        setStartDate(parStartDate);
        setEndDate(parEndDate);
    }

    public String getName() {
        return mName;
    }

    @SuppressWarnings("WeakerAccess")
    public void setName(String parName) {
        mName = parName;
    }


    public String getStartDate() {
        return mStartDate;
    }

    @SuppressWarnings("WeakerAccess")
    public void setStartDate(String parStartDate) {
        mStartDate = parStartDate;
    }

    public String getEndDate() {
        return mEndDate;
    }

    @SuppressWarnings("WeakerAccess")
    public void setEndDate(String parEndDate) {
        mEndDate = parEndDate;
    }

    @Override
    public boolean equals(Object parO) {
        if (this == parO) return true;
        if (parO == null || getClass() != parO.getClass()) return false;

        Trip trip = (Trip) parO;

        if (mName != null ? !mName.equals(trip.mName) : trip.mName != null) return false;
        //noinspection SimplifiableIfStatement
        if (mStartDate != null ? !mStartDate.equals(trip.mStartDate) : trip.mStartDate != null) return false;
        return mEndDate != null ? mEndDate.equals(trip.mEndDate) : trip.mEndDate == null;

    }

    @Override
    public int hashCode() {
        int result = mName != null ? mName.hashCode() : 0;
        result = 31 * result + (mStartDate != null ? mStartDate.hashCode() : 0);
        result = 31 * result + (mEndDate != null ? mEndDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Trip{" + "mName=" + mName +
                ", mStartDate=" + mStartDate +
                ", mEndDate=" + mEndDate +
                '}';
    }
}