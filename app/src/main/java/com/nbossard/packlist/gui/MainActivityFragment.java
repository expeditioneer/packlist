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

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.nbossard.packlist.PackListApp;
import com.nbossard.packlist.R;
import com.nbossard.packlist.model.Trip;
import com.nbossard.packlist.process.saving.ISavingModule;

import java.util.List;

/**
 * A placeholder fragment containing a simple list view.
 */
public class MainActivityFragment extends Fragment {
    // *********************** FIELDS ***********************************************************************

    /** The saving module to retrieve and update data (trips).*/
    private ISavingModule mSavingModule;
    /** The root view, will be used to findViewById. */
    private View mRootView;
    /** The trip list view. */
    private ListView mTtripListView;
    /** The object to support Contextual Action Bar (CAB). */
    private ActionMode mActionMode;

    // *********************** METHODS **********************************************************************

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSavingModule = ((PackListApp) getActivity().getApplication()).getSavingModule();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_main, container, false);
        return mRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        populateList();
    }

    @Override
    public void onResume() {
        super.onResume();
        populateList();
    }
    // *********************** PRIVATE METHODS **************************************************************

    /**
     * Populate list with data in {@link ISavingModule}.
     */
    private void populateList() {
        mTtripListView = (ListView) mRootView.findViewById(R.id.main__trip_list);
        List<Trip> tripList;

        tripList = mSavingModule.loadSavedTrips();

        TripAdapter tripAdapter = new TripAdapter(tripList, this.getActivity());
        mTtripListView.setEmptyView(mRootView.findViewById(R.id.main__trip_list_empty));
        mTtripListView.setAdapter(tripAdapter);
        mTtripListView.setOnItemLongClickListener(tripListLongClickListener());
        mTtripListView.invalidate();
    }

    @NonNull
    private AdapterView.OnItemLongClickListener tripListLongClickListener() {
        return new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int pos, long id) {

                mActionMode = getActivity().startActionMode(new ActionMode.Callback() {
                    @Override
                    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                        mode.setTitle("Selected");

                        MenuInflater inflater = mode.getMenuInflater();
                        inflater.inflate(R.menu.menu_main_cab, menu);
                        return true;
                    }

                    @Override
                    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                        return false;
                    }

                    @Override
                    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_delete:
                                deleteTripClicked();
                                return true;
                            default:
                                doneClicked();
                                return false;
                        }
                    }

                    @Override
                    public void onDestroyActionMode(ActionMode mode) {
                        doneClicked();
                    }
                });
                return true;
            }
        };
    }

    /** Effectively delete selected trip then refresh the list. */
    private void deleteTripClicked() {
        Trip selectedTrip = (Trip) mTtripListView.getSelectedItem();
        // TODO improve this and not delete all
        mSavingModule.deleteAllTrips();
        mActionMode.finish();
        populateList();
    }

    private void doneClicked() {
    }
}