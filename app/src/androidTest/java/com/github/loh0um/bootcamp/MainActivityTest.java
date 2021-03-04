package com.github.loh0um.bootcamp;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
//import static androidx.test.espresso.intent.Intents;
/*
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<>(MainActivity.class);


    //@Rule
    //public IntentsTestRule<MainActivity> intentsTestRule =
    //        new IntentsTestRule<>(MainActivity.class);


    private static final String NAME_TEST = "Jean";

    @Test
    public void writeNameAndPressButtonFiresIntent() {

        //Intents.init();

        ViewInteraction mainName = Espresso.onView(ViewMatchers.withId(R.id.mainName));
        mainName.perform(typeText(NAME_TEST));
        closeSoftKeyboard();

        ViewInteraction mainGoButton = Espresso.onView(ViewMatchers.withId(R.id.mainGoButton));
        mainGoButton.perform(click());

        //Intents.intended(Matchers.allOf(IntentMatchers.hasComponent(GreetingActivity.class.getName()), IntentMatchers.hasExtra(MainActivity.EXTRA_MESSAGE, NAME_TEST)));

        //Intents.release();
    }

}*/
