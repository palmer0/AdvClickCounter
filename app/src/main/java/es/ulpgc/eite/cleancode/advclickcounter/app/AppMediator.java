package es.ulpgc.eite.cleancode.advclickcounter.app;

import android.app.Application;

import es.ulpgc.eite.cleancode.advclickcounter.clicks.ClickListState;
import es.ulpgc.eite.cleancode.advclickcounter.counters.CounterListState;

public class AppMediator extends Application {

  private CounterListState counterListState;
  private ClickListState clickListState;

  private ClickToCounterState clickToCounterState;
  private CounterToClickState counterToClickState;

  @Override
  public void onCreate() {
    super.onCreate();

    counterListState =new CounterListState();
    clickListState = new ClickListState();
  }

  public CounterListState getCounterListState() {
    return counterListState;
  }

  public ClickListState getClickListState() {
    return clickListState;
  }

  public void setNextMasterScreenState(CounterToClickState state) {
    counterToClickState =state;
  }

  public ClickToCounterState getNextMasterScreenState() {
    ClickToCounterState state = clickToCounterState;
    clickToCounterState= null;
    return state;
  }

  public void setPreviousDetailScreenState(ClickToCounterState state) {
    clickToCounterState =state;
  }

  public CounterToClickState getPreviousDetailScreenState() {
    CounterToClickState state = counterToClickState;
    counterToClickState= null;
    return state;
  }
}
