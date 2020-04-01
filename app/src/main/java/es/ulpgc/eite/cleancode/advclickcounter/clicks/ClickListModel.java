package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class ClickListModel implements ClickListContract.Model {

  public static String TAG = ClickListModel.class.getSimpleName();

  public CounterData counter;


  @Override
  public CounterData getStoredData() {
    // Log.e(TAG, "getStoredCounterList()");
    return counter;
  }

  @Override
  public void onRestartScreen(CounterData counter) {
    // Log.e(TAG, "onRestartScreen()");
    this.counter=counter;
  }


  @Override
  public void onDataFromPreviousScreen(CounterData counter) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
    this.counter=counter;
  }

  @Override
  public void onAddClick(ClickData click) {
    counter.clicks.add(click);
  }

  @Override
  public void onUpdateClick(ClickData click) {
    click.value++;
    counter.clicks.set(counter.clicks.indexOf(click), click);
  }
}
