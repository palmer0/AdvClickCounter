package es.ulpgc.eite.cleancode.advclickcounter.app;

import es.ulpgc.eite.cleancode.advclickcounter.clicks.ClickListState;
import es.ulpgc.eite.cleancode.advclickcounter.counters.CounterListState;

public class AppMediator  {

  private static AppMediator instance;

  private CounterListState counterListState;
  private ClickListState clickListState;

  private ClickToCounterState clickToCounterState;
  private CounterToClickState counterToClickState;

  private AppMediator() {
    //counterListState = new CounterListState();
    //clickListState = new ClickListState();

  }

  public static AppMediator getInstance() {
    if(instance == null){
      instance = new AppMediator();
    }

    return instance;
  }

  public static void resetInstance() {
    instance=null;
  }

  public void setCounterListState(CounterListState state) {
    this.counterListState = state;
  }

  public void setClickListState(ClickListState state) {
    this.clickListState = state;
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
