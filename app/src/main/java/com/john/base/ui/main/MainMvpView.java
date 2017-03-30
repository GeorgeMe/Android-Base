package com.john.base.ui.main;

import com.john.base.data.model.Ribot;
import com.john.base.ui.base.MvpView;

import java.util.List;



public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
