package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import es.ulpgc.eite.cleancode.advclickcounter.app.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterData;

public class ClickModel implements ClickContract.Model {

  public static String TAG = ClickModel.class.getSimpleName();

  //private String data;
  public CounterData counter;
  //public List<ClickData> clicks;

  /*
  public ClickModel(String data) {
    this.data = data;
  }
  */

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

  /*
  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
  }
  */

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
