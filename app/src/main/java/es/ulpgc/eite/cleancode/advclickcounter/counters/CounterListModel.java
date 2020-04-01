package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class CounterListModel implements CounterListContract.Model {

  public static String TAG = CounterListModel.class.getSimpleName();

  private List<CounterData> counters;

  public CounterListModel() {
    counters = new ArrayList<>();
  }


  @Override
  public List<CounterData> getStoredCounterList() {
    // Log.e(TAG, "getStoredCounterList()");
    return counters;
  }

  @Override
  public void onRestartScreen(List<CounterData> counters) {
    // Log.e(TAG, "onRestartScreen()");
    this.counters=counters;
  }

  @Override
  public void onAddCounter(CounterData counter) {
    counters.add(counter);
  }

  @Override
  public void onDataFromNextScreen(CounterData counter) {
    // Log.e(TAG, "onDataFromNextScreen()");

    int clicks=0;
    for(ClickData click: counter.clicks){
      clicks = clicks + click.value;
    }

    Log.e(TAG, "clicks: "+clicks);

    counter.value=clicks;
    counters.set(counters.indexOf(counter), counter);
  }

}
