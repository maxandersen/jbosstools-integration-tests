/*******************************************************************************
 * Copyright (c) 2007-2010 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.vpe.ui.bot.test.wizard;

import org.eclipse.swtbot.swt.finder.SWTBotTestCase;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;

/**
 * This test class open vpe preference page
 * Window->Preferences->JBoss Tools->Web->Editors->Visual Page Editor->Templates
 * 
 * @author mareshkau
 *
 */
public class VPESourceCodeTemplatesPreferencePageTest extends SWTBotTestCase{

	//just open a VPE Source Code templates preference test page
	public void testSourceCodeTemplatesPreferencePage() {
		this.bot.menu("Window").menu("Preferences").click(); //$NON-NLS-1$ //$NON-NLS-2$
		SWTBotTree preferenceTree = this.bot.tree();
		preferenceTree
		.expandNode("JBoss Tools") //$NON-NLS-1$
		.expandNode("Web") //$NON-NLS-1$
		.expandNode("Editors") //$NON-NLS-1$
		.expandNode("Visual Page Editor") //$NON-NLS-1$
		.select("Templates").click(); //$NON-NLS-1$
		this.bot.button("New...").click(); //$NON-NLS-1$
		this.bot.button("Cancel").click(); //$NON-NLS-1$
		System.out.println(this.bot.activeShell().getText());
	}
}
