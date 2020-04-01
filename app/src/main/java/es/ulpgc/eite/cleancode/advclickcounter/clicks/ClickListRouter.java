package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class ClickListRouter implements ClickListContract.Router {

  public static String TAG = ClickListRouter.class.getSimpleName();

  private AppMediator mediator;

  public ClickListRouter(AppMediator mediator) {
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
