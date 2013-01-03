package pl.keepcoding.swing.custom;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.l2fprod.common.swing.JOutlookBar;

/**
 * @author msanecki
 * The aim of this class is to demonstrate JOutlookbar from http://www.l2fprod.com/common
 */
public class JOutlookBarDemo {

	
	public static void main(String[] args) {
		
//		com.l2fprod.common.swing.
		JOutlookBar outlookBar = new JOutlookBar();
		
		
		JFrame mainFrame = new JFrame("JOutlookbar Demo");
		
		
		outlookBar.insertTab("Tab 1", null, new JButton("Button"), "", 0);
		outlookBar.insertTab("Tab 2", null, new JButton("Button"), "", 0);
		outlookBar.insertTab("Tab 3", null, new JButton("Button"), "", 0);
		
		mainFrame.add(outlookBar);
		
		mainFrame.setSize(300, 300);
		mainFrame.setVisible(true);
		
	}
}
