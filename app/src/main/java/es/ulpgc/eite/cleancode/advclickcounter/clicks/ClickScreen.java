package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;

public class ClickScreen {

  public static void configure(ClickContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    //String data = context.get().getString(R.string.app_name);

    AppMediator mediator = (AppMediator) context.get().getApplication();
    ClickState state = mediator.getClickState();

    ClickContract.Router router = new ClickRouter(mediator);
    ClickContract.Presenter presenter = new ClickPresenter(state);
    //ClickContract.Model model = new ClickModel(data);
    ClickContract.Model model = new ClickModel();
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
