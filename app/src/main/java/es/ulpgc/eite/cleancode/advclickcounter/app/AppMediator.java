package es.ulpgc.eite.cleancode.advclickcounter.app;

import android.app.Application;

import es.ulpgc.eite.cleancode.advclickcounter.clicks.ClickState;
import es.ulpgc.eite.cleancode.advclickcounter.counters.CounterState;

public class AppMediator extends Application {

  private CounterState counterState;
  private ClickState clickState;

  private ClickToCounterState clickToCounterState;
  private CounterToClickState counterToClickState;

  @Override
  public void onCreate() {
    super.onCreate();

    counterState =new CounterState();
    clickState = new ClickState();
  }

  public CounterState getCounterState() {
    return counterState;
  }

  public ClickState getClickState() {
    return clickState;
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
