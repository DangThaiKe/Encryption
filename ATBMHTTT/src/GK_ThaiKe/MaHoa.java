package GK_ThaiKe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.List;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.Font;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Window.Type;

import javax.annotation.processing.Messager;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.TextField;
import java.awt.TextArea;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;;

public class MaHoa extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame = new JFrame();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private File file;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaHoa frame = new MaHoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MaHoa() {
		setFont(new Font("Dialog", Font.BOLD, 19));
		setType(Type.UTILITY);
		setTitle("Trang Chủ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 901, 713);
		contentPane.add(tabbedPane);
// Ceaser
		JPanel panel = new JPanel();
		tabbedPane.addTab("Caeser", null, panel, null);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Input text");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 72, 81, 32);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("MÃ HOÁ ĐỐI XỨNG");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(0, 0, 237, 32);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Key text");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 131, 81, 32);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Encrypt");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 192, 71, 24);
		panel.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptCaesar();
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(114, 272, 96, 32);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(252, 272, 96, 32);
		panel.add(btnNewButton_1);

		JButton btnString = new JButton("String");
		btnString.setBackground(new Color(255, 128, 0));
		btnString.setHorizontalAlignment(SwingConstants.LEFT);

		btnString.setForeground(new Color(0, 0, 0));
		btnString.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnString.setBounds(0, 30, 896, 32);
		panel.add(btnString);

		JLabel lblNewLabel_4 = new JLabel("Input text");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(481, 72, 81, 32);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_2_1 = new JLabel("Key text");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(481, 131, 81, 32);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("Decrypt");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(481, 200, 71, 24);
		panel.add(lblNewLabel_3_1);

		JButton btnNewButton_2 = new JButton("Start");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptCaesar();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(590, 272, 96, 32);
		panel.add(btnNewButton_2);

		JButton btnNewButton_1_1 = new JButton("Reset");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(722, 272, 96, 32);
		panel.add(btnNewButton_1_1);

		JButton btnFile = new JButton("File");
		btnFile.setHorizontalAlignment(SwingConstants.LEFT);
		btnFile.setForeground(new Color(0, 0, 0));
		btnFile.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFile.setBackground(new Color(255, 128, 0));
		btnFile.setBounds(0, 345, 896, 32);
		panel.add(btnFile);

		JLabel lblInputFile = new JLabel("Input file\r\n");
		lblInputFile.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputFile.setBounds(0, 402, 81, 32);
		panel.add(lblInputFile);

		JLabel lblNewLabel_2_2 = new JLabel("Key file");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(0, 465, 81, 32);
		panel.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("Encrypt");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(0, 547, 81, 32);
		panel.add(lblNewLabel_2_3);

		JButton btnNewButton_1_2 = new JButton("File");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_8);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(351, 402, 71, 32);
		panel.add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("File");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_7);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3.setBounds(351, 465, 71, 32);
		panel.add(btnNewButton_1_3);

		JButton btnNewButton_3 = new JButton("Start");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptCaesarFile();
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBackground(Color.BLUE);
		btnNewButton_3.setBounds(114, 620, 96, 32);
		panel.add(btnNewButton_3);

		JButton btnNewButton_1_4 = new JButton("Reset");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4.setBounds(252, 620, 96, 32);
		panel.add(btnNewButton_1_4);

		JLabel lblNewLabel_5_1 = new JLabel("Input file");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(481, 402, 81, 32);
		panel.add(lblNewLabel_5_1);

		JLabel lblNewLabel_5_2 = new JLabel("Key file");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(481, 465, 81, 32);
		panel.add(lblNewLabel_5_2);

		JLabel lblNewLabel_5_3 = new JLabel("Decrypt");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(481, 547, 81, 32);
		panel.add(lblNewLabel_5_3);

		JButton btnNewButton_3_1 = new JButton("Start");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptCaesarFile();
			}
		});
		btnNewButton_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_1.setBackground(Color.BLUE);
		btnNewButton_3_1.setBounds(590, 620, 96, 32);
		panel.add(btnNewButton_3_1);

		JButton btnNewButton_1_4_1 = new JButton("Reset");
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_1.setBounds(738, 620, 96, 32);
		panel.add(btnNewButton_1_4_1);

		JButton btnNewButton_1_2_1 = new JButton("File");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_11);
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_1.setBounds(825, 402, 71, 32);
		panel.add(btnNewButton_1_2_1);

		JButton btnNewButton_1_2_2 = new JButton("File");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_10);
			}
		});
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_2.setBounds(825, 465, 71, 32);
		panel.add(btnNewButton_1_2_2);

		textField = new JTextField();
		textField.setBounds(114, 70, 234, 41);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 140, 234, 32);
		panel.add(textField_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 197, 234, 65);
		panel.add(scrollPane);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		scrollPane.setViewportView(textField_2);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(590, 197, 234, 65);
		panel.add(scrollPane_1);

		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		scrollPane_1.setViewportView(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(590, 134, 234, 32);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(590, 72, 234, 41);
		panel.add(textField_5);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(107, 533, 234, 65);
		panel.add(scrollPane_2);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		scrollPane_2.setViewportView(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(107, 465, 234, 32);
		panel.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(107, 393, 234, 41);
		panel.add(textField_8);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(590, 533, 234, 65);
		panel.add(scrollPane_3);

		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		scrollPane_3.setViewportView(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(590, 468, 234, 32);
		panel.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(590, 400, 234, 41);
		panel.add(textField_11);

//Hill	
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		tabbedPane.addTab("Hill", null, panel_1, null);

		JLabel lblNewLabel_5 = new JLabel("Input text");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(0, 72, 81, 32);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_1_1 = new JLabel("MÃ HOÁ ĐỐI XỨNG");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(0, 0, 237, 32);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_4 = new JLabel("Key text");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_4.setBounds(0, 131, 81, 32);
		panel_1.add(lblNewLabel_2_4);

		JLabel lblNewLabel_3_2 = new JLabel("Encrypt");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(0, 192, 71, 24);
		panel_1.add(lblNewLabel_3_2);

		JButton btnNewButton_4 = new JButton("Start");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptHill();
			}
		});
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBackground(Color.BLUE);
		btnNewButton_4.setBounds(114, 272, 96, 32);
		panel_1.add(btnNewButton_4);

		JButton btnNewButton_1_5 = new JButton("Reset");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_5.setBounds(252, 272, 96, 32);
		panel_1.add(btnNewButton_1_5);

		JButton btnString_1 = new JButton("String");
		btnString_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnString_1.setForeground(Color.GRAY);
		btnString_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnString_1.setBackground(Color.RED);
		btnString_1.setBounds(0, 30, 896, 32);
		panel_1.add(btnString_1);

		JLabel lblNewLabel_4_1 = new JLabel("Input text");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(481, 72, 81, 32);
		panel_1.add(lblNewLabel_4_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Key text");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(481, 131, 81, 32);
		panel_1.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("Decrypt");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(481, 200, 71, 24);
		panel_1.add(lblNewLabel_3_1_1);

		JButton btnNewButton_2_1 = new JButton("Start");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptHill();
			}
		});
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_1.setBackground(Color.BLUE);
		btnNewButton_2_1.setBounds(590, 272, 96, 32);
		panel_1.add(btnNewButton_2_1);

		JButton btnNewButton_1_1_1 = new JButton("Reset");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1.setBounds(722, 272, 96, 32);
		panel_1.add(btnNewButton_1_1_1);

		JButton btnFile_1 = new JButton("File");
		btnFile_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnFile_1.setForeground(Color.GRAY);
		btnFile_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFile_1.setBackground(Color.RED);
		btnFile_1.setBounds(0, 345, 896, 32);
		panel_1.add(btnFile_1);

		JLabel lblInputFile_1 = new JLabel("Input file\r\n");
		lblInputFile_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputFile_1.setBounds(0, 402, 81, 32);
		panel_1.add(lblInputFile_1);

		JLabel lblNewLabel_2_2_1 = new JLabel("Key file");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2_1.setBounds(0, 465, 81, 32);
		panel_1.add(lblNewLabel_2_2_1);

		JLabel lblNewLabel_2_3_1 = new JLabel("Encrypt");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_1.setBounds(0, 547, 81, 32);
		panel_1.add(lblNewLabel_2_3_1);

		JButton btnNewButton_1_2_3 = new JButton("File");
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_21);
			}
		});
		btnNewButton_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_3.setBounds(358, 402, 71, 32);
		panel_1.add(btnNewButton_1_2_3);

		JButton btnNewButton_1_3_1 = new JButton("File");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_20);
			}
		});
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3_1.setBounds(358, 465, 71, 32);
		panel_1.add(btnNewButton_1_3_1);

		JButton btnNewButton_3_2 = new JButton("Start");
		btnNewButton_3_2.setForeground(new Color(255, 255, 255));
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_2.setBackground(Color.BLUE);
		btnNewButton_3_2.setBounds(114, 620, 96, 32);
		panel_1.add(btnNewButton_3_2);

		JButton btnNewButton_1_4_2 = new JButton("Reset");
		btnNewButton_1_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_2.setBounds(252, 620, 96, 32);
		panel_1.add(btnNewButton_1_4_2);

		JLabel lblNewLabel_5_1_1 = new JLabel("Input file");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1_1.setBounds(481, 402, 81, 32);
		panel_1.add(lblNewLabel_5_1_1);

		JLabel lblNewLabel_5_2_1 = new JLabel("Key file");
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2_1.setBounds(481, 465, 81, 32);
		panel_1.add(lblNewLabel_5_2_1);

		JLabel lblNewLabel_5_3_1 = new JLabel("Decrypt");
		lblNewLabel_5_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3_1.setBounds(481, 547, 81, 32);
		panel_1.add(lblNewLabel_5_3_1);

		JButton btnNewButton_3_1_1 = new JButton("Start");
		btnNewButton_3_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_1_1.setBackground(Color.BLUE);
		btnNewButton_3_1_1.setBounds(590, 628, 96, 32);
		panel_1.add(btnNewButton_3_1_1);

		JButton btnNewButton_1_4_1_1 = new JButton("Reset");
		btnNewButton_1_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_1_1.setBounds(722, 628, 96, 32);
		panel_1.add(btnNewButton_1_4_1_1);

		JButton btnNewButton_1_2_1_1 = new JButton("File");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_23);
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_1_1.setBounds(825, 409, 71, 32);
		panel_1.add(btnNewButton_1_2_1_1);

		JButton btnNewButton_1_2_2_1 = new JButton("File");
		btnNewButton_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_22);
			}
		});
		btnNewButton_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_2_1.setBounds(825, 465, 71, 32);
		panel_1.add(btnNewButton_1_2_2_1);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(584, 72, 234, 41);
		panel_1.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(114, 140, 234, 32);
		panel_1.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(114, 72, 234, 41);
		panel_1.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(584, 140, 234, 32);
		panel_1.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(114, 192, 234, 65);
		panel_1.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		textField_17.setBounds(584, 192, 234, 65);
		panel_1.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(114, 525, 234, 65);
		panel_1.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		textField_19.setBounds(590, 525, 234, 65);
		panel_1.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(114, 465, 234, 32);
		panel_1.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(114, 400, 234, 41);
		panel_1.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(590, 469, 234, 29);
		panel_1.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(590, 403, 234, 38);
		panel_1.add(textField_23);
//Affine
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Affine", null, panel_2, null);

		JLabel lblNewLabel_6 = new JLabel("Input text");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(0, 72, 81, 32);
		panel_2.add(lblNewLabel_6);

		JLabel lblNewLabel_1_2 = new JLabel("MÃ HOÁ ĐỐI XỨNG");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(0, 0, 237, 32);
		panel_2.add(lblNewLabel_1_2);

		JLabel lblNewLabel_2_5 = new JLabel("Key text");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(0, 131, 81, 32);
		panel_2.add(lblNewLabel_2_5);

		JLabel lblNewLabel_3_3 = new JLabel("Encrypt");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(0, 192, 71, 24);
		panel_2.add(lblNewLabel_3_3);

		JButton btnNewButton_5 = new JButton("Start");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptAffine();
			}
		});
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBackground(Color.BLUE);
		btnNewButton_5.setBounds(114, 272, 96, 32);
		panel_2.add(btnNewButton_5);

		JButton btnNewButton_1_6 = new JButton("Reset");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_6.setBounds(252, 272, 96, 32);
		panel_2.add(btnNewButton_1_6);

		JButton btnString_2 = new JButton("String");
		btnString_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnString_2.setForeground(Color.GRAY);
		btnString_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnString_2.setBackground(Color.RED);
		btnString_2.setBounds(0, 30, 896, 32);
		panel_2.add(btnString_2);

		JLabel lblNewLabel_4_2 = new JLabel("Input text");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(481, 72, 81, 32);
		panel_2.add(lblNewLabel_4_2);

		JLabel lblNewLabel_2_1_2 = new JLabel("Key text");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_2.setBounds(481, 131, 81, 32);
		panel_2.add(lblNewLabel_2_1_2);

		JLabel lblNewLabel_3_1_2 = new JLabel("Decrypt");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_2.setBounds(481, 200, 71, 24);
		panel_2.add(lblNewLabel_3_1_2);

		JButton btnNewButton_2_2 = new JButton("Start");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptAffine();
			}
		});
		btnNewButton_2_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_2.setBackground(Color.BLUE);
		btnNewButton_2_2.setBounds(590, 272, 96, 32);
		panel_2.add(btnNewButton_2_2);

		JButton btnNewButton_1_1_2 = new JButton("Reset");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_2.setBounds(722, 272, 96, 32);
		panel_2.add(btnNewButton_1_1_2);

		JButton btnFile_2 = new JButton("File");
		btnFile_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnFile_2.setForeground(Color.GRAY);
		btnFile_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFile_2.setBackground(Color.RED);
		btnFile_2.setBounds(0, 345, 896, 32);
		panel_2.add(btnFile_2);

		JLabel lblInputFile_2 = new JLabel("Input file\r\n");
		lblInputFile_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputFile_2.setBounds(0, 402, 81, 32);
		panel_2.add(lblInputFile_2);

		JLabel lblNewLabel_2_2_2 = new JLabel("Key file");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2_2.setBounds(0, 465, 81, 32);
		panel_2.add(lblNewLabel_2_2_2);

		JLabel lblNewLabel_2_3_2 = new JLabel("Encrypt");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_2.setBounds(0, 547, 81, 32);
		panel_2.add(lblNewLabel_2_3_2);

		JButton btnNewButton_1_2_4 = new JButton("File");
		btnNewButton_1_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_26);
			}
		});
		btnNewButton_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_4.setBounds(358, 402, 71, 32);
		panel_2.add(btnNewButton_1_2_4);

		JButton btnNewButton_1_3_2 = new JButton("File");
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_30);
			}
		});
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3_2.setBounds(139, 507, 71, 32);
		panel_2.add(btnNewButton_1_3_2);

		JButton btnNewButton_3_3 = new JButton("Start");
		btnNewButton_3_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_3.setBackground(Color.BLUE);
		btnNewButton_3_3.setBounds(114, 620, 96, 32);
		panel_2.add(btnNewButton_3_3);

		JButton btnNewButton_1_4_3 = new JButton("Reset");
		btnNewButton_1_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_3.setBounds(252, 620, 96, 32);
		panel_2.add(btnNewButton_1_4_3);

		JLabel lblNewLabel_5_1_2 = new JLabel("Input file");
		lblNewLabel_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1_2.setBounds(481, 402, 81, 32);
		panel_2.add(lblNewLabel_5_1_2);

		JLabel lblNewLabel_5_2_2 = new JLabel("Key file");
		lblNewLabel_5_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2_2.setBounds(481, 465, 81, 32);
		panel_2.add(lblNewLabel_5_2_2);

		JLabel lblNewLabel_5_3_2 = new JLabel("Decrypt");
		lblNewLabel_5_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3_2.setBounds(481, 547, 81, 32);
		panel_2.add(lblNewLabel_5_3_2);

		JButton btnNewButton_3_1_2 = new JButton("Start");
		btnNewButton_3_1_2.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_1_2.setBackground(Color.BLUE);
		btnNewButton_3_1_2.setBounds(590, 628, 96, 32);
		panel_2.add(btnNewButton_3_1_2);

		JButton btnNewButton_1_4_1_2 = new JButton("Reset");
		btnNewButton_1_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_1_2.setBounds(722, 628, 96, 32);
		panel_2.add(btnNewButton_1_4_1_2);

		JButton btnNewButton_1_2_1_2 = new JButton("File");
		btnNewButton_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_27);
			}
		});
		btnNewButton_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_1_2.setBounds(825, 402, 71, 32);
		panel_2.add(btnNewButton_1_2_1_2);

		JButton btnNewButton_1_2_2_2 = new JButton("File");
		btnNewButton_1_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_31);
			}
		});
		btnNewButton_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_2_2.setBounds(615, 507, 71, 32);
		panel_2.add(btnNewButton_1_2_2_2);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(114, 72, 234, 41);
		panel_2.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(590, 72, 234, 41);
		panel_2.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(114, 400, 234, 41);
		panel_2.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(590, 400, 234, 41);
		panel_2.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(114, 140, 115, 32);
		panel_2.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(590, 140, 115, 32);
		panel_2.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(114, 465, 115, 32);
		panel_2.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(590, 465, 115, 32);
		panel_2.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(114, 545, 234, 65);
		panel_2.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setEnabled(false);
		textField_33.setColumns(10);
		textField_33.setBounds(590, 545, 234, 65);
		panel_2.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(114, 197, 234, 65);
		panel_2.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setEnabled(false);
		textField_35.setColumns(10);
		textField_35.setBounds(590, 197, 234, 65);
		panel_2.add(textField_35);

		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(233, 140, 115, 32);
		panel_2.add(textField_64);

		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(709, 140, 115, 32);
		panel_2.add(textField_65);

		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(233, 465, 115, 32);
		panel_2.add(textField_66);

		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(709, 465, 115, 32);
		panel_2.add(textField_67);
		
		JButton btnNewButton_1_3_2_1 = new JButton("File");
		btnNewButton_1_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_66);
			}
		});
		btnNewButton_1_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3_2_1.setBounds(252, 507, 71, 32);
		panel_2.add(btnNewButton_1_3_2_1);
		
		JButton btnNewButton_1_2_2_2_1 = new JButton("File");
		btnNewButton_1_2_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_67);
			}
		});
		btnNewButton_1_2_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_2_2_1.setBounds(722, 507, 71, 32);
		panel_2.add(btnNewButton_1_2_2_2_1);
//HoanVi
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane.addTab("Hoán Vị", null, panel_3, null);

		JLabel lblNewLabel_7 = new JLabel("Input text");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(0, 72, 81, 32);
		panel_3.add(lblNewLabel_7);

		JLabel lblNewLabel_1_3 = new JLabel("MÃ HOÁ ĐỐI XỨNG");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(0, 0, 237, 32);
		panel_3.add(lblNewLabel_1_3);

		JLabel lblNewLabel_3_4 = new JLabel("Encrypt");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(0, 207, 71, 24);
		panel_3.add(lblNewLabel_3_4);

		JButton btnNewButton_6 = new JButton("Start");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptHoanVi();
			}
		});
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6.setBackground(Color.BLUE);
		btnNewButton_6.setBounds(114, 275, 96, 32);
		panel_3.add(btnNewButton_6);

		JButton btnNewButton_1_7 = new JButton("Reset");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_7.setBounds(252, 275, 96, 32);
		panel_3.add(btnNewButton_1_7);

		JButton btnString_3 = new JButton("String");
		btnString_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnString_3.setForeground(Color.GRAY);
		btnString_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnString_3.setBackground(Color.RED);
		btnString_3.setBounds(0, 30, 907, 32);
		panel_3.add(btnString_3);

		JButton btnFile_3 = new JButton("File");
		btnFile_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnFile_3.setForeground(Color.GRAY);
		btnFile_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFile_3.setBackground(Color.RED);
		btnFile_3.setBounds(0, 345, 896, 32);
		panel_3.add(btnFile_3);

		JLabel lblInputFile_3 = new JLabel("Input file\r\n");
		lblInputFile_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputFile_3.setBounds(0, 402, 81, 32);
		panel_3.add(lblInputFile_3);

		JLabel lblNewLabel_2_3_3 = new JLabel("Encrypt");
		lblNewLabel_2_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_3.setBounds(0, 555, 81, 32);
		panel_3.add(lblNewLabel_2_3_3);

		JButton btnNewButton_1_2_5 = new JButton("File");
		btnNewButton_1_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_37);
			}
		});
		btnNewButton_1_2_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_5.setBounds(358, 404, 71, 32);
		panel_3.add(btnNewButton_1_2_5);

		JButton btnNewButton_3_4 = new JButton("Start");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptHoanViFile();
			}
		});
		btnNewButton_3_4.setForeground(new Color(255, 255, 255));
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_4.setBackground(Color.BLUE);
		btnNewButton_3_4.setBounds(114, 616, 96, 32);
		panel_3.add(btnNewButton_3_4);

		JButton btnNewButton_1_4_4 = new JButton("Reset");
		btnNewButton_1_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_4.setBounds(252, 616, 96, 32);
		panel_3.add(btnNewButton_1_4_4);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(114, 72, 234, 41);
		panel_3.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(114, 402, 234, 41);
		panel_3.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBounds(114, 189, 234, 65);
		panel_3.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setForeground(new Color(0, 0, 255));
		textField_39.setEditable(false);
		textField_39.setColumns(10);
		textField_39.setBounds(114, 541, 234, 65);
		panel_3.add(textField_39);

		JLabel lblNewLabel_7_2 = new JLabel("Key text");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_2.setBounds(0, 133, 81, 32);
		panel_3.add(lblNewLabel_7_2);

		JLabel lblNewLabel_7_3 = new JLabel("Key file");
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_3.setBounds(0, 474, 81, 32);
		panel_3.add(lblNewLabel_7_3);

		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(114, 123, 234, 41);
		panel_3.add(textField_68);

		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(114, 472, 234, 41);
		panel_3.add(textField_69);

		JButton btnNewButton_1_2_5_2 = new JButton("File");
		btnNewButton_1_2_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_69);
			}
		});
		btnNewButton_1_2_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_5_2.setBounds(358, 474, 71, 32);
		panel_3.add(btnNewButton_1_2_5_2);
		
		JLabel lblNewLabel_7_4 = new JLabel("Input text");
		lblNewLabel_7_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_4.setBounds(486, 72, 81, 32);
		panel_3.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Key text");
		lblNewLabel_7_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_2_1.setBounds(486, 133, 81, 32);
		panel_3.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("Decrypt");
		lblNewLabel_3_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4_2.setBounds(486, 207, 71, 24);
		panel_3.add(lblNewLabel_3_4_2);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(581, 70, 234, 41);
		panel_3.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(581, 131, 234, 41);
		panel_3.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setEnabled(false);
		textField_72.setForeground(new Color(0, 0, 255));
		textField_72.setColumns(10);
		textField_72.setBounds(581, 189, 234, 65);
		panel_3.add(textField_72);
		
		JButton btnNewButton_6_2 = new JButton("Start");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptHoanVi();
			}
		});
		btnNewButton_6_2.setForeground(Color.WHITE);
		btnNewButton_6_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6_2.setBackground(Color.BLUE);
		btnNewButton_6_2.setBounds(581, 275, 96, 32);
		panel_3.add(btnNewButton_6_2);
		
		JButton btnNewButton_1_7_2 = new JButton("Reset");
		btnNewButton_1_7_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_7_2.setBounds(735, 275, 96, 32);
		panel_3.add(btnNewButton_1_7_2);
		
		JLabel lblInputFile_3_2 = new JLabel("Input file\r\n");
		lblInputFile_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputFile_3_2.setBounds(486, 402, 81, 32);
		panel_3.add(lblInputFile_3_2);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("Key file");
		lblNewLabel_7_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_3_1.setBounds(486, 474, 81, 32);
		panel_3.add(lblNewLabel_7_3_1);
		
		JLabel lblNewLabel_2_3_3_2 = new JLabel("Decrypt");
		lblNewLabel_2_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_3_2.setBounds(486, 574, 81, 32);
		panel_3.add(lblNewLabel_2_3_3_2);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(581, 400, 234, 41);
		panel_3.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(581, 472, 234, 41);
		panel_3.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setForeground(Color.BLUE);
		textField_75.setEditable(false);
		textField_75.setColumns(10);
		textField_75.setBounds(581, 541, 234, 65);
		panel_3.add(textField_75);
		
		JButton btnNewButton_3_4_2 = new JButton("Start");
		btnNewButton_3_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptHoanViFile();
			}
		});
		btnNewButton_3_4_2.setForeground(Color.WHITE);
		btnNewButton_3_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_4_2.setBackground(Color.BLUE);
		btnNewButton_3_4_2.setBounds(581, 616, 96, 32);
		panel_3.add(btnNewButton_3_4_2);
		
		JButton btnNewButton_1_4_4_2 = new JButton("Reset");
		btnNewButton_1_4_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_4_2.setBounds(735, 616, 96, 32);
		panel_3.add(btnNewButton_1_4_4_2);
		
		JButton btnNewButton_1_2_5_3 = new JButton("File");
		btnNewButton_1_2_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_73);
			}
		});
		btnNewButton_1_2_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_5_3.setBounds(825, 402, 71, 32);
		panel_3.add(btnNewButton_1_2_5_3);
		
		JButton btnNewButton_1_2_5_3_1 = new JButton("File");
		btnNewButton_1_2_5_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_74);
			}
		});
		btnNewButton_1_2_5_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_5_3_1.setBounds(825, 474, 71, 32);
		panel_3.add(btnNewButton_1_2_5_3_1);
//DES
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane.addTab("DES", null, panel_4, null);

		JLabel lblNewLabel_8 = new JLabel("Input text");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(0, 72, 81, 32);
		panel_4.add(lblNewLabel_8);

		JLabel lblNewLabel_1_4 = new JLabel("MÃ HOÁ ĐỐI XỨNG");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(0, 0, 237, 32);
		panel_4.add(lblNewLabel_1_4);

		JLabel lblNewLabel_2_6 = new JLabel("Key text");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_6.setBounds(0, 131, 81, 32);
		panel_4.add(lblNewLabel_2_6);

		JLabel lblNewLabel_3_5 = new JLabel("Encrypt");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_5.setBounds(0, 192, 71, 24);
		panel_4.add(lblNewLabel_3_5);

		JButton btnNewButton_7 = new JButton("Start");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptDES();
			}
		});
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_7.setBackground(Color.BLUE);
		btnNewButton_7.setBounds(114, 272, 96, 32);
		panel_4.add(btnNewButton_7);

		JButton btnNewButton_1_8 = new JButton("Reset");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_8.setBounds(252, 272, 96, 32);
		panel_4.add(btnNewButton_1_8);

		JButton btnString_4 = new JButton("String");
		btnString_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnString_4.setForeground(Color.GRAY);
		btnString_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnString_4.setBackground(Color.RED);
		btnString_4.setBounds(0, 30, 896, 32);
		panel_4.add(btnString_4);

		JLabel lblNewLabel_4_3 = new JLabel("Input text");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(481, 72, 81, 32);
		panel_4.add(lblNewLabel_4_3);

		JLabel lblNewLabel_2_1_3 = new JLabel("Key text");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_3.setBounds(481, 131, 81, 32);
		panel_4.add(lblNewLabel_2_1_3);

		JLabel lblNewLabel_3_1_3 = new JLabel("Decrypt");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_3.setBounds(481, 200, 71, 24);
		panel_4.add(lblNewLabel_3_1_3);

		JButton btnNewButton_2_3 = new JButton("Start");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptDES();
			}
		});
		btnNewButton_2_3.setForeground(new Color(255, 255, 255));
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_3.setBackground(Color.BLUE);
		btnNewButton_2_3.setBounds(590, 272, 96, 32);
		panel_4.add(btnNewButton_2_3);

		JButton btnNewButton_1_1_3 = new JButton("Reset");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_3.setBounds(722, 272, 96, 32);
		panel_4.add(btnNewButton_1_1_3);

		JButton btnFile_4 = new JButton("File");
		btnFile_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnFile_4.setForeground(Color.GRAY);
		btnFile_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFile_4.setBackground(Color.RED);
		btnFile_4.setBounds(0, 345, 896, 32);
		panel_4.add(btnFile_4);

		JLabel lblInputFile_4 = new JLabel("Input file\r\n");
		lblInputFile_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputFile_4.setBounds(0, 402, 81, 32);
		panel_4.add(lblInputFile_4);

		JLabel lblNewLabel_2_2_3 = new JLabel("Key file");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2_3.setBounds(0, 465, 81, 32);
		panel_4.add(lblNewLabel_2_2_3);

		JLabel lblNewLabel_2_3_4 = new JLabel("Encrypt");
		lblNewLabel_2_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_4.setBounds(0, 547, 81, 32);
		panel_4.add(lblNewLabel_2_3_4);

		JButton btnNewButton_1_2_6 = new JButton("File");
		btnNewButton_1_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_42);
			}
		});
		btnNewButton_1_2_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_6.setBounds(358, 413, 71, 32);
		panel_4.add(btnNewButton_1_2_6);

		JButton btnNewButton_1_3_3 = new JButton("File");
		btnNewButton_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_60);
			}
		});
		btnNewButton_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3_3.setBounds(358, 471, 71, 32);
		panel_4.add(btnNewButton_1_3_3);

		JButton btnNewButton_3_5 = new JButton("Start");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptDESFile();
			}
		});
		btnNewButton_3_5.setForeground(new Color(255, 255, 255));
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_5.setBackground(Color.BLUE);
		btnNewButton_3_5.setBounds(114, 620, 96, 32);
		panel_4.add(btnNewButton_3_5);

		JButton btnNewButton_1_4_5 = new JButton("Reset");
		btnNewButton_1_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_5.setBounds(252, 620, 96, 32);
		panel_4.add(btnNewButton_1_4_5);

		JLabel lblNewLabel_5_1_3 = new JLabel("Input file");
		lblNewLabel_5_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1_3.setBounds(481, 402, 81, 32);
		panel_4.add(lblNewLabel_5_1_3);

		JLabel lblNewLabel_5_2_3 = new JLabel("Key file");
		lblNewLabel_5_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2_3.setBounds(481, 465, 81, 32);
		panel_4.add(lblNewLabel_5_2_3);

		JLabel lblNewLabel_5_3_3 = new JLabel("Decrypt");
		lblNewLabel_5_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3_3.setBounds(481, 547, 81, 32);
		panel_4.add(lblNewLabel_5_3_3);

		JButton btnNewButton_3_1_3 = new JButton("Start");
		btnNewButton_3_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptDESFile();
			}
		});
		btnNewButton_3_1_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_1_3.setBackground(Color.BLUE);
		btnNewButton_3_1_3.setBounds(590, 628, 96, 32);
		panel_4.add(btnNewButton_3_1_3);

		JButton btnNewButton_1_4_1_3 = new JButton("Reset");
		btnNewButton_1_4_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_1_3.setBounds(722, 628, 96, 32);
		panel_4.add(btnNewButton_1_4_1_3);

		JButton btnNewButton_1_2_1_3 = new JButton("File");
		btnNewButton_1_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_43);
			}
		});
		btnNewButton_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_1_3.setBounds(825, 402, 71, 32);
		panel_4.add(btnNewButton_1_2_1_3);

		JButton btnNewButton_1_2_2_3 = new JButton("File");
		btnNewButton_1_2_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_61);
			}
		});
		btnNewButton_1_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_2_3.setBounds(825, 465, 71, 32);
		panel_4.add(btnNewButton_1_2_2_3);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(114, 72, 234, 41);
		panel_4.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(584, 72, 234, 41);
		panel_4.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(114, 411, 234, 41);
		panel_4.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(584, 393, 234, 41);
		panel_4.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(114, 547, 234, 65);
		panel_4.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setColumns(10);
		textField_45.setBounds(584, 547, 234, 65);
		panel_4.add(textField_45);

		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(114, 140, 234, 32);
		panel_4.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(584, 140, 234, 32);
		panel_4.add(textField_59);

		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(114, 474, 234, 32);
		panel_4.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(584, 465, 234, 32);
		panel_4.add(textField_61);

		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(114, 197, 234, 65);
		panel_4.add(textField_62);

		textField_63 = new JTextField();
		textField_63.setEditable(false);
		textField_63.setColumns(10);
		textField_63.setBounds(590, 197, 234, 65);
		panel_4.add(textField_63);

		JButton btnNewButton_1_3_3_1 = new JButton("Save");
		btnNewButton_1_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String com1 = ((ActionEvent) e).getActionCommand();

				if (!com1.equals("File")) {
					JFileChooser j1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
					int sh = j1.showSaveDialog(null);
					if (sh == JFileChooser.APPROVE_OPTION) {
						save(j1.getSelectedFile().getAbsolutePath(), textField_44);
					}

				}

			}
		});
		btnNewButton_1_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3_3_1.setBounds(358, 569, 71, 32);
		panel_4.add(btnNewButton_1_3_3_1);
//RSA		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane.addTab("RSA", null, panel_5, null);

		JLabel lblNewLabel_9 = new JLabel("Input text");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(0, 72, 81, 32);
		panel_5.add(lblNewLabel_9);

		JLabel lblNewLabel_1_5 = new JLabel("MÃ HOÁ BẤT ĐỐI XỨNG");
		lblNewLabel_1_5.setForeground(Color.RED);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(0, 0, 237, 32);
		panel_5.add(lblNewLabel_1_5);

		JLabel lblNewLabel_3_6 = new JLabel("Encrypt");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_6.setBounds(0, 150, 71, 24);
		panel_5.add(lblNewLabel_3_6);

		JButton btnNewButton_8 = new JButton("Start");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptRSA();
			}
		});
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_8.setBackground(Color.BLUE);
		btnNewButton_8.setBounds(114, 232, 96, 32);
		panel_5.add(btnNewButton_8);

		JButton btnNewButton_1_9 = new JButton("Reset");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_9.setBounds(232, 232, 96, 32);
		panel_5.add(btnNewButton_1_9);

		JButton btnString_5 = new JButton("String");
		btnString_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnString_5.setForeground(Color.GRAY);
		btnString_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnString_5.setBackground(Color.RED);
		btnString_5.setBounds(0, 30, 908, 32);
		panel_5.add(btnString_5);

		JLabel lblNewLabel_4_4 = new JLabel("Input text");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_4.setBounds(481, 72, 81, 32);
		panel_5.add(lblNewLabel_4_4);

		JLabel lblNewLabel_3_1_4 = new JLabel("Decrypt");
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_4.setBounds(491, 150, 71, 24);
		panel_5.add(lblNewLabel_3_1_4);

		JButton btnNewButton_2_4 = new JButton("Start");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptRSA();
			}
		});
		btnNewButton_2_4.setForeground(new Color(255, 255, 255));
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_4.setBackground(Color.BLUE);
		btnNewButton_2_4.setBounds(590, 232, 96, 32);
		panel_5.add(btnNewButton_2_4);

		JButton btnNewButton_1_1_4 = new JButton("Reset");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_4.setBounds(709, 232, 96, 32);
		panel_5.add(btnNewButton_1_1_4);

		JButton btnFile_5 = new JButton("File");
		btnFile_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnFile_5.setForeground(Color.GRAY);
		btnFile_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFile_5.setBackground(Color.RED);
		btnFile_5.setBounds(0, 345, 908, 32);
		panel_5.add(btnFile_5);

		JLabel lblInputFile_5 = new JLabel("Input file\r\n");
		lblInputFile_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputFile_5.setBounds(0, 402, 81, 32);
		panel_5.add(lblInputFile_5);

		JLabel lblNewLabel_2_3_5 = new JLabel("Encrypt");
		lblNewLabel_2_3_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_5.setBounds(0, 492, 81, 32);
		panel_5.add(lblNewLabel_2_3_5);

		JButton btnNewButton_1_2_7 = new JButton("File");
		btnNewButton_1_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_54);
			}
		});
		btnNewButton_1_2_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_7.setBounds(356, 402, 71, 32);
		panel_5.add(btnNewButton_1_2_7);

		JButton btnNewButton_3_6 = new JButton("Start");
		btnNewButton_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptRSAFile();
			}
		});
		btnNewButton_3_6.setForeground(new Color(255, 255, 255));
		btnNewButton_3_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_6.setBackground(Color.BLUE);
		btnNewButton_3_6.setBounds(114, 578, 96, 32);
		panel_5.add(btnNewButton_3_6);

		JButton btnNewButton_1_4_6 = new JButton("Reset");
		btnNewButton_1_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_6.setBounds(232, 578, 96, 32);
		panel_5.add(btnNewButton_1_4_6);

		JLabel lblNewLabel_5_1_4 = new JLabel("Input file");
		lblNewLabel_5_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1_4.setBounds(481, 402, 81, 32);
		panel_5.add(lblNewLabel_5_1_4);

		JLabel lblNewLabel_5_3_4 = new JLabel("Decrypt");
		lblNewLabel_5_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3_4.setBounds(481, 492, 81, 32);
		panel_5.add(lblNewLabel_5_3_4);

		JButton btnNewButton_3_1_4 = new JButton("Start");
		btnNewButton_3_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptRSAFile();
			}
		});
		btnNewButton_3_1_4.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_1_4.setBackground(Color.BLUE);
		btnNewButton_3_1_4.setBounds(590, 578, 96, 32);
		panel_5.add(btnNewButton_3_1_4);

		JButton btnNewButton_1_4_1_4 = new JButton("Reset");
		btnNewButton_1_4_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_1_4.setBounds(709, 578, 96, 32);
		panel_5.add(btnNewButton_1_4_1_4);

		JButton btnNewButton_1_2_1_4 = new JButton("File");
		btnNewButton_1_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile(e, textField_55);
			}
		});
		btnNewButton_1_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_1_4.setBounds(825, 402, 71, 32);
		panel_5.add(btnNewButton_1_2_1_4);

		JButton btnNewButton_1_1_4_1 = new JButton("Generate Keypair");
		btnNewButton_1_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new GenerateKeys(1024).generateKeysToFile();
				} catch (NoSuchAlgorithmException | NoSuchProviderException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1_4_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_4_1.setBounds(365, 271, 173, 32);
		panel_5.add(btnNewButton_1_1_4_1);

		JButton btnNewButton_1_1_4_1_1 = new JButton("Generate Keypair");
		btnNewButton_1_1_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new GenerateKeys(1024).generateKeysToFile();
				} catch (NoSuchAlgorithmException | NoSuchProviderException e1) {
					e1.printStackTrace();
				}
			}

		});
		btnNewButton_1_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_4_1_1.setBackground(Color.YELLOW);
		btnNewButton_1_1_4_1_1.setBounds(365, 619, 173, 32);
		panel_5.add(btnNewButton_1_1_4_1_1);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setViewportBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_4.setBounds(114, 150, 234, 65);
		panel_5.add(scrollPane_4);

		textField_46 = new JTextField();
		textField_46.setHorizontalAlignment(SwingConstants.LEFT);
		textField_46.setForeground(Color.DARK_GRAY);
		scrollPane_4.setViewportView(textField_46);
		textField_46.setBackground(new Color(192, 192, 192));
		textField_46.setColumns(10);

		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setHorizontalAlignment(SwingConstants.LEFT);
		textField_47.setFont(new Font("Dialog", Font.BOLD, 14));
		textField_47.setForeground(new Color(0, 0, 0));
		textField_47.setBackground(new Color(192, 192, 192));
		textField_47.setColumns(10);
		textField_47.setBounds(590, 150, 234, 65);
		panel_5.add(textField_47);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_6.setEnabled(false);
		scrollPane_6.setBounds(114, 501, 234, 65);
		panel_5.add(scrollPane_6);

		textField_48 = new JTextField();
		scrollPane_6.setViewportView(textField_48);

		textField_48.setForeground(Color.BLACK);
		textField_48.setBackground(new Color(192, 192, 192));
		textField_48.setColumns(10);

		textField_49 = new JTextField();
		textField_49.setFont(new Font("Dialog", Font.BOLD, 14));
		textField_49.setEditable(false);
		textField_49.setForeground(new Color(0, 0, 0));
		textField_49.setBackground(new Color(192, 192, 192));
		textField_49.setColumns(10);
		textField_49.setBounds(590, 501, 234, 65);
		panel_5.add(textField_49);

		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(111, 81, 234, 41);
		panel_5.add(textField_52);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(590, 72, 234, 41);
		panel_5.add(scrollPane_5);

		textField_53 = new JTextField();
		textField_53.setForeground(Color.DARK_GRAY);
		scrollPane_5.setViewportView(textField_53);
		textField_53.setColumns(10);

		textField_54 = new JTextField();
		textField_54.setForeground(Color.DARK_GRAY);
		textField_54.setColumns(10);
		textField_54.setBounds(114, 400, 234, 41);
		panel_5.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setForeground(Color.DARK_GRAY);
		textField_55.setColumns(10);
		textField_55.setBounds(590, 400, 234, 41);
		panel_5.add(textField_55);

		JButton btnNewButton_1_2_7_1 = new JButton("Save");
		btnNewButton_1_2_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFile(e, textField_48);
			}
		});
		btnNewButton_1_2_7_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_7_1.setBounds(356, 523, 71, 32);
		panel_5.add(btnNewButton_1_2_7_1);
//MD5	
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		tabbedPane.addTab("MD5", null, panel_3_1, null);

		JLabel lblNewLabel_7_1 = new JLabel("Input text");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_1.setBounds(0, 72, 81, 32);
		panel_3_1.add(lblNewLabel_7_1);

		JLabel lblNewLabel_1_3_1 = new JLabel("Hasing");
		lblNewLabel_1_3_1.setForeground(Color.RED);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3_1.setBounds(0, 0, 237, 32);
		panel_3_1.add(lblNewLabel_1_3_1);

		JLabel lblNewLabel_3_4_1 = new JLabel("Output Text");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4_1.setBounds(0, 173, 104, 24);
		panel_3_1.add(lblNewLabel_3_4_1);

		JButton btnNewButton_6_1 = new JButton("Start");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField_56.getText();
				String result = MD5.getMD5(input);
				textField_50.setText(result);
			}
		});
		btnNewButton_6_1.setForeground(new Color(255, 255, 255));
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6_1.setBackground(Color.BLUE);
		btnNewButton_6_1.setBounds(144, 241, 96, 32);
		panel_3_1.add(btnNewButton_6_1);

		JButton btnNewButton_1_7_1 = new JButton("Reset");
		btnNewButton_1_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_7_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_7_1.setBounds(278, 241, 96, 32);
		panel_3_1.add(btnNewButton_1_7_1);

		JButton btnString_3_1 = new JButton("String");
		btnString_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnString_3_1.setForeground(Color.GRAY);
		btnString_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnString_3_1.setBackground(Color.RED);
		btnString_3_1.setBounds(0, 30, 906, 32);
		panel_3_1.add(btnString_3_1);

		JButton btnFile_3_1 = new JButton("File");
		btnFile_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnFile_3_1.setForeground(Color.GRAY);
		btnFile_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFile_3_1.setBackground(Color.RED);
		btnFile_3_1.setBounds(0, 345, 906, 32);
		panel_3_1.add(btnFile_3_1);

		JLabel lblInputFile_3_1 = new JLabel("Input file\r\n");
		lblInputFile_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputFile_3_1.setBounds(0, 402, 81, 32);
		panel_3_1.add(lblInputFile_3_1);

		JLabel lblNewLabel_2_3_3_1 = new JLabel("Output File");
		lblNewLabel_2_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_3_1.setBounds(0, 489, 104, 32);
		panel_3_1.add(lblNewLabel_2_3_3_1);

		JButton btnNewButton_1_2_5_1 = new JButton("File");
		btnNewButton_1_2_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int status = fileChooser.showOpenDialog(null);
				if (status == JFileChooser.APPROVE_OPTION) {
					file = fileChooser.getSelectedFile();
					textField_57.setText(file.getAbsolutePath());
				}
			}
		});
		btnNewButton_1_2_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2_5_1.setBounds(385, 402, 71, 32);
		panel_3_1.add(btnNewButton_1_2_5_1);

		JButton btnNewButton_3_4_1 = new JButton("Start");
		btnNewButton_3_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result1 = MD5.getMD5(file);
				textField_51.setText(result1);
			}
		});
		btnNewButton_3_4_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_4_1.setBackground(Color.BLUE);
		btnNewButton_3_4_1.setBounds(144, 595, 96, 32);
		panel_3_1.add(btnNewButton_3_4_1);

		JButton btnNewButton_1_4_4_1 = new JButton("Reset");
		btnNewButton_1_4_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_1_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4_4_1.setBounds(278, 595, 96, 32);
		panel_3_1.add(btnNewButton_1_4_4_1);

		textField_50 = new JTextField();
		textField_50.setEditable(false);
		textField_50.setBackground(new Color(192, 192, 192));
		textField_50.setColumns(10);
		textField_50.setBounds(144, 166, 234, 65);
		panel_3_1.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setEditable(false);
		textField_51.setBackground(new Color(192, 192, 192));
		textField_51.setColumns(10);
		textField_51.setBounds(140, 480, 234, 65);
		panel_3_1.add(textField_51);

		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(144, 72, 234, 41);
		panel_3_1.add(textField_56);

		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(140, 393, 234, 41);
		panel_3_1.add(textField_57);
	}

	public void reset() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_7.setText("");
		textField_6.setText("");
		textField_8.setText("");
		textField_9.setText("");
		textField_10.setText("");
		textField_11.setText("");
		textField_12.setText("");
		textField_13.setText("");
		textField_14.setText("");
		textField_15.setText("");
		textField_16.setText("");
		textField_17.setText("");
		textField_18.setText("");
		textField_19.setText("");
		textField_20.setText("");
		textField_21.setText("");
		textField_22.setText("");
		textField_23.setText("");
		textField_24.setText("");
		textField_25.setText("");
		textField_26.setText("");
		textField_27.setText("");
		textField_28.setText("");
		textField_29.setText("");
		textField_30.setText("");
		textField_31.setText("");
		textField_32.setText("");
		textField_33.setText("");
		textField_34.setText("");
		textField_35.setText("");
		textField_36.setText("");
		textField_37.setText("");
		textField_38.setText("");
		textField_39.setText("");
		textField_40.setText("");
		textField_41.setText("");
		textField_42.setText("");
		textField_43.setText("");
		textField_44.setText("");
		textField_45.setText("");
		textField_46.setText("");
		textField_47.setText("");
		textField_48.setText("");
		textField_49.setText("");
		textField_50.setText("");
		textField_51.setText("");
		textField_52.setText("");
		textField_53.setText("");
		textField_54.setText("");
		textField_55.setText("");
		textField_56.setText("");
		textField_57.setText("");
		textField_58.setText("");
		textField_59.setText("");
		textField_60.setText("");
		textField_61.setText("");
		textField_62.setText("");
		textField_63.setText("");
		textField_64.setText("");
		textField_65.setText("");
		textField_66.setText("");
		textField_67.setText("");
		textField_68.setText("");
		textField_69.setText("");
		textField_70.setText("");
		textField_71.setText("");
		textField_72.setText("");
		textField_73.setText("");
		textField_74.setText("");
		textField_75.setText("");

	}

	public void saveFile(ActionEvent e, JTextField jt1) {

		String com = ((ActionEvent) e).getActionCommand();

		if (com.equals("Save")) {
			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			int sh = j.showSaveDialog(null);
			if (sh == JFileChooser.APPROVE_OPTION) {
				save(j.getSelectedFile().getAbsolutePath(), jt1);
			}
		}
//		} else {
//			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
//			int re = j.showOpenDialog(null);
//			if (re == JFileChooser.APPROVE_OPTION) {
//				read(j.getSelectedFile(), jt1);
//			}
//		}
	}

	public void openFile(ActionEvent e, JTextField jt1) {
		JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		int rea = j.showOpenDialog(null);
		if (rea == JFileChooser.APPROVE_OPTION) {
			read(j.getSelectedFile(), jt1);
		}
	}

	public void read(File file, JTextField textfield) {
		if (file.getName().endsWith(".txt")) {
			try {
				List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
				String result = "";
				for (String line : allText) {
					result += line;
					result += "\n";
				}
				textfield.setText(result);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(frame, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void save(String fileName, JTextField jt) {
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = textField_48.getText();
			pw.print(data);
			pw.flush();
			pw.close();
			JOptionPane.showMessageDialog(frame, "Lưu file thành công \n" + new File(fileName).getAbsolutePath(),
					"Thành công", JOptionPane.INFORMATION_MESSAGE);
		} catch (FileNotFoundException f) {
			JOptionPane.showMessageDialog(frame, "Đường dẫn file không hợp lệ \n" + f.getMessage(), "Lỗi đường dẫn",
					JOptionPane.ERROR_MESSAGE);
		} catch (UnsupportedEncodingException u) {
			JOptionPane.showMessageDialog(frame, "Lỗi không hỗ trợ encoding \n" + u.getMessage(), "Lỗi encoding",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void encryptRSA() {
		try {
			String str = textField_52.getText();
			PublicKey publicKey = RSA.getPublicKey();

			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);

			byte[] byteEncrypted = cipher.doFinal(str.getBytes());
			String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
			textField_46.setText(encrypted);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void decryptRSA() {
		try {
			String encryptText = textField_53.getText();
			PrivateKey privateKey = RSA.getPrivateKey();

			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, privateKey);

			byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptText));
			textField_47.setText(new String(decrypted));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void encryptRSAFile() {
		try {
			String str2 = textField_54.getText();
			PublicKey publicKey = RSA.getPublicKey();

			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);

			byte[] byteEncrypted = cipher.doFinal(str2.getBytes());
			String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
			textField_48.setText(encrypted);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void decryptRSAFile() {
		try {
			String encryptText1 = textField_55.getText();
			PrivateKey privateKey1 = RSA.getPrivateKey();

			Cipher cipher1 = Cipher.getInstance("RSA");
			cipher1.init(Cipher.DECRYPT_MODE, privateKey1);

			byte[] decrypted1 = cipher1.doFinal(Base64.getDecoder().decode(encryptText1));
			textField_49.setText(new String(decrypted1));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void encryptCaesar() {
		try {
			String st = textField.getText();
			int key1 = Integer.parseInt(textField_1.getText());
			String alpha = "aăâbcdđeêghiklmnoôơpqrstuưvxy";

			st = st.toLowerCase();
			String cipherText = "";
			for (int ii = 0; ii < st.length(); ii++) {
				int charPosition = alpha.indexOf(st.charAt(ii));
				int keyVal = (key1 + charPosition) % 29;
				char replaceVal = alpha.charAt(keyVal);
				cipherText += replaceVal;
			}
			textField_2.setText(cipherText);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void decryptCaesar() {
		try {
			String st = textField_5.getText();
			int key = Integer.parseInt(textField_4.getText());
			String alp = "aăâbcdđeêghiklmnoôơpqrstuưvxy";

			String res = "";

			st = st.toLowerCase();

			for (int x = 0; x < st.length(); x++) {
				int charPosition = alp.indexOf(st.charAt(x));
				int keyVal = (charPosition - key) % 29;
				if (keyVal < 0) {
					keyVal = alp.length() + keyVal;
				}
				char replaceVal = alp.charAt(keyVal);
				res += replaceVal;
			}
			textField_3.setText(res);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void encryptCaesarFile() {
		try {
			String st1 = textField_8.getText();
			int key12 = Integer.parseInt(textField_7.getText());
			String alpha = "aăâbcdđeêghiklmnoôơpqrstuưvxy";

			st1 = st1.toLowerCase();
			String cipherText = "";
			for (int ii = 0; ii < st1.length(); ii++) {
				int charPosition = alpha.indexOf(st1.charAt(ii));
				int keyVal = (key12 + charPosition) % 29;
				char replaceVal = alpha.charAt(keyVal);
				cipherText += replaceVal;
			}
			textField_6.setText(cipherText);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void decryptCaesarFile() {
		try {
			String str = textField_11.getText();
			int key13 = Integer.parseInt(textField_10.getText());
			String alp = "aăâbcdđeêghiklmnoôơpqrstuưvxy";

			String res = "";

			str = str.toLowerCase();

			for (int x = 0; x < str.length(); x++) {
				int charPosition = alp.indexOf(str.charAt(x));
				int keyVal = (charPosition - key13) % 29;
				if (keyVal < 0) {
					keyVal = alp.length() + keyVal;
				}
				char replaceVal = alp.charAt(keyVal);
				res += replaceVal;
			}
			textField_9.setText(res);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void encryptDES() {
		try {
			String st = textField_40.getText();
			String key = textField_58.getText();
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "DES");
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
			byte[] byteEncrypted = cipher.doFinal(st.getBytes());
			String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
			textField_62.setText(encrypted);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void decryptDES() {
		try {
			String encryptText = textField_41.getText();
			String key2 = textField_59.getText();
			SecretKeySpec skeySpec = new SecretKeySpec(key2.getBytes(), "DES");
			Cipher cipher2 = Cipher.getInstance("DES/ECB/PKCS5PADDING");
			cipher2.init(Cipher.DECRYPT_MODE, skeySpec);
			byte[] decrypted = cipher2.doFinal(Base64.getDecoder().decode(encryptText));
			textField_63.setText(new String(decrypted));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void encryptDESFile() {
		try {
			String st1 = textField_42.getText();
			String key1 = textField_60.getText();
			SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes(), "DES");
			Cipher cipher1 = Cipher.getInstance("DES/ECB/PKCS5PADDING");
			cipher1.init(Cipher.ENCRYPT_MODE, skeySpec);
			byte[] byteEncrypted = cipher1.doFinal(st1.getBytes());
			String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
			textField_44.setText(encrypted);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void decryptDESFile() {

		try {
			String encryptText3 = textField_43.getText();
			String key3 = textField_61.getText();
			SecretKeySpec skeySpec = new SecretKeySpec(key3.getBytes(), "DES");
			Cipher cipher3 = Cipher.getInstance("DES/ECB/PKCS5PADDING");
			cipher3.init(Cipher.DECRYPT_MODE, skeySpec);
			byte[] decrypted = cipher3.doFinal(Base64.getDecoder().decode(encryptText3));
			textField_45.setText(new String(decrypted));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void encryptHill() {
		String stg1 = textField_14.getText();
		String keym1 = textField_13.getText();
		stg1 = stg1.replaceAll("\\s", "");
		stg1 = stg1.toUpperCase();
		keym1 = keym1.replaceAll("\\s", "");
		keym1 = keym1.toUpperCase();
// if irregular length, then perform padding
		int lenChk = 0;
		if (stg1.length() % 2 != 0) {
			stg1 += "0";
			lenChk = 1;
		}
// message to matrices
		int[][] msg2D = new int[2][stg1.length()];
		int itr1 = 0;
		int itr2 = 0;
		for (int i = 0; i < stg1.length(); i++) {
			if (i % 2 == 0) {
				msg2D[0][itr1] = ((int) stg1.charAt(i)) - 65;
				itr1++;
			} else {
				msg2D[1][itr2] = ((int) stg1.charAt(i)) - 65;
				itr2++;
			} // if-else
		} // for
			// key to 2x2 matrix

		int[][] key2D = new int[2][2];
		int itr3 = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				key2D[i][j] = (int) keym1.charAt(itr3) - 65;
				itr3++;
			}
		}
		// validating the key
		// finding determinant of key matrix

		int deter = key2D[0][0] * key2D[1][1] - key2D[0][1] * key2D[1][0];
		deter = moduloFunc(deter, 26);

		// multiplicative inverse of key matrix
		int mulInverse = -1;
		for (int i = 0; i < 26; i++) {
			int tempInv = deter * i;
			if (moduloFunc(tempInv, 26) == 1) {
				mulInverse = i;
				break;
			} else {
				continue;
			} // if-else
		} // for
		try {
			if (mulInverse == -1)
				;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "Khoá Key sai", JOptionPane.ERROR_MESSAGE);
		}

		String encrypText = "";
		int itrCount = stg1.length() / 2;
		if (lenChk == 0) {
			// if stg1 length % 2 = 0
			for (int i = 0; i < itrCount; i++) {
				int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
				encrypText += (char) ((temp1 % 26) + 65);
				int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
				encrypText += (char) ((temp2 % 26) + 65);
			}
		} else {
			// if stg1 length % 2 != 0 (irregular length stg1)
			for (int i = 0; i < itrCount - 1; i++) {
				int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
				encrypText += (char) ((temp1 % 26) + 65);
				int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
				encrypText += (char) ((temp2 % 26) + 65);
			}
		}
		textField_16.setText(encrypText);
	}
		
	public void encryptHillFile() {
		String stg1 = textField_21.getText();
		String keym1 = textField_20.getText();
		stg1 = stg1.replaceAll("\\s", "");
		stg1 = stg1.toUpperCase();
		keym1 = keym1.replaceAll("\\s", "");
		keym1 = keym1.toUpperCase();
// if irregular length, then perform padding
		int lenChk = 0;
		if (stg1.length() % 2 != 0) {
			stg1 += "0";
			lenChk = 1;
		}
// message to matrices
		int[][] msg2D = new int[2][stg1.length()];
		int itr1 = 0;
		int itr2 = 0;
		for (int i = 0; i < stg1.length(); i++) {
			if (i % 2 == 0) {
				msg2D[0][itr1] = ((int) stg1.charAt(i)) - 65;
				itr1++;
			} else {
				msg2D[1][itr2] = ((int) stg1.charAt(i)) - 65;
				itr2++;
			} // if-else
		} // for
			// key to 2x2 matrix

		int[][] key2D = new int[2][2];
		int itr3 = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				key2D[i][j] = (int) keym1.charAt(itr3) - 65;
				itr3++;
			}
		}
		// validating the key
		// finding determinant of key matrix

		int deter = key2D[0][0] * key2D[1][1] - key2D[0][1] * key2D[1][0];
		deter = moduloFunc(deter, 26);

		// multiplicative inverse of key matrix
		int mulInverse = -1;
		for (int i = 0; i < 26; i++) {
			int tempInv = deter * i;
			if (moduloFunc(tempInv, 26) == 1) {
				mulInverse = i;
				break;
			} else {
				continue;
			} // if-else
		} // for
		try {
			if (mulInverse == -1)
				;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "Khoá Key sai", JOptionPane.ERROR_MESSAGE);
		}

		String encrypText = "";
		int itrCount = stg1.length() / 2;
		if (lenChk == 0) {
			// if stg1 length % 2 = 0
			for (int i = 0; i < itrCount; i++) {
				int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
				encrypText += (char) ((temp1 % 26) + 65);
				int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
				encrypText += (char) ((temp2 % 26) + 65);
			}
		} else {
			// if stg1 length % 2 != 0 (irregular length stg1)
			for (int i = 0; i < itrCount - 1; i++) {
				int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
				encrypText += (char) ((temp1 % 26) + 65);
				int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
				encrypText += (char) ((temp2 % 26) + 65);
			}
		}
		textField_18.setText(encrypText);
	}
	
	public void decryptHill() {
		String str1 = textField_12.getText();
		String keym = textField_15.getText();
		str1 = str1.replaceAll("\\s", "");
		str1 = str1.toUpperCase();
		keym = keym.replaceAll("\\s", "");
		keym = keym.toUpperCase();
//check string input	
		int lenChk = 0;
		if (str1.length() % 2 != 0) {
			str1 += "0";
			lenChk = 1;
		}
//matrixx
		int[][] msg2D = new int[2][str1.length()];
		int itr1 = 0;
		int itr2 = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (i % 2 == 0) {
				msg2D[0][itr1] = ((int) str1.charAt(i)) - 65;
				itr1++;
			} else {
				msg2D[1][itr2] = ((int) str1.charAt(i)) - 65;
				itr2++;
			} // if-else
		} // for
// key to 2x2 matrix
		int[][] key2D = new int[2][2];
		int itr3 = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				key2D[i][j] = (int) keym.charAt(itr3) - 65;
				itr3++;
			}
		}
// validating the key
// finding determinant of key matrix
		int deter = key2D[0][0] * key2D[1][1] - key2D[0][1] * key2D[1][0];
		deter = moduloFunc(deter, 26);
// multiplicative inverse of key matrix
		int mulInverse = -1;
		for (int i = 0; i < 26; i++) {
			int tempInv = deter * i;
			if (moduloFunc(tempInv, 26) == 1) {
				mulInverse = i;
				break;
			} else {
				continue;
			} // if-else
		} // for
// swapping
		int swapTemp = key2D[0][0];
		key2D[0][0] = key2D[1][1];
		key2D[1][1] = swapTemp;
// changing signs
		key2D[0][1] *= -1;
		key2D[1][0] *= -1;
		key2D[0][1] = moduloFunc(key2D[0][1], 26);
		key2D[1][0] = moduloFunc(key2D[1][0], 26);
		// multiplying multiplicative inverse with matrix
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				key2D[i][j] *= mulInverse;
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				key2D[i][j] = moduloFunc(key2D[i][j], 26);
			}
		}
		String decrypt = "";
		int itrCount = str1.length() / 2;
		if (lenChk == 0) {
			// if str1 length % 2 = 0
			for (int i = 0; i < itrCount; i++) {
				int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
				decrypt += (char) ((temp1 % 26) + 65);
				int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
				decrypt += (char) ((temp2 % 26) + 65);
			}
		} else {
			// if str1 length % 2 != 0 (irregular length str1)
			for (int i = 0; i < itrCount - 1; i++) {
				int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
				decrypt += (char) ((temp1 % 26) + 65);
				int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
				decrypt += (char) ((temp2 % 26) + 65);
			}
		}
		textField_17.setText(decrypt);
	}
	public void decryptHillFile() {
		String str1 = textField_23.getText();
		String keym = textField_22.getText();
		str1 = str1.replaceAll("\\s", "");
		str1 = str1.toUpperCase();
		keym = keym.replaceAll("\\s", "");
		keym = keym.toUpperCase();
//check string input	
		int lenChk = 0;
		if (str1.length() % 2 != 0) {
			str1 += "0";
			lenChk = 1;
		}
//matrixx
		int[][] msg2D = new int[2][str1.length()];
		int itr1 = 0;
		int itr2 = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (i % 2 == 0) {
				msg2D[0][itr1] = ((int) str1.charAt(i)) - 65;
				itr1++;
			} else {
				msg2D[1][itr2] = ((int) str1.charAt(i)) - 65;
				itr2++;
			} // if-else
		} // for
// key to 2x2 matrix
		int[][] key2D = new int[2][2];
		int itr3 = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				key2D[i][j] = (int) keym.charAt(itr3) - 65;
				itr3++;
			}
		}
// validating the key
// finding determinant of key matrix
		int deter = key2D[0][0] * key2D[1][1] - key2D[0][1] * key2D[1][0];
		deter = moduloFunc(deter, 26);
// multiplicative inverse of key matrix
		int mulInverse = -1;
		for (int i = 0; i < 26; i++) {
			int tempInv = deter * i;
			if (moduloFunc(tempInv, 26) == 1) {
				mulInverse = i;
				break;
			} else {
				continue;
			} // if-else
		} // for
// swapping
		int swapTemp = key2D[0][0];
		key2D[0][0] = key2D[1][1];
		key2D[1][1] = swapTemp;
// changing signs
		key2D[0][1] *= -1;
		key2D[1][0] *= -1;
		key2D[0][1] = moduloFunc(key2D[0][1], 26);
		key2D[1][0] = moduloFunc(key2D[1][0], 26);
		// multiplying multiplicative inverse with matrix
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				key2D[i][j] *= mulInverse;
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				key2D[i][j] = moduloFunc(key2D[i][j], 26);
			}
		}
		String decrypt = "";
		int itrCount = str1.length() / 2;
		if (lenChk == 0) {
			// if str1 length % 2 = 0
			for (int i = 0; i < itrCount; i++) {
				int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
				decrypt += (char) ((temp1 % 26) + 65);
				int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
				decrypt += (char) ((temp2 % 26) + 65);
			}
		} else {
			// if str1 length % 2 != 0 (irregular length str1)
			for (int i = 0; i < itrCount - 1; i++) {
				int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
				decrypt += (char) ((temp1 % 26) + 65);
				int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
				decrypt += (char) ((temp2 % 26) + 65);
			}
		}
		textField_19.setText(decrypt);
	}
	private int moduloFunc(int a, int b) {
		int result = a % b;
		if (result < 0) {
			result += b;
		}
		return result;

	}

	public void encryptAffine() {
		String st = textField_24.getText();
		int keya = Integer.parseInt(textField_28.getText());
		int keyb = Integer.parseInt(textField_64.getText());
		String cipher = "";
		for (int i = 0; i < st.length(); i++) {
			cipher = cipher + (char) ((((keya * st.charAt(i)) + keyb) % 26) + 65);
		}
		textField_34.setText(cipher);
	}
	public void encryptAffineFile() {
		String st = textField_26.getText();
		int keya = Integer.parseInt(textField_30.getText());
		int keyb = Integer.parseInt(textField_66.getText());
		String cipher = "";
		for (int i = 0; i < st.length(); i++) {
			cipher = cipher + (char) ((((keya * st.charAt(i)) + keyb) % 26) + 65);
		}
		textField_32.setText(cipher);
	}
	public void decryptAffine() {
		String s1 = textField_25.getText();
		int keya = Integer.parseInt(textField_29.getText());
		int keyb = Integer.parseInt(textField_65.getText());
		String decryptText = "";

		int a_inv = 0;
		int flag = 0;
		for (int i = 0; i < 26; i++) {
			flag = (keya * i) % 26;
			if (flag == 1) {
				a_inv = i;
				System.out.println(i);
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			decryptText = decryptText + (char) (((a_inv * ((s1.charAt(i) - keyb)) % 26)) + 65);

		}
		textField_35.setText(decryptText);
	}
	public void decryptAffineFile() {
		String s1 = textField_27.getText();
		int keya = Integer.parseInt(textField_31.getText());
		int keyb = Integer.parseInt(textField_67.getText());
		String decryptText = "";

		int a_inv = 0;
		int flag = 0;
		for (int i = 0; i < 26; i++) {
			flag = (keya * i) % 26;
			if (flag == 1) {
				a_inv = i;
				System.out.println(i);
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			decryptText = decryptText + (char) (((a_inv * ((s1.charAt(i) - keyb)) % 26)) + 65);

		}
		textField_33.setText(decryptText);
	}
	public void encryptHoanVi() {
		String st = textField_36.getText();
		String key = textField_68.getText();
		HoanVi hv1 = new HoanVi();
		StringBuilder Cipher1 = null;
		Cipher1 = hv1.encryption(st, key); // method encryption
		String CipherS = Cipher1.toString();
		textField_38.setText(CipherS);
	}
	public void encryptHoanViFile() {
		String st = textField_37.getText();
		String key = textField_69.getText();
		HoanVi hv1 = new HoanVi();
		StringBuilder Cipher1 = null;
		Cipher1 = hv1.encryption(st, key); // method encryption
		String CipherS = Cipher1.toString();
		textField_39.setText(CipherS);
	}
	public void decryptHoanVi() {
		HoanVi hv = new HoanVi();
		String str = textField_70.getText();
		String key1 = textField_71.getText();
		StringBuilder decrypted = null;
		decrypted = hv.decryption(str, key1); // method decryption
		String decipher = decrypted.toString();
		textField_72.setText(decipher);
	}
	public void decryptHoanViFile() {
		HoanVi hv = new HoanVi();
		String str = textField_73.getText();
		String key1 = textField_74.getText();
		StringBuilder decrypted = null;
		decrypted = hv.decryption(str, key1); // method decryption
		String decipher = decrypted.toString();
		textField_75.setText(decipher);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
