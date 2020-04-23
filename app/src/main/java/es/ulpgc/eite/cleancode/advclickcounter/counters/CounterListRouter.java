package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.content.Context;
import android.content.Intent;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;
import es.ulpgc.eite.cleancode.advclickcounter.clicks.ClickListActivity;

public class CounterListRouter implements CounterListContract.Router {

  public static String TAG = CounterListRouter.class.getSimpleName();

  private AppMediator mediator;

  public CounterListRouter(AppMediator mediator) {
    this.mediator = mediator;
  }


  @Override
  public void passStateToNextScreen(CounterToClickState state) {
    mediator.setNextMasterScreenState(state);
  }


  @Override
  public ClickToCounterState getStateFromNextScreen() {
    return mediator.getNextMasterScreenState();
  }
}
