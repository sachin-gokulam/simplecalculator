package me.sachinmuralig.simplecalculator;

import android.widget.EditText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestCalculatorApp {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);;

    @Test
    public void Should_performAddition_when_addButtonClicked() {
        setOperands("22.0", "12.5");
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.textResult)).check(matches(withText("34.500")));
    }

    private void setOperands(final String operandOne, final String operandTwo) {
        activityScenarioRule.getScenario().onActivity(new ActivityScenario.ActivityAction<MainActivity>() {
            @Override
            public void perform(MainActivity activity) {
                EditText editTextOperandOne = activity.findViewById(R.id.editTextOperandOne);
                editTextOperandOne.setText(operandOne);

                EditText editTextOperandTwo = activity.findViewById(R.id.editTextOperandTwo);
                editTextOperandTwo.setText(operandTwo);
            }
        });
    }


}