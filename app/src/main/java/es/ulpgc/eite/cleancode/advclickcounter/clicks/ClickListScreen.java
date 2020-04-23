package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;

public class ClickListScreen {

  public static void configure(ClickListContract.View view) {

    AppMediator mediator = AppMediator.getInstance();
    ClickListState state = mediator.getClickListState();

    ClickListContract.Router router = new ClickListRouter(mediator);
    ClickListContract.Presenter presenter = new ClickListPresenter(state);
    ClickListContract.Model model = new ClickListModel();
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
