package com.example.viniciustenorio.minhacalculadora;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by viniciustenorio on 10/17/17.
 */

public class MainActivityRobot {

    public MainActivityRobot(ActivityTestRule<MainActivity> rule) {

    }

    public MainActivityRobot preencheNotas(String n1,String n2,String n3){
        onView(withId(R.id.et_nota1)).perform(typeText(n1));
        onView(withId(R.id.et_nota2)).perform(typeText(n2));
        onView(withId(R.id.et_nota3)).perform(typeText(n3));
        Espresso.closeSoftKeyboard();
        return this;
    }

    public MainActivityRobot clickCalcular(){
        onView(withId(R.id.button)).perform(click());
        return this;
    }

    public MainActivityRobot checaCorBotao(){
        onView(withId(R.id.button));
        return this;
    }
}
