package com.example.letsgo.model;

import com.example.letsgo.model.firebase.History;

import java.util.ArrayList;

public interface FirebaseHistoryListener {
    interface GetFirebaseHistoryListener {
        void onFirebaseHistoryRetrieved(ArrayList<History> historyList);
    }
}
