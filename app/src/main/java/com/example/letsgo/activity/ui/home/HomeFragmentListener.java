package com.example.letsgo.activity.ui.home;

import com.example.letsgo.message.Errors;
import com.example.letsgo.message.Messages;

public interface HomeFragmentListener {
    public interface ShowMessageListener {
        void showErrorMessage(Errors error);
    }
}
