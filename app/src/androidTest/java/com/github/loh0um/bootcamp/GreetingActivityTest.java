package com.github.loh0um.bootcamp;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    private static final String NAME_TEST = "Jean";

    @Test
    public void textFieldHasMessage() {

        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        intent.putExtra(MainActivity.EXTRA_MESSAGE, NAME_TEST);

        try (ActivityScenario<GreetingActivity> scenario = ActivityScenario.launch(intent)) {
            onView(withId(R.id.greetingMessage)).check(ViewAssertions.matches(ViewMatchers.withText(Matchers.containsString(NAME_TEST))));
        }
    }
}
