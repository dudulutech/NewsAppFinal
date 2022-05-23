package com.example.newsapp

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.remote.EspressoRemoteMessage
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest{
    private lateinit var scenario: ActivityScenario<MainActivity>
    @Test
    fun testAddSavedNewsandDelete(){
        Espresso.onView(withId(R.id.drop_btn)).perform((click()))
        Espresso.onView(withId(R.id.save_news)).perform(click())
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.savednews_menu)).check(matches(isDisplayed()))



    }


}