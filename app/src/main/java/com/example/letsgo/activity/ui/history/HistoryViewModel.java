package com.example.letsgo.activity.ui.history;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.letsgo.adapter.recyclerviewhistory.HistoryAdapter;
import com.example.letsgo.model.FirebaseHistoryListener;
import com.example.letsgo.model.FirebaseHistoryModel;
import com.example.letsgo.model.firebase.History;
import java.util.ArrayList;

public class HistoryViewModel extends ViewModel {
    private HistoryAdapter adapter;
    private final ArrayList<History> historyList = new ArrayList<>();

    public HistoryViewModel() {

    }

    public void getDriverHistory() {
        final FirebaseHistoryModel firebaseHistoryModel = new FirebaseHistoryModel();
        firebaseHistoryModel.getHistory(historyArrayList -> {
            historyList.clear();
            historyList.addAll(historyArrayList);
            adapter.notifyDataSetChanged();
        });
    }

    public RecyclerView.Adapter getHistoryAdapter(Context context) {
        if (adapter == null) {
            adapter = new HistoryAdapter(context, historyList, (view, index) -> {

            });
        }

        return adapter;
    }

}
