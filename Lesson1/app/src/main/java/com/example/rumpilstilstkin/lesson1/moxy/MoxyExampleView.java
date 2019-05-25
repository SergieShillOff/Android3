package com.example.rumpilstilstkin.lesson1.moxy;


import com.arellomobile.mvp.MvpView;

import java.util.List;


public interface MoxyExampleView extends MvpView {
    void setButtonText(int btnIndex, int value);

    void getButtonIds(List<Integer> buttonIds);
}


