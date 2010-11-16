package org.jboss.tools.vpe.ui.bot.test.editor.pagedesign;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.jboss.tools.ui.bot.ext.types.IDELabel;
import org.jboss.tools.vpe.ui.bot.test.Activator;
import org.jboss.tools.vpe.ui.bot.test.editor.VPEEditorTestCase;

public abstract class PageDesignTestCase extends VPEEditorTestCase{
	
	final static String PAGE_DESIGN = "Page Design Options"; //$NON-NLS-1$

	@Override
	protected void closeUnuseDialogs() {
		try {
			bot.shell(PAGE_DESIGN).close();
		} catch (WidgetNotFoundException e) {
		}
	}

	@Override
	protected boolean isUnuseDialogOpened() {
		boolean isOpened = false;
		try {
			bot.shell(PAGE_DESIGN).activate();
			isOpened = true;
		} catch (WidgetNotFoundException e) {
		}
		return isOpened;
	}
	
	void closePage(){
		bot.editorByTitle(TEST_PAGE).close();
	}
	
	@Override
	protected String getPathToResources(String testPage) throws IOException {
		String filePath = FileLocator.toFileURL(Platform.getBundle(Activator.PLUGIN_ID).getEntry("/")).getFile()+"resources/pagedesign/"+testPage;  //$NON-NLS-1$//$NON-NLS-2$
		File file = new File(filePath);
		if (!file.isFile()) {
			filePath = FileLocator.toFileURL(Platform.getBundle(Activator.PLUGIN_ID).getEntry("/")).getFile()+"pagedesign/"+testPage; //$NON-NLS-1$ //$NON-NLS-2$
		}
		return filePath;
	}
	/**
	 * Deletes all defined EL Substitutions. VPE has to be opened when called this method
	 */
	public void deleteAllELSubstitutions(){
	  SWTBot optionsDialogBot = bot.shell(IDELabel.Shell.PAGE_DESIGN_OPTIONS).activate().bot();
    optionsDialogBot.tabItem(IDELabel.PageDesignOptionsDialog.SUBSTITUTED_EL_EXPRESSIONS_TAB).activate();
    SWTBotTable elVariablesTable = optionsDialogBot.table();
    while (elVariablesTable.rowCount() > 0){
      elVariablesTable.select(0);
      optionsDialogBot.button(IDELabel.Button.REMOVE).click();
    }
    optionsDialogBot.button(IDELabel.Button.OK).click();
	}
}
