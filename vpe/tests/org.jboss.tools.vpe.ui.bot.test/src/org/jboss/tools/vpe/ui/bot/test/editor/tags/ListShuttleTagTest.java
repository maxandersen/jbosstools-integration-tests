/*******************************************************************************

 * Copyright (c) 2007-2011 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.vpe.ui.bot.test.editor.tags;

import org.jboss.tools.ui.bot.ext.Timing;

/**
 * Tests Rich Faces List Shuttle Tag behavior 
 * @author vlado pakan
 *
 */
public class ListShuttleTagTest extends AbstractTagTest{
  @Override
  protected void initPageContent() {
    xhtmlEditor.setText("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
      "<html xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
      "  xmlns:ui=\"http://java.sun.com/jsf/facelets\"\n" +
      "  xmlns:f=\"http://java.sun.com/jsf/core\"\n" +
      "  xmlns:rich=\"http://richfaces.org/rich\"\n" + 
      "  xmlns:a4j=\"http://richfaces.org/a4j\">\n" +
      "  <head>\n" +
      "  </head>\n" +
      "  <body>\n" +
      "    <f:view>\n" +
      "      <rich:listShuttle>\n" +
      "      </rich:listShuttle>\n" +
      "    </f:view>\n" +
      "  </body>\n" + 
      "</html>");
  }

  @Override
  protected void verifyTag() {
      assertVisualEditorContainsNodeWithValue(
        xhtmlWebBrowser, 
        "Copy all", 
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContainsNodeWithValue(
        xhtmlWebBrowser, 
        "Copy", 
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContainsNodeWithValue(
        xhtmlWebBrowser, 
        "Remove All", 
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContainsNodeWithValue(
        xhtmlWebBrowser, 
        "Remove", 
          AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContainsNodeWithValue(
        xhtmlWebBrowser, 
        "First", 
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContainsNodeWithValue(
        xhtmlWebBrowser, 
        "Up", 
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContainsNodeWithValue(
        xhtmlWebBrowser, 
        "Last", 
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContainsNodeWithValue(
        xhtmlWebBrowser, 
        "Down", 
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContains(xhtmlWebBrowser,
        "DIV", 
        new String[]{"class"},
        new String[]{"rich-shuttle-button-content"},
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContains(xhtmlWebBrowser,
        "TABLE", 
        new String[]{"class"},
        new String[]{"rich-list-shuttle"},
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContains(xhtmlWebBrowser,
        "DIV", 
        new String[]{"class"},
        new String[]{"rich-shuttle-controls"},
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      assertVisualEditorContains(xhtmlWebBrowser,
        "DIV", 
        new String[]{"class"},
        new String[]{"rich-shuttle-control"},
        AbstractTagTest.TEST_PAGE_NAME_XHTML);
      // check tag selection
      xhtmlWebBrowser.selectDomNode(xhtmlWebBrowser.getDomNodeByTagName("DIV",4), 0);
      bot.sleep(Timing.time3S());
      String selectedText = xhtmlEditor.getSelection();
      String hasToStartWith = "<rich:listShuttle>";
      assertTrue("Selected text in Source Pane has to start with '" + hasToStartWith + "'" +
          "\nbut it is '" + selectedText + "'",
          selectedText.trim().startsWith(hasToStartWith));
      String hasEndWith = "</rich:listShuttle>";
      assertTrue("Selected text in Source Pane has to end with '" + hasEndWith + "'" +
          "\nbut it is '" + selectedText + "'",
          selectedText.trim().endsWith(hasEndWith));
  }

}
