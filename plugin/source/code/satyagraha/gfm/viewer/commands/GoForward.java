package code.satyagraha.gfm.viewer.commands;

import java.util.logging.Logger;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import code.satyagraha.gfm.ui.impl.ViewLocator;
import code.satyagraha.gfm.viewer.views.api.ViewerActions;

public class GoForward extends AbstractHandler {

    private static Logger LOGGER = Logger.getLogger(GoForward.class.getPackage().getName());

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        LOGGER.fine("");
        ViewLocator.findViewImplementing(ViewerActions.class).goForward();
        return null;
    }

}
