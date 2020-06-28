package com.example.demoapp;

import com.example.demoapp.Models.MainMenuModel;

import java.util.ArrayList;
import java.util.List;

public class MockerHelper {
    public static List<MainMenuModel> MockMainMenu()
    {
        ArrayList<MainMenuModel> list = new ArrayList<>();
        list.add(new MainMenuModel("Airbnb Lottie", R.drawable.ic_lottie, 0));
        return list;
    }
}
