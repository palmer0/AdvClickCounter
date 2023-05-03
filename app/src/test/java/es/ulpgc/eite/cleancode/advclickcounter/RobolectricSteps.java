package es.ulpgc.eite.cleancode.advclickcounter;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import android.os.Bundle;
import android.widget.ListView;

import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;

import es.ulpgc.eite.cleancode.advclickcounter.clicks.ClickListActivity;
import es.ulpgc.eite.cleancode.advclickcounter.clicks.ClickListAdapter;
import es.ulpgc.eite.cleancode.advclickcounter.counters.CounterListActivity;
import es.ulpgc.eite.cleancode.advclickcounter.counters.CounterListAdapter;
import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class RobolectricSteps {


    private ActivityController<CounterListActivity> counterTestCtrl;
    private ActivityController<ClickListActivity> clickTestCtrl;

    public void iniciamosPantallaP1(String p1) {

        if(p1.equals("Counters")) {

            //AppMediator.resetInstance();

            counterTestCtrl = Robolectric.buildActivity(CounterListActivity.class);
            counterTestCtrl.create().resume().visible();

        }

        if(p1.equals("Clicks")) {
            counterTestCtrl.pause();

            clickTestCtrl = Robolectric.buildActivity(ClickListActivity.class);
            clickTestCtrl.create().resume().visible();

        }

    }


    public void rotarPantallaP1(String p1) {

        Bundle bundle = new Bundle();

        if(p1.equals("Counters")) {
            counterTestCtrl
                .saveInstanceState(bundle)
                .pause()
                .stop()
                .destroy();

            counterTestCtrl = Robolectric.buildActivity(CounterListActivity.class)
                .create(bundle)
                .restoreInstanceState(bundle)
                .resume()
                .visible();
        }

        if(p1.equals("Clicks")) {
            clickTestCtrl
                .saveInstanceState(bundle)
                .pause()
                .stop()
                .destroy();

            clickTestCtrl = Robolectric.buildActivity(ClickListActivity.class)
                .create(bundle)
                .restoreInstanceState(bundle)
                .resume()
                .visible();

        }

    }


    public void mostramosListaDeContadoresConDimensionP1(String p1) {
        int size = Integer.valueOf(p1);

        //onView (withId (R.id.counterList)).check (matches (withListSize (size)));


        CounterListActivity activity = counterTestCtrl.get();

        ListView list = activity.findViewById(R.id.counterList);
        CounterListAdapter adapter = (CounterListAdapter) list.getAdapter();


        assertThat(adapter.getCount(), equalTo(size));
    }

    public void pulsamosBotonDeListaDeContadores() {
        //onView(withId(R.id.counterButton)).perform(click());

        CounterListActivity activity = counterTestCtrl.get();
        activity.findViewById(R.id.counterButton).performClick();
    }

    public void mostramosContadorEnListaEnPosicionP1ConValorP2(String p1, String p2) {
        int pos = Integer.valueOf(p1);
        int val = Integer.valueOf(p2);

        /*onView(withId (R.id.counterList))
            .check(matches(withValueAtPosition(val, pos)));*/


        CounterListActivity activity = counterTestCtrl.get();

        ListView list = activity.findViewById(R.id.counterList);
        CounterListAdapter adapter = (CounterListAdapter) list.getAdapter();
        CounterData item = adapter.getItem(pos);

        assertThat(item.value, equalTo(val));
    }

    public void pulsamosBotonDeContadorEnPosicionP1(String p1) {
        int pos = Integer.valueOf(p1);

        /*onData(allOf())
            .inAdapterView(withId(R.id.counterList))
            .atPosition(pos)
            .perform(click());*/


        CounterListActivity activity = counterTestCtrl.get();
        ListView list = activity.findViewById(R.id.counterList);

        list.measure(0,0);
        list.layout(0,0,100,1000);

        //list.smoothScrollToPosition(pos);
        list.getChildAt(pos).performClick();
        //shadowOf(list).performItemClick(pos);
    }

    public void mostramosListaDeClicsConDimensionP1(String p1) {
        int size = Integer.valueOf(p1);

        //onView (withId (R.id.clickList)).check (matches (withListSize (size)));

        ClickListActivity activity = clickTestCtrl.get();

        ListView list = activity.findViewById(R.id.clickList);
        ClickListAdapter adapter = (ClickListAdapter) list.getAdapter();


        assertThat(adapter.getCount(), equalTo(size));
    }

    public void pulsamosBotonDeListaDeClics() {
        //onView(withId(R.id.clickButton)).perform(click());

        ClickListActivity activity = clickTestCtrl.get();
        activity.findViewById(R.id.clickButton).performClick();
    }

    public void mostramosClicEnListaEnPosicionP1ConValorP2(String p1, String p2) {
        int pos = Integer.valueOf(p1);
        int val = Integer.valueOf(p2);

        /*onView(withId (R.id.clickList))
            .check(matches(withValueAtPosition(val, pos)));*/

        ClickListActivity activity = clickTestCtrl.get();

        ListView list = activity.findViewById(R.id.clickList);
        ClickListAdapter adapter = (ClickListAdapter) list.getAdapter();
        ClickData item = adapter.getItem(pos);

        assertThat(item.value, equalTo(val));
    }

    public void pulsamosBotonDeClicsEnPosicionP1(String p1) {
        int pos = Integer.valueOf(p1);

        /*onData(allOf())
            .inAdapterView(withId(R.id.clickList))
            .atPosition(pos)
            .perform(click());*/

        ClickListActivity activity = clickTestCtrl.get();
        ListView list = activity.findViewById(R.id.clickList);

        list.measure(0,0);
        list.layout(0,0,100,1000);

        //list.smoothScrollToPosition(pos);
        list.getChildAt(pos).performClick();
        //shadowOf(list).performItemClick(pos);
    }

    public void pulsamosBackEnListaDeClics() {
        //pressBack();

        clickTestCtrl.pause().destroy();
        counterTestCtrl.resume().visible();
    }


}