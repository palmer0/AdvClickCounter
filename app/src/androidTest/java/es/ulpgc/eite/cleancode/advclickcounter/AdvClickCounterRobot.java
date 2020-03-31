package es.ulpgc.eite.cleancode.advclickcounter;

import android.view.View;
import android.widget.ListView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import es.ulpgc.eite.cleancode.advclickcounter.data.BaseData;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

public class AdvClickCounterRobot {


    private static Matcher<View> withListSize(final int size) {

        return new TypeSafeMatcher<View>() {

            @Override
            public boolean matchesSafely(final View view) {
                return ((ListView) view).getCount() == size;
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("ListView should have " + size + " items");
            }
        };
    }

    private static Matcher<View> withValueAtPosition(final int val,final int pos) {

        return new TypeSafeMatcher<View>() {

            @Override
            public boolean matchesSafely(final View view) {
                int size = ((ListView) view).getCount();
                if (pos >= size) {
                    return false;
                }

                Object obj = ((ListView) view).getItemAtPosition(pos);
                BaseData item = (BaseData) obj;
                return item.getValue() == val;
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText(
                    "ListView should have " + val + " item at position " + pos
                );
            }
        };
    }




    public void mostramosListaDeContadoresConDimensionP1(String p1) {
        int size = Integer.valueOf(p1);

        onView (withId (R.id.counterList)).check (matches (withListSize (size)));
    }

    public void pulsamosBotonDeListaDeContadores() {
        onView(withId(R.id.counterButton)).perform(click());
    }

    public void mostramosContadorEnListaEnPosicionP1ConValorP2(String p1, String p2) {
        int pos = Integer.valueOf(p1);
        int val = Integer.valueOf(p2);

        onView(withId (R.id.counterList))
            .check(matches(withValueAtPosition(val, pos)));
    }

    public void pulsamosBotonDeContadorEnPosicionP1(String p1) {
        int pos = Integer.valueOf(p1);

        onData(allOf())
            .inAdapterView(withId(R.id.counterList))
            .atPosition(pos)
            .perform(click());
    }

    public void mostramosListaDeClicsConDimensionP1(String p1) {
        int size = Integer.valueOf(p1);

        onView (withId (R.id.clickList)).check (matches (withListSize (size)));
    }

    public void pulsamosBotonDeListaDeClics() {
        onView(withId(R.id.clickButton)).perform(click());
    }

    public void mostramosClicEnListaEnPosicionP1ConValorP2(String p1, String p2) {
        int pos = Integer.valueOf(p1);
        int val = Integer.valueOf(p2);

        onView(withId (R.id.clickList))
            .check(matches(withValueAtPosition(val, pos)));
    }

    public void pulsamosBotonDeClicsEnPosicionP1(String p1) {
        int pos = Integer.valueOf(p1);

        onData(allOf())
            .inAdapterView(withId(R.id.clickList))
            .atPosition(pos)
            .perform(click());
    }

    public void pulsamosBackEnListaDeContadores() {
        pressBack();
    }
}