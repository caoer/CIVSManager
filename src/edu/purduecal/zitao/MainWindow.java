package edu.purduecal.zitao;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.layout.grouplayout.GroupLayout;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.layout.RowData;

public class MainWindow {

	protected Shell shlCivsProjectManager;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text htmlText;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCivsProjectManager.open();
		shlCivsProjectManager.layout();
		while (!shlCivsProjectManager.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCivsProjectManager = new Shell();
		shlCivsProjectManager.setSize(787, 839);
		shlCivsProjectManager.setText("CIVS Project Manager");
		shlCivsProjectManager.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		TabFolder tabFolder = new TabFolder(shlCivsProjectManager, SWT.NONE);
		

		
		TabItem tbtmAddproject = new TabItem(tabFolder, SWT.NONE);
		tbtmAddproject.setText("AddProject");
		
		Composite composite = new Composite(tabFolder, SWT.BORDER);
		tbtmAddproject.setControl(composite);
		composite.setLayout(new FormLayout());
		
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		FormData fd_composite_1 = new FormData();
		fd_composite_1.top = new FormAttachment(0);
		fd_composite_1.right = new FormAttachment(0, 765);
		fd_composite_1.left = new FormAttachment(0);
		composite_1.setLayoutData(fd_composite_1);
		composite_1.setLayout(new GridLayout(2, false));
		
		
		Label label = new Label(composite_1, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label.setText("Title");
		
		text = new Text(composite_1, SWT.BORDER);
		text.setText("Title");
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_1 = new Label(composite_1, SWT.NONE);
		label_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_1.setText("SubTitle");
		
		text_1 = new Text(composite_1, SWT.BORDER);
		text_1.setText("Sub Title");
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_2 = new Label(composite_1, SWT.NONE);
		label_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_2.setText("Problem");
		
		text_2 = new Text(composite_1, SWT.BORDER | SWT.MULTI);
		text_2.setText("Problem");
		GridData gd_text_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_2.heightHint = 85;
		text_2.setLayoutData(gd_text_2);
		
		Label label_3 = new Label(composite_1, SWT.NONE);
		label_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_3.setText("Project");
		
		text_3 = new Text(composite_1, SWT.BORDER | SWT.MULTI);
		text_3.setText("Project");
		GridData gd_text_3 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_3.heightHint = 80;
		text_3.setLayoutData(gd_text_3);
		
		Label label_4 = new Label(composite_1, SWT.NONE);
		label_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_4.setText("Outcome");
		
		text_4 = new Text(composite_1, SWT.BORDER | SWT.MULTI);
		text_4.setText("Outcome");
		GridData gd_text_4 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_4.heightHint = 82;
		text_4.setLayoutData(gd_text_4);
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		fd_composite_1.bottom = new FormAttachment(composite_2, -6);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		FormData fd_composite_2 = new FormData();
		fd_composite_2.left = new FormAttachment(0);
		fd_composite_2.right = new FormAttachment(100);
		fd_composite_2.top = new FormAttachment(0, 615);
		composite_2.setLayoutData(fd_composite_2);
		
		Composite compositeControl = new Composite(composite, SWT.NONE);
		fd_composite_2.bottom = new FormAttachment(compositeControl, -6);
		
		htmlText = new Text(composite_2, SWT.BORDER);
		FormData fd_compositeControl = new FormData();
		fd_compositeControl.bottom = new FormAttachment(0, 777);
		fd_compositeControl.right = new FormAttachment(0, 765);
		fd_compositeControl.top = new FormAttachment(0, 713);
		fd_compositeControl.left = new FormAttachment(0);
		compositeControl.setLayoutData(fd_compositeControl);
		
		Button btnSubmit = new Button(compositeControl, SWT.NONE);
		btnSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				StringBuilder sb = new StringBuilder();
				sb.append("<h2><hr />THE PROBLEM</h2><p>\n" + text_3.getText() + "\n</p><h2><hr />THE PROJECT</h2><p>" );
				sb.append(text_3.getText() + "</p><h2><hr />THE OUTCOME</h2>\n<p>" + 
				text_4.getText() + "<br /><br class=\"spacer_\" /></p>" );
				htmlText.setText(sb.toString());
			}
		});
		btnSubmit.setBounds(661, 26, 94, 28);
		btnSubmit.setText("Submit");
		
		TabItem tbtmProjectoverview = new TabItem(tabFolder, SWT.NONE);
		tbtmProjectoverview.setText("ProjectOverview");
		
	}
}
