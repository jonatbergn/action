package com.jonathanbergen.actions

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.Visibility.INVISIBLE
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

  @Rule
  @JvmField
  val rule  = ActivityTestRule(MainActivity::class.java)

  @Test
  fun action() {
    onView(withId(R.id.btnAction))
        .perform(click())
        .check(matches(withEffectiveVisibility(INVISIBLE)))
  }
}
