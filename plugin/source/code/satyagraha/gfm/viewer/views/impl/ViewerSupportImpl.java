package code.satyagraha.gfm.viewer.views.impl;

import java.util.logging.Logger;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.State;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.RegistryToggleState;

import code.satyagraha.gfm.di.Component;
import code.satyagraha.gfm.viewer.views.api.ViewerSupport;

@Component
public class ViewerSupportImpl implements ViewerSupport {

    private static Logger LOGGER = Logger.getLogger(ViewerSupportImpl.class.getPackage().getName());

    @Override
    public boolean isLinked() {
        LOGGER.fine("");
        ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(ICommandService.class);
        Command command = commandService.getCommand("GFM Viewer plugin.Linked");
        State state = command.getState(RegistryToggleState.STATE_ID);
        return (Boolean) state.getValue();
    }

}
