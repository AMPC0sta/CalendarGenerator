package calendar.generator.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JYearChooser;
import javax.swing.JTextField;
import java.awt.Color;

public class CalendarGeneratorApp {

	private JFrame frmCalendarGeneratorApplication;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarGeneratorApp window = new CalendarGeneratorApp();
					window.frmCalendarGeneratorApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalendarGeneratorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalendarGeneratorApplication = new JFrame();
		frmCalendarGeneratorApplication.setResizable(false);
		frmCalendarGeneratorApplication.setTitle("Calendar Generator Application");
		frmCalendarGeneratorApplication.setBounds(100, 100, 1101, 720);
		frmCalendarGeneratorApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalendarGeneratorApplication.getContentPane().setLayout(null);
		
		JLabel lblPickCalType = new JLabel("Select calendar type:");
		lblPickCalType.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPickCalType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPickCalType.setBounds(10, 53, 276, 41);
		frmCalendarGeneratorApplication.getContentPane().add(lblPickCalType);
		
		JLabel lblSelectGregorianDate = new JLabel("Select gregorian date for calendar first day");
		lblSelectGregorianDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSelectGregorianDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectGregorianDate.setBounds(10, 11, 276, 41);
		frmCalendarGeneratorApplication.getContentPane().add(lblSelectGregorianDate);
		
		JLabel lblPickRemainingDays = new JLabel("Select days remaning at this start");
		lblPickRemainingDays.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPickRemainingDays.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPickRemainingDays.setBounds(10, 95, 276, 41);
		frmCalendarGeneratorApplication.getContentPane().add(lblPickRemainingDays);
		
		JLabel lblPickYear = new JLabel("Input starting year");
		lblPickYear.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPickYear.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPickYear.setBounds(10, 137, 276, 41);
		frmCalendarGeneratorApplication.getContentPane().add(lblPickYear);
		
		JLabel lblPickYearsLong = new JLabel("Input how many years long to generate");
		lblPickYearsLong.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPickYearsLong.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPickYearsLong.setBounds(10, 179, 276, 41);
		frmCalendarGeneratorApplication.getContentPane().add(lblPickYearsLong);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(296, 23, 110, 20);
		frmCalendarGeneratorApplication.getContentPane().add(dateChooser);
		
		JComboBox cmbxCalendarType = new JComboBox();
		cmbxCalendarType.setBackground(Color.WHITE);
		cmbxCalendarType.setModel(new DefaultComboBoxModel(new String[] {"445", "454", "544"}));
		cmbxCalendarType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbxCalendarType.setBounds(296, 64, 110, 20);
		frmCalendarGeneratorApplication.getContentPane().add(cmbxCalendarType);
		
		JComboBox cmbxRemainingDays = new JComboBox();
		cmbxRemainingDays.setBackground(Color.WHITE);
		cmbxRemainingDays.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		cmbxRemainingDays.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbxRemainingDays.setBounds(296, 105, 110, 20);
		frmCalendarGeneratorApplication.getContentPane().add(cmbxRemainingDays);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(296, 147, 110, 20);
		frmCalendarGeneratorApplication.getContentPane().add(yearChooser);
		
		JTextField txtYearsLong = new JTextField();
		txtYearsLong.setHorizontalAlignment(SwingConstants.LEFT);
		txtYearsLong.setBounds(296, 190, 110, 20);
		frmCalendarGeneratorApplication.getContentPane().add(txtYearsLong);
		txtYearsLong.setColumns(10);
	}
}
