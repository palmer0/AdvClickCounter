package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class ClickRouter implements ClickContract.Router {

  public static String TAG = ClickRouter.class.getSimpleName();

  private AppMediator mediator;

  public ClickRouter(AppMediator mediator) {
    this.mediator = mediator;
  }


  @Override
  public void passStateToPreviousScreen(ClickToCounterState state) {
    mediator.setPreviousDetailScreenState(state);
  }

  @Override
  public CounterToClickState getStateFromPreviousScreen() {
    return mediator.getPreviousDetailScreenState();
  }

}
